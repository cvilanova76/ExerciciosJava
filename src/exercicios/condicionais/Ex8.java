package exercicios.condicionais;

import javax.swing.*;

public class Ex8 {
    public static void main(String[] args) {

        double distanciaAPercorrer = Double.parseDouble(JOptionPane.showInputDialog("Digite a distância a ser percorrida"));

        if(distanciaAPercorrer <= 200.0) {
            double valorDaPassagem = distanciaAPercorrer * 0.50;
            JOptionPane.showMessageDialog(null, "O valor da corrida é R$: " + valorDaPassagem);
        }else {
            double valorDaPassagem2 = distanciaAPercorrer * 0.45;
            JOptionPane.showMessageDialog(null, "O valor da corrida é R$: " + valorDaPassagem2);

        }
}}
