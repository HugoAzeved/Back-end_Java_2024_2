package aula01;

/*
Exerc&iacute;cio 2: Calculadora Simples
Objetivo: Criar um programa que solicita dois n&uacute;meros ao usu&aacute;rio e exibe a soma.
Siga os passos:
   1) Criar um novo arquivo chamado `Calculator.java`.
   2) Implementar o seguinte c&oacute;digo:
   3) Executar o c&oacute;digo e testar com diferentes valores.
      Exemplo de entrada e sa&iacute;da:
      ```cmd
      Digite o primeiro n&uacute;mero: 5
      Digite o segundo n&uacute;mero: 3
      A soma dos n&uacute;meros &eacute;: 8.0
      ```
   4) Teste com v&aacute;rios valores de entrada.
   5) Modifique o c&oacute;digo para testar outras opera&ccedil;&otilde;es como subtra&ccedil;&atilde;o e multiplica&ccedil;&atilde;o.
 */

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Cria um objeto chamado `scanner` do tipo `Scanner` que se conecta ao `System.in` do Java.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        // O método `Scanner.nextDouble()` recebe um número `double`
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        double sum = num1 + num2;
        System.out.println("A soma dos números é: " + sum);

        //System.out.println(10+10); //Somar
        //System.out.println(10+"10") //Concatenar
        //System.out.println("10"+"10") //Concatenar

        scanner.close();
    }
}
