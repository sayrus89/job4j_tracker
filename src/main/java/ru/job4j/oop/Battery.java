package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int charge) {
        this.load = charge;
    }

    public void exchange(Battery another) {
        this.load = this.load + another.load;
        another.load = 0;
    }

    public static void main(String[] args) {
        Battery firstBattery = new Battery(70);
        Battery secondBattery = new Battery(30);
        System.out.println("First battery charge " + firstBattery.load
                + ". Second battery charge " + secondBattery.load);
        firstBattery.exchange(secondBattery);
        System.out.println("First battery charge " + firstBattery.load
                + ". Second battery charge " + secondBattery.load);
    }
}
