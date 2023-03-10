package exercicios.sequenciais;

import javax.swing.*;

public class Ex3 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Qual é o seu nome?");
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Qual é o seu salário?"));

        JOptionPane.showMessageDialog(null, "Olá, " + nome + ", é um prazer te conhecer!"
                                                            + "\nO salário digitado foi: ");

    }

}
