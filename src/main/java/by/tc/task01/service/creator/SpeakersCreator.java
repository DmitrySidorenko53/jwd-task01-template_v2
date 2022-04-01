package by.tc.task01.service.creator;

import by.tc.task01.entity.bean.Appliance;
import by.tc.task01.entity.builder.SpeakersBuilder;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SpeakersCreator implements ApplianceCreator {
    private Map<String, Object> props;

    @Override
    public List<Appliance> create(List<String> matches) {
        List<Appliance> speakers = new ArrayList<>();
        for (String line : matches) {
            props = fileAnalyse.findProperties(fileAnalyse.getProperties(line));
            Appliance speaker = new SpeakersBuilder()
                    .manufacturer((String) props.get(SearchCriteria.Speakers.MANUFACTURER.toString()))
                    .price(Double.parseDouble((String) props.get(SearchCriteria.Speakers.PRICE.toString())))
                    .weight(Double.parseDouble((String) props.get(SearchCriteria.Speakers.WEIGHT.toString())))
                    .powerConsumption(Double.parseDouble((String) props.get(SearchCriteria.Speakers.POWER_CONSUMPTION.toString())))
                    .numberOfSpeakers(Double.parseDouble((String) props.get(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.toString())))
                    .frequencyRange((String) props.get(SearchCriteria.Speakers.FREQUENCY_RANGE.toString()))
                    .cordLength(Double.parseDouble((String) props.get(SearchCriteria.Speakers.CORD_LENGTH.toString())))
                    .barcode(Integer.parseInt((String) props.get(SearchCriteria.Speakers.BARCODE.toString())))
                    .build();
            speakers.add(speaker);
        }
        return speakers;
    }
}
