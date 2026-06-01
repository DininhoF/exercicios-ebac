import java.util.Scanner;

public class ExercicioM9 {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        System.out.println("Digite um numero maior que zero: ");
        int numero = scan.nextInt();


        while (i <= 10) {
            int resultado = numero * i;
            System.out.println(numero + "x" +i+ "= " +resultado);

            if (i == 10){
                Sistema();
            }
            i++;
        }


        scan.close();
    }

    public static void Sistema(){
        int opcao;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Digite o numero das opcoes \n" +
                    "Opcao 1: Continuar \n"
                    +
                    "Opcao 2: Sair" );
            opcao = scan.nextInt();
            scan.nextLine();
            if(opcao == 2){
                System.out.println("Obrigado por utilizar o nosso sistema, espero que tenha gostado.");
                break;
            }
            System.out.println("Digite uma palavra ou frase: ");
            String frase = scan.nextLine();
            System.out.println(frase);
        } while (opcao == 1);


        }
    }

