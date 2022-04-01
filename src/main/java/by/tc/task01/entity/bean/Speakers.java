package by.tc.task01.entity.bean;

import by.tc.task01.entity.builder.SpeakersBuilder;

import java.io.Serializable;

public class Speakers extends Appliance implements Serializable {
    private double powerConsumption;
    private double numberOfSpeakers;
    private String frequencyRange;
    private double cordLength;

    public Speakers(SpeakersBuilder speakersBuilder) {
        super(speakersBuilder.getApplianceBuilder());
        powerConsumption = speakersBuilder.getPowerConsumption();
        numberOfSpeakers = speakersBuilder.getNumberOfSpeakers();
        frequencyRange = speakersBuilder.getFrequencyRange();
        cordLength = speakersBuilder.getCordLength();
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
                ", number of speakers = " + numberOfSpeakers + ", frequency range = " +
                frequencyRange + ", cord length = " + cordLength;
    }
}
