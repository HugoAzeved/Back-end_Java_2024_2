package aula03.abstrato;

public class Fusquinha extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Ligando a lenda!!");
        System.out.println("Vrom Vrom");
    }

    public void drift() {
        System.out.println("Damn, deu um drift irado");
    }

    @Override
    void stopEngine() {
        System.out.println("Vixe! O Lendario bateu!");
        System.out.println("Descanse em paz lenda.");
    }

    public Fusquinha() {
    }
}

