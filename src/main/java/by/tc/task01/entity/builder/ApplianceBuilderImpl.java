package by.tc.task01.entity.builder;

import by.tc.task01.entity.bean.Appliance;

public class ApplianceBuilderImpl implements ApplianceBuilder<ApplianceBuilderImpl> {
    private String manufacturer;
    private double price;
    private double weight;
    private double width;
    private double height;
    private double depth;
    private int barcode;

    public String getManufacturer() {
        return manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
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

    public int getBarcode() {
        return barcode;
    }

    public ApplianceBuilderImpl() {
    }

    public Appliance build() {
        return new Appliance(this);
    }

    @Override
    public ApplianceBuilderImpl manufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    @Override
    public ApplianceBuilderImpl price(double price) {
        this.price = price;
        return this;
    }

    @Override
    public ApplianceBuilderImpl weight(double weight) {
        this.weight = weight;
        return this;
    }

    @Override
    public ApplianceBuilderImpl depth(double depth) {
        this.depth = depth;
        return this;
    }

    @Override
    public ApplianceBuilderImpl height(double height) {
        this.height = height;
        return this;
    }

    @Override
    public ApplianceBuilderImpl width(double width) {
        this.width = width;
        return this;
    }

    @Override
    public ApplianceBuilderImpl barcode(int barcode) {
        this.barcode = barcode;
        return this;
    }
}

