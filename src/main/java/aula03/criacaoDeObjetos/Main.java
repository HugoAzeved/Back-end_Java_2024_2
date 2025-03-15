package aula03.criacaoDeObjetos;

public class Main {
    public static void main(String[] args) {

        // Criando um objeto chamado "fusca" do tipo `Car`
        // Que é uma instância da classe `Car`
        // Que já recebe a "brand" "Volkswagen" e o "year" 1980
        Car fusca = new Car("Volkswagen", 1980);

        // Executa um método disponível em "fusca"
        // Chama o método `Car.displayInfo()`
        fusca.displayInfo();

        // Podemos criar quantos objetos quanto necessários
        // Cada objeto é tratado de forma independente
        Car fiat147 = new Car("FIAT", 1982);
        fiat147.displayInfo();

        // Os métodos do objeto podem ser executados quantas
        // vezes for necessário
        fusca.displayInfo();
        fusca.displayInfo();
        fiat147.displayInfo();
        fusca.displayInfo();
    }
}


