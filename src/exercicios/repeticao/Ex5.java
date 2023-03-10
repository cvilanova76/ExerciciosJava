package exercicios.repeticao;

import javax.swing.*;

public class Ex5 {

    public static void main(String[] args) {
        try{
        int soma = 0;
        for(int i = 1; i <= 10; i++){
            int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
            soma += num;
        }
        System.out.println("Soma total: " + soma);
    }catch (NumberFormatException e){
        JOptionPane.showMessageDialog(null, "Você digitou um valor inválido. Digite números, por favor");
    }
}}
