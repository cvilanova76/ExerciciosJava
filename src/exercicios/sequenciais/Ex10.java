package exercicios.sequenciais;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a largura em metros: ");
        float largura = scan.nextFloat();

        System.out.println("Digite a altura em metros: ");
        float altura = scan.nextFloat();

        float area = altura * largura;
        System.out.println("Área: " + area + "m2");

        float tinta = area / 2;
        System.out.println("Você precisa de " + tinta + " litros de tinta");

        scan.close();
    }


}
