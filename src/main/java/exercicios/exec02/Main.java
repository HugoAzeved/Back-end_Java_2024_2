package exercicios.exec02;

public class Main {
    public static void main(String[] args) {
        try {
            // Criando um objeto Student
            Student student = new Student("João", 20);

            // Acessando os atributos
            System.out.println(student.getName());  // Saída: João
            System.out.println(student.getAge());   // Saída: 20

            // Tentando definir uma idade inválida
            student.setAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());  // Saída: A idade deve ser maior que zero.
        }
    }
}

