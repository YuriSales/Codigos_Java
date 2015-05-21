package Codigos;

import java.util.Scanner;

public class NumeroPar_Ternario {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int numero = leitor.nextInt();
        
        String resultado = (numero % 2 == 0) ? "Par" : "Ímpar";
        
        System.out.println("O número é: " + resultado);
    }
}
