package Codigos;

public class LabeledLoop {

    public static void main(String[] args) {
        int total;
        boolean erro = false;

        inicio:
        if (!erro) {
            for (int i = 0; i < 10; i++) {
                System.out.println("i: " + i);
                for (int j = 0; j < 10; j++) {
                    System.out.println("j: " + j);
                    for (int k = 0; k < 10; k++) {
                        System.out.println("k: " + k);
                        for (int l = 0; l < 10; l++) {
                            System.out.println("l: " + l);
                            for (int m = 0; m < 10; m++) {
                                System.out.println("m: " + m);
                                total = ((i * 10000) + (j * 1000) + (k * 100) + (l * 10) + m);
                                System.out.println("Agora estamos tratando do: " + total);
                                if (total == 10) {
                                    erro = true;
                                    break inicio;
                                }
                            }
                        }
                    }
                }

            }
        }
    }
}
