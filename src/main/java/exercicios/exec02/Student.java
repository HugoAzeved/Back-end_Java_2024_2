package exercicios.exec02;

public class Student {
    private String name;
    private int age;

    // Construtor
    public Student(String name, int age) {
        this.name = name;
        setAge(age);  // Usando o setter para garantir a validação
    }

    // Getter para o nome
    public String getName() {
        return name;
    }

    // Setter para o nome
    public void setName(String name) {
        this.name = name;
    }

    // Getter para a idade
    public int getAge() {
        return age;
    }

    // Setter para a idade com validação
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("A idade deve ser maior que zero.");
        }
    }
}

