package exercicios.sequenciais;


import javax.swing.*;

public class Ex7 {

    public static void main(String[] args) {

        double num = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));

        double dobro = num * 2;
        double terco = num / 3;
        JOptionPane.showMessageDialog(null, "O dobro de " + num + " é " + dobro +
                " e sua terça parte é " + terco);

    }


}
