package exercicios.sequenciais;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite os quilômetros rodados: ");
        float km = scan.nextFloat();

        System.out.println("Digite a quantidade de dias: ");
        int dias = scan.nextInt();

        double precoTotal = ((0.20 * km) + (90 * dias));

        System.out.println("O valor a ser pago é de R$: " + precoTotal);

        scan.close();
    }
}
