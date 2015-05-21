package Codigos;

public class OperadoresLogicosAndOr {

    public static void main(String[] args) {
        
        boolean meuBooleanAnd = 1 == 2 && 1 == 1;
        boolean meuBooleanOr = 1 == 1 || 2 == 1;
        
        System.out.println("meuBooleanAnd: " + meuBooleanAnd);
        System.out.println("meuBooleanOr: " + meuBooleanOr);
    
        /*======== Operadores bits a bits ========*/
        
        boolean meuBooleanAnd2 = 1 == 2 & 1 == 1;
        boolean meuBooleanOr2 = 1 == 1 | 1 == 2;
        boolean meuBooleanExclusiveOr = 1 == 1 ^ 1 == 2;
        boolean meuBooleanExclusiveOr2 = 1 == 1 ^  2 == 2;
        
        System.out.println("meuBooleanAnd2: " + meuBooleanAnd2);
        System.out.println("meuBooleanOr2: " + meuBooleanOr2);
        System.out.println("meuBooleanExclusiveOr: " + meuBooleanExclusiveOr);
        System.out.println("meuBooleanExclusiveOr2: " + meuBooleanExclusiveOr2);
        
    }
}
