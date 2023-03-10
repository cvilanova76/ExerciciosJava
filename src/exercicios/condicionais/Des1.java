package exercicios.condicionais;

import javax.swing.*;

public class Des1 {
    public static void main(String[] args) {

        int x = Integer.parseInt(JOptionPane.showInputDialog("Informe a primeira medida"));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Informe a segunda medida"));
        int z = Integer.parseInt(JOptionPane.showInputDialog("Informe a terceira medida"));

        if (x < y + z || y < x + z || z < x + y){
            JOptionPane.showMessageDialog(null, "Trata-se de um triangulo");
        }else
            JOptionPane.showMessageDialog(null, "Não é um triângulo");

    }
    }
