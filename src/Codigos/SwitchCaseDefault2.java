package Codigos;

import java.util.Scanner;

public class SwitchCaseDefault2 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite um dia da semana: ");
        String dia = leitor.next();
        
        switch(dia.toLowerCase()){
            
            case "domingo":
                System.out.println("Primeiro dia da semana!");
                break;
            
            case "segunda-feira":
                System.out.println("Segundo dia da semana!");
                break;
            
            case "terça-feira":    
                System.out.println("Terceiro dia da semana!");
                break;
            
            case "quarta-feira":    
                System.out.println("Quarto dia da semana!");
                break;    
                
            case "quinta-feira":    
                System.out.println("Quinto dia da semana!");
                break;
            
            case "sexta-feira":    
                System.out.println("Sexto dia da semana!");
                break;    
            
            case "sabado":    
                System.out.println("Sétimo dia da semana!");
                break;
                
            default: 
                System.out.println("Dia inválido!");
        }
    }
}
