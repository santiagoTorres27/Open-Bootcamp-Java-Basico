package org.example.section4;

public class SmartPhone extends SmartDevice {

    private int storageGb;
    private int ramGb;

    public SmartPhone() {
    }

    public SmartPhone(String brand, String model, int productionYear, double weightKg, String operatingSystem, int storageGb, int ramGb) {
        super(brand, model, productionYear, weightKg, operatingSystem);
        this.storageGb = storageGb;
        this.ramGb = ramGb;
    }

    @Override
    public String toString() {
        return super.toString() + " | SmartPhone{" +
                "storageGb=" + storageGb +
                ", ramGb='" + ramGb + '\'' +
                '}';
    }
}
