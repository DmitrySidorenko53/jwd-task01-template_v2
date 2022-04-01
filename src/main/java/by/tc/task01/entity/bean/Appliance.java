package by.tc.task01.entity.bean;

import by.tc.task01.entity.builder.ApplianceBuilderImpl;

import java.io.Serializable;
import java.util.Objects;

public class Appliance implements Serializable {
    private String manufacturer;
    private double price;
    private double weight;
    private double width;
    private double height;
    private double depth;
    private int barcode;

    public Appliance(ApplianceBuilderImpl applianceBuilder) {
        manufacturer = applianceBuilder.getManufacturer();
        price = applianceBuilder.getPrice();
        weight = applianceBuilder.getWeight();
        width = applianceBuilder.getWidth();
        height = applianceBuilder.getHeight();
        depth = applianceBuilder.getDepth();
        barcode = applianceBuilder.getBarcode();
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getDepth() {
        return depth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appliance appliance = (Appliance) o;
        return barcode == appliance.barcode;
    }

    @Override
    public int hashCode() {
        return Objects.hash(barcode);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " : " + "manufacturer = " + manufacturer +
                ", price = " + price + ", weight = " + weight + ", barcode = " + barcode;
    }
}
