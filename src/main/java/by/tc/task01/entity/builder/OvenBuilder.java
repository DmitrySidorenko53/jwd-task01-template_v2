package by.tc.task01.entity.builder;

import by.tc.task01.entity.bean.Appliance;
import by.tc.task01.entity.bean.Oven;

public class OvenBuilder implements ApplianceBuilder<OvenBuilder> {
    private double powerConsumption;
    private double capacity;
    private ApplianceBuilderImpl applianceBuilder;

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public double getCapacity() {
        return capacity;
    }

    public ApplianceBuilderImpl getApplianceBuilder() {
        return applianceBuilder;
    }

    public OvenBuilder() {
        applianceBuilder = new ApplianceBuilderImpl();
    }

    @Override
    public OvenBuilder manufacturer(String manufacturer) {
        applianceBuilder.manufacturer(manufacturer);
        return this;
    }

    @Override
    public OvenBuilder price(double price) {
        applianceBuilder.price(price);
        return this;
    }

    @Override
    public OvenBuilder weight(double weight) {
        applianceBuilder.weight(weight);
        return this;
    }

    @Override
    public OvenBuilder depth(double depth) {
        applianceBuilder.depth(depth);
        return this;
    }

    @Override
    public OvenBuilder height(double height) {
        applianceBuilder.height(height);
        return this;
    }

    @Override
    public OvenBuilder width(double width) {
        applianceBuilder.width(width);
        return this;
    }

    @Override
    public OvenBuilder barcode(int barcode) {
        applianceBuilder.barcode(barcode);
        return this;
    }

    public OvenBuilder powerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
        return this;
    }

    public OvenBuilder capacity(double capacity) {
        this.capacity = capacity;
        return this;
    }

    public Appliance build() {
        return new Oven(this);
    }
}
