package by.tc.task01.entity.builder;

import by.tc.task01.entity.bean.Appliance;
import by.tc.task01.entity.bean.TabletPC;

public class TabletPCBuilderImpl implements TabletPCBuilder<TabletPCBuilderImpl> {
    private ApplianceBuilderImpl applianceBuilder;
    private double batteryCapacity;
    private double displayInches;
    private double memoryRom;
    private double flashMemoryCapacity;
    private String color;

    public ApplianceBuilderImpl getApplianceBuilder() {
        return applianceBuilder;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public double getDisplayInches() {
        return displayInches;
    }

    public double getMemoryRom() {
        return memoryRom;
    }

    public double getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public String getColor() {
        return color;
    }

    public TabletPCBuilderImpl() {
        applianceBuilder = new ApplianceBuilderImpl();
    }

    @Override
    public TabletPCBuilderImpl manufacturer(String manufacturer) {
        applianceBuilder.manufacturer(manufacturer);
        return this;
    }

    @Override
    public TabletPCBuilderImpl price(double price) {
        applianceBuilder.price(price);
        return this;
    }

    @Override
    public TabletPCBuilderImpl weight(double weight) {
        applianceBuilder.weight(weight);
        return this;
    }

    @Override
    public TabletPCBuilderImpl depth(double depth) {
        return null;
    }

    @Override
    public TabletPCBuilderImpl height(double height) {
        return null;
    }

    @Override
    public TabletPCBuilderImpl width(double width) {
        return null;
    }

    @Override
    public TabletPCBuilderImpl barcode(int barcode) {
        applianceBuilder.barcode(barcode);
        return this;
    }

    @Override
    public TabletPCBuilderImpl batteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
        return this;
    }

    @Override
    public TabletPCBuilderImpl displayInches(double displayInches) {
        this.displayInches = displayInches;
        return this;
    }

    @Override
    public TabletPCBuilderImpl memoryRom(double memoryRom) {
        this.memoryRom = memoryRom;
        return this;
    }

    public TabletPCBuilderImpl flashMemoryCapacity(double flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
        return this;
    }

    public TabletPCBuilderImpl color(String color) {
        this.color = color;
        return this;
    }

    public Appliance build() {
        return new TabletPC(this);
    }
}
