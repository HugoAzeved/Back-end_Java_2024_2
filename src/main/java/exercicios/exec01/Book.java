package exercicios.exec01;

public class Book {

    String title, author;
    int year;

    public static void main(String[] args) {
        Book codigoLimpo = new Book();
        Book harryPoter = new Book();
        Book receitasdaTia = new Book();

        codigoLimpo.title = "Código Limpo";
        codigoLimpo.author = "J. C. Martin";
        codigoLimpo.year = 2000;
        System.out.println(
                "Título: " + codigoLimpo.title + "\n" +
                        "\tAutor: " + codigoLimpo.author + "\n" +
                        "\tPublicado em " + codigoLimpo.year
        );
    }

}
