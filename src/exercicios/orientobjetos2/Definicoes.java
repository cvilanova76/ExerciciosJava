package exercicios.orientobjetos2;

public class Definicoes {}

    /* 1. O que é polimorfismo e sua importância para POO?
    Polimorfismo é um princípio pelo qual classes derivadas de uma
superclasse podem invocar métodos que têm a mesma identificação mas
comportamentos distintos para cada classe derivada. Assim, as subclasses
podem redefinir um método existente na superclasses (overriding),
assumindo diferentes funcionalidades enquanto compartilham com a classe mãe.
Assim, todos os animais se movimentam, mas alguns o fazem nadando, andando, voando etc.
Um de seus valores está em deixar o código mais simples e mais fácil manutenção, , diminuindo por exemplo
o uso de operadores condicionais. O polimorfismo pressupõe suas condições: herança entre
as classes e a redefinição de métodos nas subclasses.
     */
/*  2. Quais são os tipos de polimorfismo em POO?
   - Estático ou sobrecarga: quando temos a mesma operação implementada várias
vezes na mesma classe (horizontal)
    - Dinâmico ou sobreposição: acontece na herança, quando a subclasse sobrepõe o
método original (vertical)
 */
/* 3. Qual o tipo de polimorfismo apresentado e quais são os sinais que indicam a
de polimorfismo na seguinte classe:
        public carro(){
        private int velocidade = 1;
        public void acelera (){
        velocidade +=1;
        }
        public void acelera(int aceleracao){
        velocidade += aceleracao;
        }
        }

        O tipo de polimorfismo é horizontal ou de sobrecarga de método.
        Os métodos 'acelera' possuem a mesma assinatura e estão
        na mesma classe.
} */

