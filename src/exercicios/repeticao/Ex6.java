package exercicios.repeticao;

import javax.swing.*;

public class Ex6 {

    public static void main(String[] args) {
    int soma = 0;
    for (int i = 0; i < 20; i++){
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: "));
            soma += idade;
        }
        System.out.println("Soma total das idades: " + soma);
    }
    }



