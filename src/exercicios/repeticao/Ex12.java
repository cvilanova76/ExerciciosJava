package exercicios.repeticao;

import javax.swing.*;

public class Ex12 {
    public static void main(String[] args) {
        int numerosPares = 0;

        for (int i = 1; i <= 20; i++) {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

            if (num%2 == 0) {
                numerosPares++;
            }
        }
        JOptionPane.showMessageDialog(null, "São pares: " + numerosPares);
}}
