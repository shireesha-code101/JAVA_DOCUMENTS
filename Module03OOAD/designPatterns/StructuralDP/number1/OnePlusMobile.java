package Module03OOAD.designPatterns.StructuralDP.number1;

public class OnePlusMobile implements Mobile {
    private final String desc;
    public OnePlusMobile(String desc) { this.desc = desc; }
    @Override public void getDesc() { System.out.println(desc); }
}
