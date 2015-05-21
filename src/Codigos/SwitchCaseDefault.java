package Codigos;

import java.util.Scanner;

public class SwitchCaseDefault {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número para mostrar o dia da semana: ");
        int numero_dia = leitor.nextInt();

        switch (numero_dia) {

            case 1:
                System.out.println("Domingo");
                break;

            case 2:
                System.out.println("Segunda-feira");
                break;

            case 3:

                System.out.println("Terça-feira");
                break;

            case 4:
                System.out.println("Quarta-feira");
                break;

            case 5:
                System.out.println("Quinta-feira");
                break;

            case 6:
                System.out.println("Sexta-feira");
                break;

            case 7:
                System.out.println("Sábado");
                break;

            default:
                System.out.println("Número inválido! Digite de 1 até 7!");
        }
    }
}
