package exercicios.condicionais;

import javax.swing.*;

public class Ex2 {

    public static void main(String[] args) {

        final int ANO_ATUAL = 2023;

        int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite seu ano de nascimento"));

        int idade = ANO_ATUAL - anoNascimento;

        if(idade < 70 && idade >= 16){
            JOptionPane.showMessageDialog(null, "Você tem: " + idade + " anos. Você está apto(a) a votar!");
        }else {
                JOptionPane.showMessageDialog(null, "Você tem: " + idade + " anos. Você não está apto(a) a votar!");
        }
    }

}
