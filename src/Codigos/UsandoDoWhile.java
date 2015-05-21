package Codigos;

public class UsandoDoWhile {

    public static void main(String[] args) {

        int numero1 = 0;

        do {
            ++numero1;
            System.out.println("Numéro 1 = " + numero1);

        } while (numero1 < 10);
        
        System.out.println("-----------------------------");
        int numero2 = 10;
        
        do {
            --numero2;
            System.out.println("Número 2 = " + numero2);
            
        } while (numero2 > 0);
    }
}
