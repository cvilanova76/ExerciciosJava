package exercicios.orientobjetos2;

public class Ingresso {

    private float valorDoIngresso;

    public Ingresso(){}

    public Ingresso(float valorDoIngresso) {
        this.valorDoIngresso = valorDoIngresso;
    }

    public float getValorDoIngresso() {
        return valorDoIngresso;
    }

    public void setValorDoIngresso(float valorDoIngresso) {
        this.valorDoIngresso = valorDoIngresso;
    }

    @Override
    public String toString() {
        return "Ingresso{" +
                "valorDoIngresso=" + valorDoIngresso +
                '}';
    }
}
