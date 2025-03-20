package exercicios.exec02;

public class Main {
    public static void main(String[] args) {
        Student aluno = new Student();
        aluno.setName("Nicolas");
        aluno.setAge(14);

        System.out.println("Nome: " + aluno.getName() + "\n" +
                "Idade: " + aluno.getAge());

    }
}
