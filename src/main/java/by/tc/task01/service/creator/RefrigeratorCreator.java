package by.tc.task01.service.creator;

import by.tc.task01.entity.bean.Appliance;
import by.tc.task01.entity.builder.RefrigeratorBuilder;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RefrigeratorCreator implements ApplianceCreator {
    private Map<String, Object> props;

    @Override
    public List<Appliance> create(List<String> matches) {
        List<Appliance> refrigerators = new ArrayList<>();
        for (String line : matches) {
            props = fileAnalyse.findProperties(fileAnalyse.getProperties(line));
            Appliance refrigerator = new RefrigeratorBuilder()
                    .manufacturer((String) props.get(SearchCriteria.Refrigerator.MANUFACTURER.toString()))
                    .price(Double.parseDouble((String) props.get(SearchCriteria.Refrigerator.PRICE.toString())))
                    .weight(Double.parseDouble((String) props.get(SearchCriteria.Refrigerator.WEIGHT.toString())))
                    .freezerCapacity(Double.parseDouble((String) props.get(SearchCriteria.Refrigerator.FREEZER_CAPACITY.toString())))
                    .powerConsumption(Double.parseDouble((String) props.get(SearchCriteria.Refrigerator.POWER_CONSUMPTION.toString())))
                    .capacity(Double.parseDouble((String) props.get(SearchCriteria.Refrigerator.CAPACITY.toString())))
                    .height(Double.parseDouble((String) props.get(SearchCriteria.Refrigerator.HEIGHT.toString())))
                    .width(Double.parseDouble((String) props.get(SearchCriteria.Refrigerator.WIDTH.toString())))
                    .barcode(Integer.parseInt((String) props.get(SearchCriteria.Refrigerator.BARCODE.toString())))
                    .build();
            refrigerators.add(refrigerator);
        }
        return refrigerators;
    }
}