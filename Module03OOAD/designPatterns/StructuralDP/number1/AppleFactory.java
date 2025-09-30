package Module03OOAD.designPatterns.StructuralDP.number1;

import java.util.Objects;

public class AppleFactory implements MobileFactory {
    @Override
    public Mobile getMobile(String model) {
        if (Objects.equals(model, "iphone16")) {
            return new AppleMobile("Here is your iPhone 16");
        } else if (Objects.equals(model, "iphone16MaxPro")) {
            return new AppleMobile("Here is your iPhone 16 Max Pro");
        }
        return new NullMobile();
    }
}
