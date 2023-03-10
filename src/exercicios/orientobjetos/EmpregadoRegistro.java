package exercicios.orientobjetos;

public class EmpregadoRegistro {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado ("Carolina", "Carvalho", 10000.00);
        Empregado empregado2 = new Empregado ("Sergio", "Ricardo", 9500.00);

        System.out.println("Nome: " + empregado1.getPrimeiroNome() + " Sobrenome: " + empregado1.getSobrenome() +
                " Salário mensal: " + empregado1.getSalarioMensal() + " Salário anual: " + (empregado1.getSalarioMensal()*13) +
                " Salário anual após aumento: " + (empregado1.getSalarioMensal() + empregado1.getSalarioMensal() * 10 / 100) * 13);
        System.out.println("Nome: " + empregado2.getPrimeiroNome() + " Sobrenome: " + empregado2.getSobrenome() +
                " Salário mensal: " + empregado2.getSalarioMensal() + " Salário anual: " + (empregado2.getSalarioMensal()*13) +
                " Salário anual após aumento: " + (empregado2.getSalarioMensal() + empregado2.getSalarioMensal() * 10 / 100) * 13);

    }
    }

