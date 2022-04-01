package by.tc.task01.entity.builder;

import by.tc.task01.entity.bean.Appliance;
import by.tc.task01.entity.bean.Refrigerator;

public class RefrigeratorBuilder implements ApplianceBuilder<RefrigeratorBuilder> {
    private double freezerCapacity;
    private double powerConsumption;
    private double capacity;
    private ApplianceBuilderImpl applianceBuilder;

    public RefrigeratorBuilder() {
        applianceBuilder = new ApplianceBuilderImpl();
    }

    public double getFreezerCapacity() {
        return freezerCapacity;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public double getCapacity() {
        return capacity;
    }

    public ApplianceBuilderImpl getApplianceBuilder() {
        return applianceBuilder;
    }

    @Override
    public RefrigeratorBuilder manufacturer(String manufacturer) {
        applianceBuilder.manufacturer(manufacturer);
        return this;
    }

    @Override
    public RefrigeratorBuilder price(double price) {
        applianceBuilder.price(price);
        return this;
    }

    @Override
    public RefrigeratorBuilder weight(double weight) {
        applianceBuilder.weight(weight);
        return this;
    }

    @Override
    public RefrigeratorBuilder depth(double depth) {
        return null;
    }

    @Override
    public RefrigeratorBuilder height(double height) {
        applianceBuilder.height(height);
        return this;
    }

    @Override
    public RefrigeratorBuilder width(double width) {
        applianceBuilder.width(width);
        return this;
    }

    @Override
    public RefrigeratorBuilder barcode(int barcode) {
        applianceBuilder.barcode(barcode);
        return this;
    }

    public RefrigeratorBuilder powerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
        return this;
    }

    public RefrigeratorBuilder capacity(double capacity) {
        this.capacity = capacity;
        return this;
    }

    public RefrigeratorBuilder freezerCapacity(double freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
        return this;
    }

    public Appliance build() {
        return new Refrigerator(this);
    }
}
