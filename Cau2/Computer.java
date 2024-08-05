package Cau2;

public abstract class Computer {
    protected String id;
    protected String cpu;
    protected double cost; 

    public Computer () {
        
    }

    public Computer(String id, String cpu, double cost) {
        this.id = id;
        this.cpu = cpu;
        this.cost = cost;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public abstract double calculatePrice();

    @Override
    public String toString() {
        return "Computer [id=" + id + ", cpu=" + cpu + ", cost=" + cost + "]";
    };
}