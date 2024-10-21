import java.util.Scanner;

public class att1ex2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String nome1, nome2;
        int idade1, idade2;

        System.out.println("Digite seu nome\n");
        nome1 = leia.nextLine();
        System.out.println("Digite sua idade\n");
        idade1 = leia.nextInt();
        leia.nextLine(); // Consumir newline left-over

        System.out.println("Digite seu nome\n");
        nome2 = leia.nextLine();
        System.out.println("Digite sua idade\n");
        idade2 = leia.nextInt();
        leia.nextLine(); // Consumir newline left-over

        String nomeQuartoA, nomeQuartoB;
        int idadeQuartoA, idadeQuartoB;

        if (idade1 < idade2) {
            nomeQuartoA = nome2;
            idadeQuartoA = idade2;
            nomeQuartoB = nome1;
            idadeQuartoB = idade1;
        } else {
            nomeQuartoA = nome1;
            idadeQuartoA = idade1;
            nomeQuartoB = nome2;
            idadeQuartoB = idade2;
        }

        String desconto = "";
        if (idadeQuartoA >= 60) {
            desconto = " com desconto de 40%";
        }

        System.out.println("QUARTO A: " + nomeQuartoA + desconto);
        System.out.println("QUARTO B: " + nomeQuartoB);
    }
}