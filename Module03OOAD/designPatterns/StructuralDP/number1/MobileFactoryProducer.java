package Module03OOAD.designPatterns.StructuralDP.number1;

import java.util.Objects;

// 5. Factory Producer (Super Factory)
public class MobileFactoryProducer {
    public static MobileFactory getFactory(String brand) {
        if (Objects.equals(brand, "Apple")) {
            return new AppleFactory();
        } else if (Objects.equals(brand, "Samsung")) {
            return new SamsungFactory();
        } else if (Objects.equals(brand, "OnePlus")) {
            return new OnePlusFactory();
        }
        return null;
    }
}
