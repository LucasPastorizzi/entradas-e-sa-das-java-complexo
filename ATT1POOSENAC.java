import java.util.Scanner;

public class ATT1POOSENAC {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);








        System.out.println("Digite o n de convidados;\n");
        int convidados = leia.nextInt();

        int cadeira = 230;
        int soma = (cadeira - convidados);





        if (convidados <=0 || convidados >=350){
            System.out.println("Número inválido de convidados!.\n");
        }if (convidados >1 && convidados <=150){
            System.out.println("Use o Auditório Alfa");
        }if (convidados >230){
            System.out.println("Use o Auditório Beta!\n");
        }if (convidados >151 && convidados <230){
            System.out.println("Use o auditório Alfa \n Inclua mais " + soma +" Cadeiras.");
        }
    }
}
