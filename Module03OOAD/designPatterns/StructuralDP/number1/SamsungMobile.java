package Module03OOAD.designPatterns.StructuralDP.number1;

public class SamsungMobile implements Mobile {
    private final String desc;
    public SamsungMobile(String desc) { this.desc = desc; }
    @Override public void getDesc() { System.out.println(desc); }
}
