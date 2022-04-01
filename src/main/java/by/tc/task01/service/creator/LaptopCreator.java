package by.tc.task01.service.creator;

import by.tc.task01.entity.bean.Appliance;
import by.tc.task01.entity.builder.LaptopBuilder;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LaptopCreator extends TabletPCCreator {
    private Map<String, Object> props;

    @Override
    public List<Appliance> create(List<String> matches) {
        List<Appliance> laptops = new ArrayList<>();
        for (String line : matches) {
            props = fileAnalyse.findProperties(fileAnalyse.getProperties(line));
            Appliance laptop = new LaptopBuilder()
                    .manufacturer((String) props.get(SearchCriteria.Laptop.MANUFACTURER.toString()))
                    .price(Double.parseDouble((String) props.get(SearchCriteria.Laptop.PRICE.toString())))
                    .weight(Double.parseDouble((String) props.get(SearchCriteria.Laptop.WEIGHT.toString())))
                    .batteryCapacity(Double.parseDouble((String) props.get(SearchCriteria.Laptop.BATTERY_CAPACITY.toString())))
                    .os((String) props.get(SearchCriteria.Laptop.OS.toString()))
                    .memoryRom(Double.parseDouble((String) props.get(SearchCriteria.Laptop.MEMORY_ROM.toString())))
                    .cpu(Double.parseDouble((String) props.get(SearchCriteria.Laptop.CPU.toString())))
                    .displayInches(Double.parseDouble((String) props.get(SearchCriteria.Laptop.DISPLAY_INCHS.toString())))
                    .cpu(Double.parseDouble((String) props.get(SearchCriteria.Laptop.CPU.toString())))
                    .systemMemory(Double.parseDouble((String) props.get(SearchCriteria.Laptop.SYSTEM_MEMORY.toString())))
                    .barcode(Integer.parseInt((String) props.get(SearchCriteria.Laptop.BARCODE.toString())))
                    .build();
            laptops.add(laptop);
        }
        return laptops;
    }
}
