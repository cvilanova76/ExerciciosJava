package exercicios.repeticao;

import javax.swing.*;

public class Ex3 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite o seu nome");

        for(int i = 0; i < 10; i++){
            System.out.println(nome);
        }
    }
}
