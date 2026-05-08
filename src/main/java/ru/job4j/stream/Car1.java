package ru.job4j.stream;

import java.time.LocalDate;

public class Car1 {
    private String brand;
    private String model;
    private LocalDate created;
    private double volume;
    private String color;

    static class Builder {
        private String brand;
        private String model;
        private LocalDate created;
        private double volume;
        private String color;

        Builder buildBrand(String brand) {
            this.brand = brand;
            return this;
        }

        Builder buildModel(String model) {
            this.model = model;
            return this;
        }

        Builder buildCreated(LocalDate created) {
            this.created = created;
            return this;
        }

        Builder buildVolume(double volume) {
            this.volume = volume;
            return this;
        }

        Builder buildColor(String color) {
            this.color = color;
            return this;
        }

        Car1 build() {
            Car1 car = new Car1();
            car.brand = brand;
            car.model = model;
            car.created = created;
            car.volume = volume;
            car.color = color;
            return car;
        }
    }

    @Override
    public String toString() {
        return "Car1 {"
                + "brand='" + brand + '\''
                + ", model='" + model + '\''
                + ", created=" + created
                + ", volume=" + volume
                + ", color='" + color + '\''
                + '}';
    }

    public static void main(String[] args) {
        Car1 car1 = new Builder()
                .buildBrand("Toyota")
                .buildModel("Camry")
                .buildCreated(LocalDate.of(2021, 6, 1))
                .buildVolume(2.5)
                .buildColor("Black")
                .build();
        Car1 car2 = new Builder()
                .buildBrand("Chevrolet")
                .buildModel("Lacetti")
                .buildCreated(LocalDate.of(2025, 12, 25))
                .buildVolume(1.5)
                .buildColor("White")
                .build();
        System.out.println(car1);
        System.out.println(car2);
    }

}
