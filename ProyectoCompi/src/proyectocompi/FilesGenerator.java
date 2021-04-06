package proyectocompi;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
//import java_cup.runtime.Symbol;

public class FilesGenerator {

    public static void main(String[] args) throws Exception {
        String lexer_path = "../ProyectoCompi/src/proyectocompi/lexer.flex";
        String lexercup_path = "../ProyectoCompi/src/proyectocompi/lexer_syn.flex";
        String[] rutaS = {"-parser", "Syntax", "../ProyectoCompi/src/proyectocompi/Syntax.cup"};
        generateFiles(lexer_path, lexercup_path, rutaS);
    }

    public static void generateFiles(String lexer_path, String lexercup_path, String[] rutaS) throws IOException, Exception {
        System.out.println("########## GENERACION DEL LEXER ##########");
        File archivo;
        archivo = new File(lexer_path);
        JFlex.Main.generate(archivo);

        System.out.println("########## GENERACION DEL LEXER_SYN ##########");
        archivo = new File(lexercup_path);
        JFlex.Main.generate(archivo);

        System.out.println("########## GENERACION DEL SYNTAX Y SYM ##########");
        java_cup.Main.main(rutaS);

        Path rutaSym = Paths.get("../ProyectoCompi/src/proyectocompi/sym.java");
        if (Files.exists(rutaSym)) {
            Files.delete(rutaSym);
        }
        Files.move(
                Paths.get("./sym.java"),
                Paths.get("../ProyectoCompi/src/proyectocompi/sym.java")
        );
        Path rutaSin = Paths.get("../ProyectoCompi/src/proyectocompi/Syntax.java");
        if (Files.exists(rutaSin)) {
            Files.delete(rutaSin);
        }
        Files.move(
                Paths.get("./Syntax.java"),
                Paths.get("../ProyectoCompi/src/proyectocompi/Syntax.java")
        );

    }
}
