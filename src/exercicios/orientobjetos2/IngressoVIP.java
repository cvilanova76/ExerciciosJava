package exercicios.orientobjetos2;

public class IngressoVIP extends Ingresso {
        private float valorAdicional;

    public IngressoVIP(){}

    public IngressoVIP(float valorDoIngresso, float valorAdicional) {
        super(valorDoIngresso);
        this.valorAdicional = valorAdicional;
    }

    public float getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(float valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    @Override
    public String toString() {
        return "IngressoVIP {Valor final: " + (getValorDoIngresso() + valorAdicional) +
                "}";
    }
}


