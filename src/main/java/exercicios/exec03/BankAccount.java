package exercicios.exec03;

public class BankAccount {
    private double balance; // Saldo privado

    // Construtor para inicializar o saldo
    public BankAccount(double balancoInicial) {
        if (balancoInicial >= 0) {
            this.balance = balancoInicial;
        } else {
            this.balance = 0.0; // Se o saldo inicial for negativo, define como 0.
            System.out.println("Saldo inicial inválido. O saldo foi definido como 0.");
        }
    }

    // Método para depositar uma quantia na conta
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Depósito de " + amount + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido. O valor deve ser maior que 0.");
        }
    }

    // Método para retirar uma quantia da conta
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Saque de " + amount + " realizado com sucesso.");
            } else {
                System.out.println("Saldo insuficiente para realizar o saque.");
            }
        } else {
            System.out.println("Valor de saque inválido. O valor deve ser maior que 0.");
        }
    }

    // Método para obter o saldo atual
    public double getBalance() {
        return balance;
    }
}

