package exercicios.repeticao;

import javax.swing.*;

public class Ex4 {
    public static void main(String[] args) {
       try {
        String nome = JOptionPane.showInputDialog("Digite o seu nome");
        int repeticoes = Integer.parseInt(JOptionPane.showInputDialog("Deseja repetir seu nome quantas vezes?"));

        for (int i = 0; i < repeticoes; i++) {
            System.out.println(nome);
        }
    }catch (NumberFormatException e){
           JOptionPane.showMessageDialog(null, "Você digitou um valor inválido. Digite números, por favor");
       }
}}
