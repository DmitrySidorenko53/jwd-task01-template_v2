package by.tc.task01.entity.builder;

import by.tc.task01.entity.bean.Appliance;
import by.tc.task01.entity.bean.Speakers;

public class SpeakersBuilder implements ApplianceBuilder<SpeakersBuilder> {
    private double powerConsumption;
    private double numberOfSpeakers;
    private String frequencyRange;
    private double cordLength;
    private ApplianceBuilderImpl applianceBuilder;

    public SpeakersBuilder() {
        applianceBuilder = new ApplianceBuilderImpl();
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public double getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public String getFrequencyRange() {
        return frequencyRange;
    }

    public double getCordLength() {
        return cordLength;
    }

    public ApplianceBuilderImpl getApplianceBuilder() {
        return applianceBuilder;
    }

    @Override
    public SpeakersBuilder manufacturer(String manufacturer) {
        applianceBuilder.manufacturer(manufacturer);
        return this;
    }

    @Override
    public SpeakersBuilder price(double price) {
        applianceBuilder.price(price);
        return this;
    }

    @Override
    public SpeakersBuilder weight(double weight) {
        applianceBuilder.weight(weight);
        return this;
    }

    @Override
    public SpeakersBuilder depth(double depth) {
        return null;
    }

    @Override
    public SpeakersBuilder height(double height) {
        return null;
    }

    @Override
    public SpeakersBuilder width(double width) {
        return null;
    }

    @Override
    public SpeakersBuilder barcode(int barcode) {
        applianceBuilder.barcode(barcode);
        return this;
    }

    public SpeakersBuilder powerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
        return this;
    }

    public SpeakersBuilder numberOfSpeakers(double numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
        return this;
    }

    public SpeakersBuilder frequencyRange(String frequencyRange) {
        this.frequencyRange = frequencyRange;
        return this;
    }

    public SpeakersBuilder cordLength(double cordLength) {
        this.cordLength = cordLength;
        return this;
    }

    public Appliance build() {
        return new Speakers(this);
    }
}
