package by.tc.task01.entity.builder;

public interface ApplianceBuilder<T> {
    T manufacturer(String manufacturer);

    T price(double price);

    T weight(double weight);

    T depth(double depth);

    T height(double height);

    T width(double width);

    T barcode(int barcode);
}
