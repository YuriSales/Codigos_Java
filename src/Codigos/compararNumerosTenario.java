package Codigos;

import java.util.Scanner;

public class compararNumerosTenario {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número:");
        int numero1 = leitor.nextInt();
        
        System.out.println("Digite o segundo número:");
        int numero2 = leitor.nextInt();
        
        int resultado_maior = (numero1 > numero2) ? numero1 : numero2;
        int resultado_menor = (numero2 > numero1) ? numero1: numero2;
        
        System.out.println("O maior número é: " + resultado_maior);
        System.out.println("O menor número é: " + resultado_menor);
        
    }
    
}
