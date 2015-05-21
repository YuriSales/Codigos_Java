package Codigos;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class GravarDadosTxt {

    public static void main(String[] args) throws IOException {

        try {

            Scanner leitor = new Scanner(System.in);
            int i, numero;

            System.out.println("Informe um número para a tabuada:");
            numero = leitor.nextInt();

            String usuario = System.getProperty("user.name");
            FileWriter arquivo = new FileWriter("C:/Users/" + usuario + "/Documents/ArquivosTxtJava", true);
            PrintWriter gravar_arquivo = new PrintWriter(arquivo);

            gravar_arquivo.printf("+--Resultado--+%n");

            for (i = 1; i <= 10; i++) {
                gravar_arquivo.printf("| %2d x %d = %2d |%n", i, numero, (i * numero));
            }

            gravar_arquivo.printf("+-------------+%n");
            arquivo.close();

            System.out.println("\nTabuada do %d foi gravada com sucesso!");

        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found!");

        } catch (IOException e) {
            System.out.println("Acesso negado!");
        }
    }
}
