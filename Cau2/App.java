package Cau2;

import java.util.ArrayList;

public class App {
    public static void main(String[]args) {
        ArrayList<Computer> computers = new ArrayList<>();
        computers.add(new Laptop("L1", "i5", 30, "Asus"));
        computers.add(new Laptop("L2", "i5", 30, "Asus"));
        computers.add(new Laptop("L3", "i5", 30, "Asus"));

        computers.add(new Desktop("D1", "i5", 30, "Asus", 2));
        computers.add(new Desktop("D2", "i5", 30, "Asus", 3));
        computers.add(new Desktop("D3", "i5", 30, "Asus", 1));

        for (Computer computer : computers) {
            System.out.println(computer.toString());
        }
    }
}
