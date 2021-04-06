package proyectocompi;
import static proyectocompi.Tokens.*;

%%

%class Lexer
%unicode
%line
%column
%caseless
%ignorecase
%type Tokens
%state COMMENT
%state STRING

%{
    public String lexema;
%}

//Misc
letra = [a-zA-Z]
num = [0-9]
nums = {num}+
espacios = [ \r\t]
enter = (\n)+
parenizq = "("
parender = ")"
coma = ","
guionbajo = "_"
end = "End"
comment = "'"
sstring = \"

//Write y Read
write = "Console.WriteLine"
read = "Console.ReadLine"

//Operadores Aritmeticos
sumaresta = ((\+)|(-))
multdiv = ((\*)|(\/))

//Operadores de Relacionales
igual = (=)
oprel = (<|<=|>|>=|<>)

//Operadores de Concatenacion
amp = (&)
//suma = (\+)

//Sentencia If
if = "If"
then = "Then"
else = "Else"
elseif = "ElseIf"

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
    {nums}          {lexema=yytext(); return Num;}
    {enter}         {return Newline;}
    {parenizq}      {lexema=yytext(); return Parizq;}
    {parender}      {lexema=yytext(); return Parder;}
    {coma}          {lexema=yytext(); return Coma;}
    {end}           {lexema=yytext(); return End;}
    {comment}       {yybegin(COMMENT);}
    {sstring}       {yybegin(STRING);}

    {write}         {lexema=yytext(); return Write;}
    {read}          {lexema=yytext(); return Read;}

    {sumaresta}     {lexema=yytext(); return SumaResta;}
    {multdiv}       {lexema=yytext(); return MultDiv;}

    {igual}         {lexema=yytext(); return Igual;}
    {oprel}         {lexema=yytext(); return OpRel;}

    {amp}           {lexema=yytext(); return Ampersand;}

    {if}            {lexema=yytext(); return If;}
    {then}          {lexema=yytext(); return Then;}
    {else}          {lexema=yytext(); return Else;}  
    {elseif}        {lexema=yytext(); return ElseIf;}

    {for}           {lexema=yytext(); return For;}       
    {to}            {lexema=yytext(); return To;}
    {step}          {lexema=yytext(); return Step;}
    {next}          {lexema=yytext(); return Next;}
    {do}            {lexema=yytext(); return Do;}
    {while}         {lexema=yytext(); return While;}
    {loop}          {lexema=yytext(); return Loop;}

    {byval}         {lexema=yytext(); return ByVal;}
    {function}      {lexema=yytext(); return Function;}   
   
    {sub}           {lexema=yytext(); return Sub;}

    {structure}     {lexema=yytext(); return Structure;}

    {module}        {lexema=yytext(); return Module;}

    {bool}          {lexema=yytext(); return TypeBoolean;}
    {integer}       {lexema=yytext(); return TypeInteger;}
    {string}        {lexema=yytext(); return TypeString;}

    {dim}           {lexema=yytext(); return Dim;}
    {as}            {lexema=yytext(); return As;}

    {id}            {lexema=yytext(); return Id;}
    
    {espacios}      {}
    .               {lexema=yytext(); return Error;}
}

<COMMENT> {
    {enter}         {yybegin(YYINITIAL);}
    .               {}
}

<STRING> {
    {sstring}       {yybegin(YYINITIAL);}
    [^\"]*          {lexema=yytext(); return ContString;}
}