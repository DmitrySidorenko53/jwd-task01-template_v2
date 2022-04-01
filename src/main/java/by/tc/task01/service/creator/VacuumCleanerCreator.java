package by.tc.task01.service.creator;

import by.tc.task01.entity.bean.Appliance;
import by.tc.task01.entity.builder.VacuumCleanerBuilder;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class VacuumCleanerCreator implements ApplianceCreator {
    private Map<String, Object> props;

    @Override
    public List<Appliance> create(List<String> matches) {
        List<Appliance> vacuumCleaners = new ArrayList<>();
        for (String line : matches) {
            props = fileAnalyse.findProperties(fileAnalyse.getProperties(line));
            Appliance vacuumCleaner = new VacuumCleanerBuilder()
                    .manufacturer((String) props.get(SearchCriteria.VacuumCleaner.MANUFACTURER.toString()))
                    .price(Double.parseDouble((String) props.get(SearchCriteria.VacuumCleaner.PRICE.toString())))
                    .weight(Double.parseDouble((String) props.get(SearchCriteria.VacuumCleaner.WEIGHT.toString())))
                    .powerConsumption(Double.parseDouble((String) props.get(SearchCriteria.VacuumCleaner.POWER_CONSUMPTION.toString())))
                    .filterType((String) props.get(SearchCriteria.VacuumCleaner.FILTER_TYPE.toString()))
                    .bagType((String) props.get(SearchCriteria.VacuumCleaner.BAG_TYPE.toString()))
                    .wandType((String) props.get(SearchCriteria.VacuumCleaner.WAND_TYPE.toString()))
                    .motorSpeedRegulation(Double.parseDouble((String) props.get(SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION.toString())))
                    .cleaningWidth(Double.parseDouble((String) props.get(SearchCriteria.VacuumCleaner.CLEANING_WIDTH.toString())))
                    .barcode(Integer.parseInt((String) props.get(SearchCriteria.VacuumCleaner.BARCODE.toString())))
                    .build();
            vacuumCleaners.add(vacuumCleaner);
        }
        return vacuumCleaners;
    }
}
