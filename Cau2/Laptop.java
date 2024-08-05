package Cau2;

public class Laptop extends Computer {
    private String brand;

    public Laptop() {

    }

    public Laptop(String id, String cpu, double cost, String brand) {
        super(id, cpu, cost);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public double calculatePrice() {
        return 1.35 * super.getCost();
    }

    @Override
    public String toString() {
        return "Laptop [id=" + id + ", brand=" + brand + ", cpu=" + cpu + ", cost=" + cost + "]";
    }
}