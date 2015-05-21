package Codigos;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Scanner;

public class Hash {

    public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        Scanner leitor = new Scanner(System.in);

        try {
            String username = "yuri";
            String password = "queijo";

            MessageDigest algoritmo = MessageDigest.getInstance("MD5");
            byte messageDigest[] = algoritmo.digest(password.getBytes("UTF-8"));
            String md = Arrays.toString(messageDigest);

            System.out.println("senha criptografada: " + md);
            System.out.println(messageDigest);

            System.out.println("------------------------------------");

            System.out.print("Digite seu nome de usuário: ");
            String nome = leitor.next();

            System.out.print("Digite a senha: ");
            String senha = leitor.next();

            MessageDigest algoritmo2 = MessageDigest.getInstance("MD5");
            byte messageDigest2[] = algoritmo2.digest(senha.getBytes("UTF-8"));
            String md2 = Arrays.toString(messageDigest2);
            
            System.out.println("");
            System.out.println("senha criptografada: " + md2);
            System.out.println(messageDigest2);

            String login = ((nome.equals(username)) && (md2.equals(md))) 
                    ? "Login efetuado com sucesso!" : "Login não efetuado";
            System.out.println("-----------------------------------");
            System.out.println(login);
           
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
