package exercicios.repeticao;

import javax.swing.*;

public class Ex14 {
    public static void main(String[] args) {

        int numerosAte100 = 0;
        int numerosEntre101E200 = 0;
        int numerosAcimaDe200 = 0;

        for(int i = 0; i < 20; i++){
            int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
            if(num >= 0 && num <= 100){
                numerosAte100++;
            }
            if(num >= 101 && num <= 200){
                numerosEntre101E200++;
            }else
            numerosAcimaDe200++;
            System.out.println("Temos " + numerosAte100 + " números entre 0 e 100");
            System.out.println("Temos " + numerosEntre101E200 + "números entre 101 e 200");
            System.out.println("Temos " + numerosAcimaDe200 + " números acima de 200");
    }
}}
