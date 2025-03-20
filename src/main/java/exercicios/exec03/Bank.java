package exercicios.exec03;

public class Bank {

    public static void main(String[] args) {
        BankAccount conta = new BankAccount();

        conta.deposit(100); //adicionou dinheiro
        conta.withdraw(50.99); //tirou o dinheiro
        conta.withdraw(50); //tirou mais dinheiro
    }
}
