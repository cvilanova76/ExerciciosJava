package exercicios.orientobjetos2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Pais {
    private String codigoIso;
    private String nome;
    private long populacao;
    private double dimensao;

    private List<String> paisesFronteiricos = new ArrayList<>();
    private List<String> paisesFronteiricosEmComum = new ArrayList<>();

    public Pais(String codigoIso, String nome, double dimensao) {
        this.codigoIso = codigoIso;
        this.nome = nome;
        this.dimensao = dimensao;
    }

    public String getCodigoIso() {
        return codigoIso;
    }

    public void setCodigoIso(String codigoIso) {
        this.codigoIso = codigoIso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getPopulacao() {
        return populacao;
    }

    public void setPopulacao(long populacao) {
        this.populacao = populacao;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }

    public List<String> getPaisesFronteiricos() {
        return paisesFronteiricos;
    }

    public List<String> getPaisesFronteiricosEmComum(Pais pais){
        return paisesFronteiricosEmComum;
    };

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Pais))
            return false;
        Pais pais = (Pais) o;
        return getCodigoIso().equals(pais.getCodigoIso());
    }

    public boolean fazFronteira(String pais) {
       return getPaisesFronteiricos().contains(pais);
    }

    public double getDensidadePopulacional(){
        return this.populacao /this.dimensao;
    }

    //public List<String> getPaisesFronteiricosEmComum(Pais pais){
    //criar a lista vazia que será retornada preenchida;
        //interar sobre a lista de um pais
        //verificar se o item atual esta contido na lista do outro pais
        //se estiver adicionar a lista que sera retornada
        // retorna a lusta preenchida
}//

