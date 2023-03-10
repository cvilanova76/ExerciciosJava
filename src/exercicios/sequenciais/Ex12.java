package exercicios.sequenciais;

import javax.swing.*;

public class Ex12 {
    public static void main(String[] args) {

        double preco = Double.parseDouble(JOptionPane.showInputDialog("Qual é o preço do produto?"));
        double valorFinal = preco - (preco * 5/100);

                JOptionPane.showMessageDialog(null, "O valor final do produto é R$ " + valorFinal);
    }
}
