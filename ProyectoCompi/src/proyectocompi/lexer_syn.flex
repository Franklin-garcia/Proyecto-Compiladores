package proyectocompi;
import java_cup.runtime.Symbol;

%%

%class Lexer_Syn
%unicode
%cup
%full
%line
%column
%caseless
%ignorecase
%type java_cup.runtime.Symbol
%state COMMENT
%state STRING

%{
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
%}

//Misc

letra = [a-zA-Z]
num = [0-9]
Caracteres="+"|"-"|"/"|"*"|">"|"<"|">="|"<="|"!="|"!"|"="|":"|";"|"."|","|"-"|"_"|"&"|"'"|"@"|"#"|"("|")"|"["|"]"|"{"|"}"|"^"|"%"|"?"
Espacio=[ \n\r\t]+
nums = {num}+
espacios = [ \r\t]
enter = (\n)+
parenizq = "("
parender = ")"
punto = "."
coma = ","
guionbajo = "_"
end = "End"
comment = "'"
sstring = \"
cadena=\"({letra}|{num}|{Espacio}|{Caracteres})*\"
boolean="true"|"false"

//Write y Read
write = "Console.WriteLine"
read = "Console.ReadLine"

//Operadores Aritmeticos
sumaresta = "+"|"-"
multdiv = "*"|"/"

//Operadores de Relacionales
igual = "="
oprel = "<"|"<="|">"|">="|"<>"
oprel2 = "~="|"=="

//Operadores de Concatenacion
amp = "&"

//Sentencia If
if = "If"
then = "Then"
else = "Else"
elseif = "ElseIf"
endif ="End If"

//Bucles
for = "For"
to = "To"
step = "Step"
next = "Next"
do = "Do"
while = "While"
loop = "Loop"

//Funciones y Procedimientos
//Functions
byval = "ByVal"
function = "Function"

//Sub Procedures
sub = "Sub"

//Structure
structure = "Structure"

//Module
module = "Module"

//Tipos de variable
bool = "Boolean"
integer = "Integer"
string = "String"

//Declaraciones de variables
dim = "Dim"
as = "As"

//Identificador de variables
id = {letra}+({num}|{letra}|{guionbajo})*

%%
<YYINITIAL> {
    {nums}          {return new Symbol (sym.Num, yycolumn, yyline, yytext());}
    {cadena}        {return new Symbol (sym.Cadena, yycolumn, yyline, yytext());}
    {boolean}       {return new Symbol (sym.Bool, yycolumn, yyline, yytext());}
    {enter}         {return new Symbol (sym.Newline, yycolumn, yyline, yytext());}
    {parenizq}      {return new Symbol (sym.Parizq, yycolumn, yyline, yytext());}
    {parender}      {return new Symbol (sym.Parder, yycolumn, yyline, yytext());}
    {coma}          {return new Symbol (sym.Coma, yycolumn, yyline, yytext());}
    {punto}         {return new Symbol (sym.Punto, yycolumn, yyline, yytext());}
    {end}           {return new Symbol (sym.End, yycolumn, yyline, yytext());}
    {comment}       {yybegin(COMMENT);}
    {sstring}       {yybegin(STRING);}

    {write}         {return new Symbol (sym.Write, yycolumn, yyline, yytext());}
    {read}          {return new Symbol (sym.Read, yycolumn, yyline, yytext());}

    {sumaresta}     {return new Symbol (sym.SumaResta, yycolumn, yyline, yytext());}
    {multdiv}       {return new Symbol (sym.MultDiv, yycolumn, yyline, yytext());}

    {igual}         {return new Symbol (sym.Igual, yycolumn, yyline, yytext());}
    {oprel}         {return new Symbol (sym.OpRel, yycolumn, yyline, yytext());}
    {oprel2}        {return new Symbol (sym.OpRel2, yycolumn, yyline, yytext());}

    {amp}           {return new Symbol (sym.Ampersand, yycolumn, yyline, yytext());}

    {if}            {return new Symbol (sym.If, yycolumn, yyline, yytext());}
    {then}          {return new Symbol (sym.Then, yycolumn, yyline, yytext());}
    {else}          {return new Symbol (sym.Else, yycolumn, yyline, yytext());}  
    {elseif}        {return new Symbol (sym.ElseIf, yycolumn, yyline, yytext());}
    {endif}         {return new Symbol (sym.EndIf, yycolumn, yyline, yytext());}

    {for}           {return new Symbol (sym.For, yycolumn, yyline, yytext());}       
    {to}            {return new Symbol (sym.To, yycolumn, yyline, yytext());}
    {step}          {return new Symbol (sym.Step, yycolumn, yyline, yytext());}
    {next}          {return new Symbol (sym.Next, yycolumn, yyline, yytext());}
    {do}            {return new Symbol (sym.Do, yycolumn, yyline, yytext());}
    {while}         {return new Symbol (sym.While, yycolumn, yyline, yytext());}
    {loop}          {return new Symbol (sym.Loop, yycolumn, yyline, yytext());}

    {byval}         {return new Symbol (sym.ByVal, yycolumn, yyline, yytext());}
    {function}      {return new Symbol (sym.Function, yycolumn, yyline, yytext());}   

    {sub}           {return new Symbol (sym.Sub, yycolumn, yyline, yytext());}

    {structure}     {return new Symbol (sym.Structure, yycolumn, yyline, yytext());}

    {module}        {return new Symbol (sym.Module, yycolumn, yyline, yytext());}

    {bool}          {return new Symbol (sym.TypeBoolean, yycolumn, yyline, yytext());}
    {integer}       {return new Symbol (sym.TypeInteger, yycolumn, yyline, yytext());}
    {string}        {return new Symbol (sym.TypeString, yycolumn, yyline, yytext());}

    {dim}           {return new Symbol (sym.Dim, yycolumn, yyline, yytext());}
    {as}            {return new Symbol (sym.As, yycolumn, yyline, yytext());}

    {id}            {return new Symbol (sym.Id, yycolumn, yyline, yytext());}
    
    {espacios}      {}
    .               {return new Symbol (sym.Error, yycolumn, yyline, yytext());}
}

<COMMENT> {
    {enter}         {yybegin(YYINITIAL);}
    .               {}
}

<STRING> {
    {sstring}       {yybegin(YYINITIAL);}
    [^\"]*          {return new Symbol (sym.ContString, yycolumn, yyline, yytext());}
}