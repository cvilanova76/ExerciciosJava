package exercicios.orientobjetos2;

public class ContaEspecial extends ContaCorrente{

    private float Limite;

    public ContaEspecial(){}

    public ContaEspecial(String nomeDoCliente, float saldo, float limite) {
        super(nomeDoCliente, saldo);
        Limite = limite;
    }

    public float getLimite() {
        return Limite;
    }

    public void setLimite(float limite) {
        Limite = limite;
    }

    @Override
    public String toString() {
        return "ContaEspecial{" +
                "Limite=" + Limite +
                ", Saldo=" + getSaldo() +
                '}';
    }

    public boolean sacar (float valor) {
        if ((getSaldo() + getLimite()) >= valor) {
            System.out.println("Saque autorizado");
        } else {
            System.out.println("Saldo insuficiente");
        }
        return false;
    }
    public boolean tranferir (float valor) {
        if ((getSaldo() + getLimite()) >= valor) {
            System.out.println("Transferência  autorizado");
        } else {
            System.out.println("Saldo insuficiente");
        }
        return false;
    }


}

