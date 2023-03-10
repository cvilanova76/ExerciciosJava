package exercicios.condicionais;

import javax.swing.*;

public class Ex4 {
    public static void main(String[] args) {

        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));

        if(num % 2 == 0) {
            JOptionPane.showMessageDialog(null, "Número par");
        }else
            JOptionPane.showMessageDialog(null, "Número ímpar");
        }
    }
