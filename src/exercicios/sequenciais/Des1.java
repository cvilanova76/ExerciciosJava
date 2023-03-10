package exercicios.sequenciais;

import java.util.Scanner;

public class Des1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite quantos cigarros fuma por dia: ");
        int cigarro = scan.nextInt();

        System.out.println("Há quantos anos fuma?");
        int anos = scan.nextInt();

        int totalCigarros = (365 * anos) * cigarro;

        int tempo = (totalCigarros * 10) / 1440;
        System.out.println("Você já perdeu " + tempo + " dias de vida");
    }
}
