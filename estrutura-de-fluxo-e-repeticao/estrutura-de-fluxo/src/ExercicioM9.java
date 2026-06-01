import java.util.Scanner;

public class ExercicioM9 {

    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         int numero;
         int  i = 1;
        System.out.println("Digite um numero:");
        numero = scan.nextInt();

        while(i <= 10){

            int resultado = numero * i;

            System.out.println(numero + "x" + i + "="+ resultado);

            if(i >= 10) {
                Sistema();
            }
            i++;
        }


    }

    public static void Sistema(){
        Scanner scan = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("Digite uma das opcoes abaixo:\n" +
                    "Opcao 1= Continuar\n"+
                    "Opcao 2= Sair");

            opcao = scan.nextInt();
            scan.nextLine();
            if (opcao == 2) {
                System.out.println("Obrigado por utilizar o nosso sistema, espero que tenha gostado.");
                break;
            }
            System.out.println("Digite uma palavra ou frase:");
            String frase = scan.nextLine();
            System.out.println(frase);

        }while (opcao ==1);
    }
}

