package exercicios.sequenciais;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int num1 = scan.nextInt();

        int antecessor = num1 - 1;
        int sucessor = num1 + 1;

        System.out.println("Antecessor: " + antecessor + " Seu número: " + num1 + " Sucessor: " + sucessor);

        scan.close();

    }
}
