import java.util.Scanner;

public class att5 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String continuar;
        boolean[][] ocupacao = new boolean[4][3];

        System.out.println("SISTEMA DE ANDARES E OCUPAÇÕES");

        do {
            System.out.println("Informe Andar (1-4):");
            int andar = leia.nextInt() - 1;
            System.out.println("Informe Quarto (1-3):");
            int quarto = leia.nextInt() - 1;


            if (andar >= 0 && andar < 4 && quarto >= 0 && quarto < 3) {
                if (!ocupacao[andar][quarto]) {
                    ocupacao[andar][quarto] = true;
                    System.out.println("Quarto ocupado com sucesso!");
                } else {
                    System.out.println("Quarto já está ocupado!");
                }
            } else {
                System.out.println("Andar ou quarto inválido. Tente novamente.");
            }

            System.out.println("Deseja informar outra ocupação? (S/N)");
            continuar = leia.next();
        } while (continuar.equalsIgnoreCase("S"));


        System.out.println("OCUPAÇÕES DO HOTEL:\n");
        for (int i = 0; i < 4; i++) {
            System.out.println((i + 1) + "º andar:");
            for (int j = 0; j < 3; j++) {
                if (ocupacao[i][j]) {
                    System.out.println("- quarto " + (j + 1) + " ocupado");
                } else {
                    System.out.println("- quarto " + (j + 1) + " desocupado");
                }
            }
        }
    }
}