package exercicios.sequenciais;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite quantos dias trabalhou no mês: ");
        int dias = scan.nextInt();

        int horas = dias * 8;
        System.out.println("Você somou " + horas + " horas trabalhadas");

        double salario = horas * 25;

        System.out.println("O seu salário será R$: " + salario);


        scan.close();

    }
}
