package Module03OOAD.designPatterns.StructuralDP.number1;

import java.util.Objects;

public class SamsungFactory implements MobileFactory {
    @Override
    public Mobile getMobile(String model) {
        if (Objects.equals(model, "galaxyS25")) {
            return new SamsungMobile("Here is your Galaxy S25");
        } else if (Objects.equals(model, "galaxyS25Ultra")) {
            return new SamsungMobile("Here is your Galaxy S25 Ultra");
        }
        return new NullMobile();
    }
}
