import java.sql.SQLOutput;
import java.util.Scanner;

public class att4 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String [] nome  = new String[15];
        String [] nomeh = new String[15];




        int escolhe = 0, lista = 0;

        while (escolhe < 3){
            System.out.println("Digite 1- cadastrar; 2- pesquisar; 3- sair");
            escolhe = leia.nextInt();
            switch (escolhe) {
                case 1:
                    if(lista < 14) {
                        System.out.println("CADASTRAR NOME : DIGITE AGORA SEU NOME PARA REALIZAR O CADASTRO\n");
                        nome[0] = leia.next();
                        nomeh[lista] = nome[0];
                        lista = lista + 1;

                        break;




                    } case 2:

                    System.out.println("DIGITE O NOME QUE DESEJA PESQUISAR NO SISTEMA: \n");
                    String nomeproc = leia.next();

                    boolean encontrado = false ;

                    for (int i = 0; i < lista; i++) {

                    if (nomeh[i].equalsIgnoreCase(nomeproc)){
                        encontrado = true;
                        System.out.println( nomeproc + " foi encontrado na posição " + i);
                        break;
                    }
                } if (!encontrado) {
                    System.out.println("NOME NÃO ENCONTRADO.");
                } case 3:

                    break;




            }



        }
    }
}
