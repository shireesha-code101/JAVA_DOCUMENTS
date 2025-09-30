package Module03OOAD.designPatterns.StructuralDP.number1;

public class Client {
    public static void main(String[] args) {
        MobileFactory appleFactory = MobileFactoryProducer.getFactory("Apple");
        Mobile m1 = (appleFactory != null) ? appleFactory.getMobile("iphone16") : new NullMobile();
        m1.getDesc();

        MobileFactory samsungFactory = MobileFactoryProducer.getFactory("Samsung");
        Mobile m2 = (samsungFactory != null) ? samsungFactory.getMobile("galaxyS25Ultra") : new NullMobile();
        m2.getDesc();

        MobileFactory invalid = MobileFactoryProducer.getFactory("Nokia");
        Mobile m3 = (invalid != null) ? invalid.getMobile("3310") : new NullMobile();
        m3.getDesc();
    }
}
