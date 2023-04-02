package exercicios.orientobjetos2;

import javax.swing.*;
import java.util.Scanner;

public class ContaApp {

    public static void main(String[] args) {

        ContaCorrente contacorrente = new ContaCorrente("João de Barro", 200);
        ContaEspecial contaespecial = new ContaEspecial("Maria Fumaça", 300, 100);

        float valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor que deseja sacar ou transferir"));

        contacorrente.sacar (valor);{
            if (contacorrente.getSaldo() >= valor) {
                System.out.println("Saque autorizado");
            } else {
                System.out.println("Saldo insuficiente");
            }
        }

        contaespecial.sacar(valor);{
            if ((contaespecial.getSaldo() + contaespecial.getLimite()) >= valor) {
                System.out.println("Saque autorizado");
            } else {
                System.out.println("Saldo insuficiente");
            }
        }

        contacorrente.transferir(valor);{
            if (contacorrente.getSaldo() >= valor) {
                System.out.println("Saque autorizado");
            } else {
                System.out.println("Saldo insuficiente");
            }
        }
        contaespecial.transferir(valor);{
            if ((contaespecial.getSaldo() + contaespecial.getLimite()) >= valor) {
                System.out.println("Saque autorizado");
            } else {
                System.out.println("Saldo insuficiente");
            }
        }
        }
    }