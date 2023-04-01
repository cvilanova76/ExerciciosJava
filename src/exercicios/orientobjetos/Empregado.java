package exercicios.orientobjetos;

public class Empregado {

    private String primeiroNome;
    private String sobrenome;
    private double salarioMensal;


    public Empregado (String primeiroNome, String sobrenome, double salarioMensal){
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
        if(salarioMensal < 0) {
            this.salarioMensal = 0;
        } else this.salarioMensal = salarioMensal;
    }
    public void setPrimeiroNome (String primeiroNome){
        this.primeiroNome = primeiroNome;
    }
    public void setSobrenome (String sobrenome){
        this.sobrenome = sobrenome;
    }
    public void setSalarioMensal (double salarioMensal){
        this.salarioMensal = salarioMensal;
    }
    public String getPrimeiroNome(){
        return primeiroNome;
    }
    public String getSobrenome(){
        return sobrenome;
    }
    public double getSalarioMensal(){
        return salarioMensal;
    }


}

