package by.tc.task01.entity.bean;

import by.tc.task01.entity.builder.LaptopBuilder;

import java.io.Serializable;

public class Laptop extends TabletPC implements Serializable {
    private String os;
    private double systemMemory;
    private double cpu;

    public Laptop(LaptopBuilder laptopBuilder) {
        super(laptopBuilder.getTabletPCBuilder());
        os = laptopBuilder.getOs();
        systemMemory = laptopBuilder.getSystemMemory();
        cpu = laptopBuilder.getCpu();
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
        return super.toString() + ", os = " + os + ", cpu = " + cpu
                + ", system memory = " + systemMemory;
    }
}
