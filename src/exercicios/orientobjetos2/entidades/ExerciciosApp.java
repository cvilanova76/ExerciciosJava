package exercicios.orientobjetos2.entidades;

public class ExerciciosApp {
    public static void main(String[] args) {

        Fornecedor fornecedor = new Fornecedor("Jose da Silva", "rua das Tabocas", "1189373746", 200000, 170000);
        System.out.println(fornecedor.getNome() + ", seu saldo é: R$ " +fornecedor.obterSaldo());

        Empregado empregado = new Empregado("Maria da Silva", "rua do Canário", "22983635", 456, 8000, 8);
        System.out.println(empregado.getNome() + ", seu salário é: R$ " + empregado.calcularSalario());

        Administrador administrador = new Administrador("Peter Parker", "rua do Homem Aranha", "78909373", 456, 9000, 8, 750);
        System.out.println(administrador.getNome() + ", seu salário final é: R$ " + administrador.obterSalario());

        Operario operario = new Operario("João Carpinteiro", "rua XYZ", "345678889", 567, 3000, 8, 1500, 20);
        System.out.println(operario.getNome() + ", seu salário final é: R$ " + operario.obterSalarioFinal());

        Vendedor vendedor = new Vendedor("Avon Calling", "rua do Comércio", "333444555666", 345, 3000, 8, 2000, 15);
        System.out.println(vendedor.getNome() + ", seu salário final é: R$" + vendedor.obterSalarioFinal());
    }


}
