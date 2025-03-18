package exercicios.exec03;

public class Main {
    public static void main(String[] args) {
        // Criando uma conta bancária com saldo inicial de 100
        BankAccount account = new BankAccount(100.0);

        // Exibindo o saldo inicial
        System.out.println("Saldo inicial: " + account.getBalance()); // Saída: 100.0

        // Depositando 50 na conta
        account.deposit(50.0);
        System.out.println("Saldo após depósito: " + account.getBalance()); // Saída: 150.0

        // Tentando retirar 200 da conta (saldo insuficiente)
        account.withdraw(200.0); // Saída: Saldo insuficiente para realizar o saque.

        // Retirando 100 da conta
        account.withdraw(100.0);
        System.out.println("Saldo após saque: " + account.getBalance()); // Saída: 50.0

        // Tentando depositar um valor negativo
        account.deposit(-10.0); // Saída: Valor de depósito inválido. O valor deve ser maior que 0.
    }
}
