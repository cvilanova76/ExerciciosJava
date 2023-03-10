package exercicios.orientobjetos;

public class InvoiceEmissao {
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice (213, "mouse", 4, 50.00);


            System.out.println("Descrição do produto: " + invoice1.getDescricaoItem());
            System.out.println("Quantidade: " + invoice1.getQuantidadeItem());
            System.out.println("Preço unitário: " + invoice1.getValorItem());
            System.out.println("Valor da nota: " + invoice1.getInvoiceAmount());
        }
    }
