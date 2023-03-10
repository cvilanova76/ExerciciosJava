package exercicios.condicionais;

import javax.swing.*;

public class Ex6 {
    public static void main(String[] args) {

        final int ANO_ATUAL = 2023;

        int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite seu ano de nascimento"));

        int idade = ANO_ATUAL - anoNascimento;
        int anos1 = idade - 18;

        if(idade < 18){
            JOptionPane.showMessageDialog(null, "Falta(m) " + anos1 + " ano(s) para o seu alistamento");
        }else {
            JOptionPane.showMessageDialog(null, "Passou ou passaram " + anos1 + " ano(s) do seu alistamento");
        }
    }
    }

