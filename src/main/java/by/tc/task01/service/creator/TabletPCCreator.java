package by.tc.task01.service.creator;

import by.tc.task01.entity.bean.Appliance;
import by.tc.task01.entity.builder.TabletPCBuilderImpl;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TabletPCCreator implements ApplianceCreator {
    private Map<String, Object> props;

    @Override
    public List<Appliance> create(List<String> matches) {
        List<Appliance> tabletPCs = new ArrayList<>();
        for (String line : matches) {
            props = fileAnalyse.findProperties(fileAnalyse.getProperties(line));
            Appliance tabletPC = new TabletPCBuilderImpl()
                    .manufacturer((String) props.get(SearchCriteria.TabletPC.MANUFACTURER.toString()))
                    .price(Double.parseDouble((String) props.get(SearchCriteria.TabletPC.PRICE.toString())))
                    .weight(Double.parseDouble((String) props.get(SearchCriteria.TabletPC.WEIGHT.toString())))
                    .batteryCapacity(Double.parseDouble((String) props.get(SearchCriteria.TabletPC.BATTERY_CAPACITY.toString())))
                    .displayInches(Double.parseDouble((String) props.get(SearchCriteria.TabletPC.DISPLAY_INCHES.toString())))
                    .memoryRom(Double.parseDouble((String) props.get(SearchCriteria.TabletPC.MEMORY_ROM.toString())))
                    .flashMemoryCapacity(Double.parseDouble((String) props.get(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.toString())))
                    .color((String) props.get(SearchCriteria.TabletPC.COLOR.toString()))
                    .barcode(Integer.parseInt((String) props.get(SearchCriteria.TabletPC.BARCODE.toString())))
                    .build();
            tabletPCs.add(tabletPC);
        }
        return tabletPCs;
    }
}
