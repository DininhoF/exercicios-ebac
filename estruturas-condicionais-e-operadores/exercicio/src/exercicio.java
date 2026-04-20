import java.util.Scanner;

public class exercicio {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int numero = scan.nextInt();
        scan.nextLine();

        System.out.println("Digite outro numero:");
        int numero2 = scan.nextInt();
        scan.nextLine();

        if (numero > numero2){
            System.out.println("O maior numero é: " + numero);
        } else if (numero2 > numero) {
            System.out.println("O maior numero é: " + numero2);
        } else {
            System.out.println("Os Numeros sao iguais!");
        }


        scan.close();
    }
}
