package Codigos;

public class ExemploDeslocarBitsEsquerda {

    public static void main(String[] args) {
        int numero = 5; 
        System.out.println("numero = " + obterBits(numero) + " ("+ numero + ")");
        
        int numero2 = numero << 2;
        System.out.println("numero 2 = " + obterBits(numero2) + " ("+ numero2 + ")");
    }

    public static String obterBits(int valor) {
        int mascara = 1 << 31; //0 a 63 se o tipo for long

        StringBuffer buffer = new StringBuffer(35);

        for (int i = 1; i <= 32; i++) {
            
            if ((valor & mascara) == 0) {
                buffer.append('0');          
            } else {
                buffer.append('1');
            }
            
            valor <<= 1;
            
            if(i % 8 == 0){
                buffer.append(' ');
            }
        }
        
        return buffer.toString();
    }
}
