package Module03OOAD.designPatterns.StructuralDP.number1;

// 2. Concrete Products
public class AppleMobile implements Mobile {
    private final String desc;
    public AppleMobile(String desc) { this.desc = desc; }
    @Override public void getDesc() { System.out.println(desc); }
}
