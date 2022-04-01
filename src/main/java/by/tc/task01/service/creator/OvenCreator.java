package by.tc.task01.service.creator;

import by.tc.task01.entity.bean.Appliance;
import by.tc.task01.entity.builder.OvenBuilder;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class OvenCreator implements ApplianceCreator {
    private Map<String, Object> props;

    @Override
    public List<Appliance> create(List<String> matches) {
        List<Appliance> ovens = new ArrayList<>();
        for (String line : matches) {
            props = fileAnalyse.findProperties(fileAnalyse.getProperties(line));
            Appliance oven = new OvenBuilder()
                    .manufacturer((String) props.get(SearchCriteria.Oven.MANUFACTURER.toString()))
                    .powerConsumption(parseDouble((String) props.get(SearchCriteria.Oven.POWER_CONSUMPTION.toString())))
                    .weight(parseDouble((String) props.get(SearchCriteria.Oven.WEIGHT.toString())))
                    .capacity(parseDouble((String) props.get(SearchCriteria.Oven.CAPACITY.toString())))
                    .depth(parseDouble((String) props.get(SearchCriteria.Oven.DEPTH.toString())))
                    .height(parseDouble((String) props.get(SearchCriteria.Oven.HEIGHT.toString())))
                    .width(parseDouble((String) props.get(SearchCriteria.Oven.WIDTH.toString())))
                    .price(parseDouble((String) props.get(SearchCriteria.Oven.PRICE.toString())))
                    .barcode(parseInt((String) props.get(SearchCriteria.Oven.BARCODE.toString())))
                    .build();
            ovens.add(oven);
        }
        return ovens;
    }
}
