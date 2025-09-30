package Module03OOAD.designPatterns.StructuralDP.number1;

import java.util.Objects;

public class OnePlusFactory implements MobileFactory {
    @Override
    public Mobile getMobile(String model) {
        if (Objects.equals(model, "onePlus11")) {
            return new OnePlusMobile("Here is your OnePlus 11");
        } else if (Objects.equals(model, "onePlus11Pro")) {
            return new OnePlusMobile("Here is your OnePlus 11 Pro");
        }
        return new NullMobile();
    }
}
