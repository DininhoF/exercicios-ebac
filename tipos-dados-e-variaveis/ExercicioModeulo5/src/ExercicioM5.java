import java.util.Scanner;

public class ExercicioM5 {

    static void main(String[] args) {

       Scanner scan = new Scanner(System.in);

        System.out.println("Olá Seja Bem vindo!");

        System.out.println("Insira seus dados abaixo:");

        System.out.println("Seu nome:");
        String nome = scan.nextLine();

        System.out.println("Sua idade:");
        int idade = scan.nextInt();
        scan.nextLine();

        System.out.println("Seu CPF:");
        String cpf = scan.nextLine();

        System.out.println("Sua altura:");
        float altura = scan.nextFloat();

        System.out.println("Peso:");
        float peso = scan.nextFloat();
        scan.nextLine();

        System.out.println("Estado cívil:");
        String estado = scan.nextLine();


        System.out.println("Seu nome é: "+nome+
                "\n Idade: "+idade+
                "\n Altura: "+altura+
                "\n Peso: "+peso+
                "\n CPF: "+cpf+
                "\n Estado cívil :"+estado);

        scan.close();
    }
}
