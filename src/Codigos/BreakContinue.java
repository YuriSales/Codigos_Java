package Codigos;

public class BreakContinue {

    public static void main(String[] args) {

        double numero = 10;

        for (double i = 1; i < 10; i++) {
            System.out.println("Número: " + i);

            if (10 / i < 5) {
                System.out.println("10 / " + i + " = " + (10 / i));
                break;
            }
        }
        
        System.out.println("------------------------------------------");
        
        for (double i = 1; i < 10; i++) {
            System.out.println("Número: " + i);

            if (10 / i < 5) {
                System.out.println("10 / " + i + " = " + (10 / i));
                continue;
            }
        }
    }
}
