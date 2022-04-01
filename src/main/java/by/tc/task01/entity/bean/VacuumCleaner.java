package by.tc.task01.entity.bean;

import by.tc.task01.entity.builder.VacuumCleanerBuilder;

import java.io.Serializable;

public class VacuumCleaner extends Appliance implements Serializable {
    private double powerConsumption;
    private String filterType;
    private String bagType;
    private String wandType;
    private double motorSpeedRegulation;
    private double cleaningWidth;

    public VacuumCleaner(VacuumCleanerBuilder vacuumCleanerBuilder) {
        super(vacuumCleanerBuilder.getApplianceBuilder());
        powerConsumption = vacuumCleanerBuilder.getPowerConsumption();
        filterType = vacuumCleanerBuilder.getFilterType();
        bagType = vacuumCleanerBuilder.getBagType();
        wandType = vacuumCleanerBuilder.getWandType();
        motorSpeedRegulation = vacuumCleanerBuilder.getMotorSpeedRegulation();
        cleaningWidth = vacuumCleanerBuilder.getCleaningWidth();
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
        return super.toString() + ", powerConsumption = " + powerConsumption +
                ", filterType = " + filterType + ", bagType = " + bagType +
                ", wandType = " + wandType + ", motorSpeedRegulation = " + motorSpeedRegulation +
                ", cleaningWidth = " + cleaningWidth;
    }
}
