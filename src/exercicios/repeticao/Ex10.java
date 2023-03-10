package exercicios.repeticao;

import javax.swing.*;

public class Ex10 {
    public static void main(String[] args) {

            int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
            String tabuada = "";

            for(int i = 1; i <= 10; i++){
                tabuada += num + " X " + i + "=" + (num*i) + "\n";
        }
            JOptionPane.showMessageDialog(null, tabuada);



}}

