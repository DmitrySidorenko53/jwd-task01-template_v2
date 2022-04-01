package by.tc.task01.entity.bean;

import by.tc.task01.entity.builder.OvenBuilder;

import java.io.Serializable;

public class Oven extends Appliance implements Serializable {
    private double powerConsumption;
    private double capacity;

    public Oven(OvenBuilder ovenBuilder) {
        super(ovenBuilder.getApplianceBuilder());
        powerConsumption = ovenBuilder.getPowerConsumption();
        capacity = ovenBuilder.getCapacity();
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
        return super.toString() + ", power consumption = " + powerConsumption +
                ", capacity = " + capacity + ", depth = " + getDepth() + ", height = " +
                getHeight() + ", width = " + getWidth();
    }
}
