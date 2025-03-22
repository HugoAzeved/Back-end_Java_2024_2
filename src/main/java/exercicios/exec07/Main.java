package exercicios.exec07;

public class Main {
    public static void main(String[] args) {
        Playable instrumento1 = new Guitar();
        Playable instrumento2 = new Piano();

        instrumento1.play();
        instrumento2.play();
    }
}
