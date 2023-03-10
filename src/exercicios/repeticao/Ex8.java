package exercicios.repeticao;

import javax.swing.*;

public class Ex8 {
    public static void main(String[] args) {

        int maioresDeIdade = 0;
        for (int i = 0; i < 20; i++) {
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: "));
            if (idade >= 18) {
                maioresDeIdade++;
            }
            System.out.println("Pessoas maiores de idade: " + maioresDeIdade);
        }
    }
}
