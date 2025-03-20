package exercicios.exec01;

public class Book {

    String title, author;
    int year;

    //array
    String[][] colecao ={
            { "StarWars", "George Lucas", "1977"},

            {"HarryPotter", "J.C. Martin", "2000"},

            {"Minecraft", "Noth", "2006"}
    };

    public static void main(String[] args) {

        Book livros = new Book();

        // Loop
        // array.length retorna quantos itens existem no array
        for (
                int i = 0; // Inicializa a variável de controle
                i < livros.colecao.length; // Teste: enquanto for "true" roda o loop
                i ++ // Incremento do controle
        ) {
            System.out.println(
                    "Título: " + livros.colecao[i][0] + "\n" +
                            "\tAutor: " + livros.colecao[i][1] + "\n" +
                            "\tAno: " + livros.colecao[i][2] + "\n" +
                            "-------------------"
            );
        }

        }
    }
