package by.tc.task01.entity.criteria;

public final class SearchCriteria {

    public enum Oven {
        MANUFACTURER, PRICE, POWER_CONSUMPTION, WEIGHT, CAPACITY, DEPTH, HEIGHT, WIDTH, BARCODE
    }

    public enum Laptop {
        MANUFACTURER, PRICE, WEIGHT, BATTERY_CAPACITY, OS, MEMORY_ROM, SYSTEM_MEMORY, CPU, DISPLAY_INCHS, BARCODE
    }

    public enum Refrigerator {
        MANUFACTURER, PRICE, POWER_CONSUMPTION, WEIGHT, FREEZER_CAPACITY, CAPACITY, HEIGHT, WIDTH, BARCODE
    }

    public enum VacuumCleaner {
        MANUFACTURER, PRICE, WEIGHT, POWER_CONSUMPTION, FILTER_TYPE, BAG_TYPE, WAND_TYPE, MOTOR_SPEED_REGULATION, CLEANING_WIDTH, BARCODE
    }

    public enum TabletPC {
        MANUFACTURER, PRICE, WEIGHT, BATTERY_CAPACITY, DISPLAY_INCHES, MEMORY_ROM, FLASH_MEMORY_CAPACITY, COLOR, BARCODE
    }

    public enum Speakers {
        MANUFACTURER, PRICE, WEIGHT, POWER_CONSUMPTION, NUMBER_OF_SPEAKERS, FREQUENCY_RANGE, CORD_LENGTH, BARCODE
    }

    private SearchCriteria() {
    }
}

