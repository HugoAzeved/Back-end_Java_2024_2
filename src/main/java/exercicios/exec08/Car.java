package exercicios.exec08;

public class Car {

    private String brand;
    private int year;

    public Car(int year, String brand) {
        this.setYear(year);
        this.setBrand(brand);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 1900) {
            this.year = year;
        } else {
            System.out.println("Ooops! Muito velho!");
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
