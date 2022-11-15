package org.example.section4;

public class SmartWatch extends SmartDevice {

    private boolean waterproof;
    private boolean heartRateSensor;
    private boolean sleepMonitoring;

    public SmartWatch() {
    }

    public SmartWatch(String brand, String model, int productionYear, double weightKg, String operatingSystem, boolean waterproof, boolean heartRateSensor, boolean sleepMonitoring) {
        super(brand, model, productionYear, weightKg, operatingSystem);
        this.waterproof = waterproof;
        this.heartRateSensor = heartRateSensor;
        this.sleepMonitoring = sleepMonitoring;
    }

    @Override
    public String toString() {
        return super.toString() + " | SmartWatch{" +
                "waterproof=" + waterproof +
                ", heartRateSensor=" + heartRateSensor +
                ", sleepMonitoring=" + sleepMonitoring +
                '}';
    }
}
