package exercicios.exec04;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Carlos", 3000);
        Manager mgr = new Manager("Ana", 5000, 1500);

        emp.displayInfo();
        mgr.displayInfo();
    }
}
