package exercicios.repeticao;

import javax.swing.*;

public class Ex13 {
    public static void main(String[] args) {
        int numerosAte100 = 0;

        for(int i = 0; i < 20; i++){
            int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
            if(num >= 0 && num <= 100){
                numerosAte100++;
            }
            System.out.println("Temos " + numerosAte100 + " números entre 0 e 100");
        }
    }
}
