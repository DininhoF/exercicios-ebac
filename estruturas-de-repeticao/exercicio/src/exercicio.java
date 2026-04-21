import java.util.Scanner;

public class exercicio {

    static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scan.next();

        System.out.println("Digite um numero positivo: ");
        int numeroPositivo = scan.nextInt();
        scan.nextLine();

        if(numeroPositivo > 0) {
            for (int i = 0; i <= numeroPositivo; i++) {
                System.out.println("Numero em ordem CRESCENTE:\n" + i);
            }
            for (int i = numeroPositivo; i >= 0; i--) {
                System.out.println("Numero em ordem DECRESCENTE:\n " + i);
            }

        }else{
            System.out.println("numero invalido");
        }

        if(nome.length() >= 6){
            System.out.println(" ");
            for (int i = 0; i < numeroPositivo; i++) {
                System.out.println(i+1+": "+nome);
            }
        }else {
            System.out.println(nome);
        }

        scan.close();

    }





}
