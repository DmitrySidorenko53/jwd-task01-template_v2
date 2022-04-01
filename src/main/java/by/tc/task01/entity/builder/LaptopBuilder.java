package by.tc.task01.entity.builder;

import by.tc.task01.entity.bean.Appliance;
import by.tc.task01.entity.bean.Laptop;

public class LaptopBuilder implements TabletPCBuilder<LaptopBuilder> {
    private TabletPCBuilderImpl tabletPCBuilder;
    private String os;
    private double systemMemory;
    private double cpu;

    public String getOs() {
        return os;
    }

    public double getSystemMemory() {
        return systemMemory;
    }

    public double getCpu() {
        return cpu;
    }

    public TabletPCBuilderImpl getTabletPCBuilder() {
        return tabletPCBuilder;
    }

    public LaptopBuilder() {
        tabletPCBuilder = new TabletPCBuilderImpl();
    }

    public LaptopBuilder os(String os) {
        this.os = os;
        return this;
    }

    public LaptopBuilder systemMemory(double systemMemory) {
        this.systemMemory = systemMemory;
        return this;
    }

    public LaptopBuilder cpu(double cpu) {
        this.cpu = cpu;
        return this;
    }

    public Appliance build() {
        return new Laptop(this);
    }

    @Override
    public LaptopBuilder manufacturer(String manufacturer) {
        tabletPCBuilder.manufacturer(manufacturer);
        return this;
    }

    @Override
    public LaptopBuilder price(double price) {
        tabletPCBuilder.price(price);
        return this;
    }

    @Override
    public LaptopBuilder weight(double weight) {
        tabletPCBuilder.weight(weight);
        return this;
    }

    @Override
    public LaptopBuilder depth(double depth) {
        return null;
    }

    @Override
    public LaptopBuilder height(double height) {
        return null;
    }

    @Override
    public LaptopBuilder width(double width) {
        return null;
    }

    @Override
    public LaptopBuilder barcode(int barcode) {
        tabletPCBuilder.barcode(barcode);
        return this;
    }

    @Override
    public LaptopBuilder batteryCapacity(double batteryCapacity) {
        tabletPCBuilder.batteryCapacity(batteryCapacity);
        return this;
    }

    @Override
    public LaptopBuilder displayInches(double displayInches) {
        tabletPCBuilder.displayInches(displayInches);
        return this;
    }

    @Override
    public LaptopBuilder memoryRom(double memoryRom) {
        tabletPCBuilder.memoryRom(memoryRom);
        return this;
    }

}
