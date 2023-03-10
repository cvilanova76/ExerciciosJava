package exercicios.repeticao;

import javax.swing.*;

public class Ex9 {
    public static void main(String[] args) {

        int menorIdade = 0;
        String pessoaMaisNova = "";

        for(int i = 0; i < 10; i++){
            String nome = JOptionPane.showInputDialog("Digite o seu nome");
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));

            if(menorIdade == 0 || idade < menorIdade){
                menorIdade = idade;
                pessoaMaisNova = nome;
            }
            System.out.println("A pessoa mais nova é " + pessoaMaisNova + " com " + menorIdade + " anos");
    }
}}
