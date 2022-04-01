package by.tc.task01.entity.builder;

public interface TabletPCBuilder<T> extends ApplianceBuilder<T> {
    T batteryCapacity(double batteryCapacity);

    T displayInches(double displayInches);

    T memoryRom(double memoryRom);
}
