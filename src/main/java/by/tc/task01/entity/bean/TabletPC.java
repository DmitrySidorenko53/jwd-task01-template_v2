package by.tc.task01.entity.bean;

import by.tc.task01.entity.builder.TabletPCBuilderImpl;

import java.io.Serializable;

public class TabletPC extends Appliance implements Serializable {
    private double batteryCapacity;
    private double displayInches;
    private double memoryRom;
    private double flashMemoryCapacity;
    private String color;

    public TabletPC(TabletPCBuilderImpl tabletPCBuilder) {
        super(tabletPCBuilder.getApplianceBuilder());
        batteryCapacity = tabletPCBuilder.getBatteryCapacity();
        displayInches = tabletPCBuilder.getDisplayInches();
        memoryRom = tabletPCBuilder.getMemoryRom();
        flashMemoryCapacity = tabletPCBuilder.getFlashMemoryCapacity();
        color = tabletPCBuilder.getColor();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString() + ", battery capacity = " + batteryCapacity +
                ", display inches = " + displayInches + ", memory rom = " +
                memoryRom + ", flash memory capacity = " + flashMemoryCapacity +
                ", color = " + color;
    }
}
