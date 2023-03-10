package exercicios.orientobjetos;

public class Invoice {

    private int numeroItem;
    private String descricaoItem;
    private int quantidadeItem;
    private double valorItem;

    public Invoice(int numeroItem, String descricaoItem, int quantidadeItem, double valorItem){
        this.descricaoItem = descricaoItem;
        this.numeroItem = numeroItem;
        if(quantidadeItem < 0) {
            this.quantidadeItem = 0;
        } else this.quantidadeItem = quantidadeItem;
        if(valorItem < 0) {
            this.valorItem = 0.0;
        } else this.valorItem = valorItem;
    }
    public void setDescricaoItem (String descricaoItem){
        this.descricaoItem = descricaoItem;
    }
    public void setNumeroItem (int numeroItem){
        this.numeroItem = numeroItem;
    }
    public void setQuantidadeItem (int quantidadeItem){
        this.quantidadeItem = quantidadeItem;
    }
    public void setValorItem (double valorItem){
        this.valorItem = valorItem;
    }
    public String getDescricaoItem(){
        return descricaoItem;
    }
    public int getNumeroItem(){
        return numeroItem;
    }
    public int getQuantidadeItem(){
        return quantidadeItem;
    }
    public double getValorItem(){
        return valorItem;
    }
    public double getInvoiceAmount(){
        return quantidadeItem * valorItem;
    }
}