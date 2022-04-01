package by.tc.task01.entity.builder;

import by.tc.task01.entity.bean.Appliance;
import by.tc.task01.entity.bean.VacuumCleaner;

public class VacuumCleanerBuilder implements ApplianceBuilder<VacuumCleanerBuilder> {
    private double powerConsumption;
    private String filterType;
    private String bagType;
    private String wandType;
    private double motorSpeedRegulation;
    private double cleaningWidth;
    private ApplianceBuilderImpl applianceBuilder;

    public VacuumCleanerBuilder() {
        applianceBuilder = new ApplianceBuilderImpl();
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public String getFilterType() {
        return filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public double getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public double getCleaningWidth() {
        return cleaningWidth;
    }

    public ApplianceBuilderImpl getApplianceBuilder() {
        return applianceBuilder;
    }

    @Override
    public VacuumCleanerBuilder manufacturer(String manufacturer) {
        applianceBuilder.manufacturer(manufacturer);
        return this;
    }

    @Override
    public VacuumCleanerBuilder price(double price) {
        applianceBuilder.price(price);
        return this;
    }

    @Override
    public VacuumCleanerBuilder weight(double weight) {
        applianceBuilder.weight(weight);
        return this;
    }

    @Override
    public VacuumCleanerBuilder depth(double depth) {
        return null;
    }

    @Override
    public VacuumCleanerBuilder height(double height) {
        return null;
    }

    @Override
    public VacuumCleanerBuilder width(double width) {
        return null;
    }

    @Override
    public VacuumCleanerBuilder barcode(int barcode) {
        applianceBuilder.barcode(barcode);
        return this;
    }

    public VacuumCleanerBuilder powerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
        return this;
    }

    public VacuumCleanerBuilder filterType(String filterType) {
        this.filterType = filterType;
        return this;
    }

    public VacuumCleanerBuilder bagType(String bagType) {
        this.bagType = bagType;
        return this;
    }

    public VacuumCleanerBuilder wandType(String wandType) {
        this.wandType = wandType;
        return this;
    }

    public VacuumCleanerBuilder motorSpeedRegulation(double motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
        return this;
    }

    public VacuumCleanerBuilder cleaningWidth(double cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
        return this;
    }

    public Appliance build() {
        return new VacuumCleaner(this);
    }
}