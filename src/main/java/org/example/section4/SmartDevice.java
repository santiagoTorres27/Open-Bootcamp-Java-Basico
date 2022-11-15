package org.example.section4;

public class SmartDevice {

    private String brand;
    private String model;
    private int productionYear;
    private double weightKg;
    private String operatingSystem;

    public SmartDevice() {
    }

    public SmartDevice(String brand, String model, int productionYear, double weightKg, String operatingSystem) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.weightKg = weightKg;
        this.operatingSystem = operatingSystem;
    }

    @Override
    public String toString() {
        return "SmartDevice{" + "brand='" + brand + '\'' + ", model='" + model + '\'' + ", productionYear=" + productionYear + ", weightKg=" + weightKg + ", operatingSystem='" + operatingSystem + '\'' + '}';
    }
}
