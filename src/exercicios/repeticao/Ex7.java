package exercicios.repeticao;

import javax.swing.*;

public class Ex7 {
    public static void main(String[] args) {
        int somaIdades = 0;
        for (int i = 0; i < 20; i++){
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: "));
            somaIdades += idade;
        }
        System.out.println("A média das idades é: " + (somaIdades / 20));
    }
}
