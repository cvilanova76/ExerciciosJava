package exercicios.orientobjetos2;

public class IngressoApp {
    public static void main(String[] args) {

        Ingresso ingresso1 = new Ingresso(200);
        IngressoVIP ingressovip1 = new IngressoVIP(200, 50);

        System.out.println("O valor do ingresso é :" + ingresso1 + " e do ingresso VIP é: " + ingressovip1);
    }
}
