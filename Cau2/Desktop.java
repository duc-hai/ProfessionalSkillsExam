package Cau2;

public class Desktop extends Computer {
    private String mainboard;
    private double weight;

    public Desktop() {
    }

    public Desktop(String id, String cpu, double cost, String mainboard, double weight) {
        super(id, cpu, cost);
        this.mainboard = mainboard;
        this.weight = weight;
    }

    public String getMainboard() {
        return mainboard;
    }

    public void setMainboard(String mainboard) {
        this.mainboard = mainboard;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double calculatePrice() {
        return 1.2 * super.getCost() + this.calculateShipFee();
    }

    public double calculateShipFee() {
        return 3 * this.weight;
    }

    @Override
    public String toString() {
        return "Desktop [id=" + id + ", mainboard=" + mainboard + ", cpu=" + cpu + ", weight=" + weight + ", cost="
                + cost + "]";
    }
}