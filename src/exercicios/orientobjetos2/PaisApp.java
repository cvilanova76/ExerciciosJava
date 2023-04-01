package exercicios.orientobjetos2;


import javax.swing.*;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class PaisApp {

    public static void main(String[] args) {
    Pais pais1 = new Pais("12345", "Nárnia", 123456);
    pais1.setPopulacao(68790000);
    pais1.getPaisesFronteiricos().add("Genóvia");
    pais1.getPaisesFronteiricos().add("Lilipute");
    pais1.getPaisesFronteiricos().add("País das Maravilhas");

    Pais pais2 = new Pais("45677", "Oz", 67889);
    pais2.setPopulacao(635000);
    pais2.getPaisesFronteiricos().add("País das Maravilhas");
    pais2.getPaisesFronteiricos().add("Utopia");
    pais2.getPaisesFronteiricos().add("Lapútia");

    Pais pais3 = new Pais("7880", "Genosha", 83636);
    pais3.setPopulacao(384666000);
    pais3.getPaisesFronteiricos().add("Latvéria");
    pais3.getPaisesFronteiricos().add("Bactéria");
    pais3.getPaisesFronteiricos().add("Lilipute");

    System.out.println("Densidade populacional " + pais1.getNome() + ":" + pais1.getDensidadePopulacional());
    System.out.println("Densidade populacional " + pais2.getNome() + ":" + pais2.getDensidadePopulacional());
    System.out.println("Densidade populacional " + pais3.getNome() + ":" + pais3.getDensidadePopulacional());

    System.out.println("É limítrofe?: " + pais1.fazFronteira("Bactéria"));
    System.out.println("É limítrofe?: " + pais2.fazFronteira("País das Maravilhas"));
    System.out.println("É limítrofe?: " + pais3.fazFronteira("País das Maravilhas"));

    System.out.println("O país " + pais1.getNome()  + " faz fronteira com: " + pais1.getPaisesFronteiricos());
    System.out.println("O país " + pais2.getNome()  + " faz fronteira com: " + pais2.getPaisesFronteiricos());
    System.out.println("O país " + pais3.getNome()  + " faz fronteira com: " + pais3.getPaisesFronteiricos());


    }}
