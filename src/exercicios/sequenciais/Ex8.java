package exercicios.sequenciais;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a distância em metros: ");
        double metro = scan.nextDouble();

        double km = metro / 1000;
        double milha = metro / 1609;
        System.out.println(metro + "m são equivalente a " + km + "km e " + milha + "milhas");

        scan.close();
    }
}
