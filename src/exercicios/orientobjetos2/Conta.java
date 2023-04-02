package exercicios.orientobjetos2;

public abstract class Conta {

    private String nomeDoCliente;

    public Conta(){}

    public Conta(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
    }

    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    public void setNomeDoCliente(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
    }
    public abstract void depositar ();
    public void sacar (){};
    public void transferir (float valor){};

    @Override
    public String toString() {
        return "Conta{" +
                "nomeDoCliente='" + nomeDoCliente + '\'' +
                '}';
    }
}
