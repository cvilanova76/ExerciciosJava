package exercicios.sequenciais;

import javax.swing.*;

public class Ex13 {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Qual é o seu nome?");
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Qual é o seu salário?"));

        double aumento = salario + (salario * 15/100);

        JOptionPane.showMessageDialog(null, "Olá, " + nome + "!"
                + "\nSeu salário após o aumento será de R$: " + aumento);

    }
}
