package exercicios.sequenciais;

import javax.swing.*;

public class Ex9 {
    public static void main(String[] args) {

        double dinheiro = Double.parseDouble(JOptionPane.showInputDialog("Digite quantos reais você tem: R$"));

        double conversao = dinheiro / 3.45;

        JOptionPane.showMessageDialog(null, "Você pode comprar US$ " + conversao);

    }
    }
