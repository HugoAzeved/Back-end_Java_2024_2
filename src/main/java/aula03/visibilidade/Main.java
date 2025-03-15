package aula03.visibilidade;

public class Main {
    public static void main(String[] args) {

        // Criando um objeto chamado "thing1"
        MyNewClass thing1 = new MyNewClass();
        thing1.atributo1 = 9;
        System.out.println("Valor: " + thing1.atributo1);

        thing1.atributo2= 90;
        System.out.println("Valor: " + thing1.atributo2);
    }
}
