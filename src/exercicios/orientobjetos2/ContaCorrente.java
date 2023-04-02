package exercicios.orientobjetos2;

public class ContaCorrente extends Conta {

    private float Saldo;

    public ContaCorrente(){}

    public ContaCorrente(String nomeDoCliente, float saldo) {
        super(nomeDoCliente);
        Saldo = saldo;
    }

    public float getSaldo() {
        return Saldo;
    }

    public void setSaldo(float saldo) {
        Saldo = saldo;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "Saldo=" + Saldo +
                '}';
    }
    @Override
    public void depositar() {

    }
    public boolean sacar (float valor) {
        if (getSaldo() >= valor) {
            System.out.println("Saque autorizado");
        } else {
            System.out.println("Saldo insuficiente");
        }
        return false;
    }
    public boolean tranferir (float valor) {
        if (getSaldo() >= valor) {
            System.out.println("Transferência  autorizado");
        } else {
            System.out.println("Saldo insuficiente");
        }
        return false;
    }


}

