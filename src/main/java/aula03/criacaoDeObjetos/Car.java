package aula03.criacaoDeObjetos;

public class Car {

    // Atributos (estado do objeto)
    private String brand;
    private int year;

    // Construtor (inicializa o objeto)
    // Permite "escrever" em "private brand" e "private year",
    // mesmo eles estando "private"
    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Método (comportamento)
    public void displayInfo() {
        System.out.println("Marca: " + brand + ", Ano: " + year);
    }
}

