package exercicios.repeticao;

import javax.swing.*;

public class Ex11 {
    public static void main(String[] args) {

        int numerosMaioresQue8 = 0;

        for (int i = 1; i <= 20; i++) {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

            if (num > 8) {
                numerosMaioresQue8++;
            }
        }
        JOptionPane.showMessageDialog(null, "Maiores que 8: " + numerosMaioresQue8);
    }

}
