package exercicios.exec03;

public class BankAccount {

    private double saldo;

    public void deposit(double amount) {
        saldo += amount;
        founds();
    }

    public void withdraw(double amount) {
        if (this.saldo - amount < 0) {
            System.out.println("Não pode retirar! tu ta pobre amigão!");
        } else {
            saldo -= amount;
        }
        founds();
    }

    public void founds() {
        System.out.println("Saldo atual: " + saldo);
    }
}


