package exercicios.exec04;

public class Manager extends Employee {
    double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public void displayInfo() {
        System.out.println(name + " - R$" + (salary + bonus) + " (com bônus)");
    }
}
