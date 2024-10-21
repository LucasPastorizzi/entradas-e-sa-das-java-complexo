import java.sql.SQLOutput;
import java.util.Scanner;

public class Att3 {
    public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);

    String continuar ;
    int [] diaria = new int[10];
    String [] nome = new String[10];
    int [] idade = new int[10];
    String nomedentro;
    int  ct = 0;
    int meias = 0;
    int gratuidades = 0;



        System.out.println("Digite o valor da diária!");
        diaria[0] = leia.nextInt();
        System.out.println("DIGITE S PARA CONTINUAR ||||||| DIGITE N PARA PARAR O PROGRAMA!");
        continuar = leia.next();



        while (continuar.equals("S")) {

           for (int i = 0; i < 1 ; i++) {
               System.out.println("DIGITE O NOME");
               nome[i] = leia.next();

               System.out.println("Digite sua idade;\n");
               idade[i] = leia.nextInt();

               ct = idade[i];
               ct = ct + idade[i];
                if(idade[i] <=4) {
                    System.out.println(nome[i]+" Possui gratuidade");
                    gratuidades++;
                }if (idade[i] >=80){
                   System.out.println(nome[i]+" Paga meia.");
                   meias++;
               }




               System.out.println("DIGITE S PARA CONTINUAR ||||||| DIGITE N PARA PARAR O PROGRAMA!");
               continuar = leia.next();


           }
        }
        System.out.println("TOTAL DE HÓSPEDES:  R$ "+diaria[0]+";");
        System.out.println(gratuidades+" GRATUIDADE(s);");
        System.out.println(meias+" MEIA(s);");



    }
}
