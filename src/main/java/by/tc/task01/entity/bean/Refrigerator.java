package by.tc.task01.entity.bean;

import by.tc.task01.entity.builder.RefrigeratorBuilder;

public class Refrigerator extends Appliance {
    private double freezerCapacity;
    private double powerConsumption;
    private double capacity;

    public Refrigerator(RefrigeratorBuilder refrigeratorBuilder) {
        super(refrigeratorBuilder.getApplianceBuilder());
        powerConsumption = refrigeratorBuilder.getPowerConsumption();
        freezerCapacity = refrigeratorBuilder.getFreezerCapacity();
        capacity = refrigeratorBuilder.getCapacity();
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
        return super.toString() + ", freezer capacity = " + freezerCapacity +
                ", power consumption = " + powerConsumption + ", capacity = " +
                capacity + ", height = " + getHeight() + ", width = " + getWidth();
    }
}
