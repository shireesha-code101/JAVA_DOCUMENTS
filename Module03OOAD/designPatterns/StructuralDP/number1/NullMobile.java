package Module03OOAD.designPatterns.StructuralDP.number1;

public class NullMobile implements Mobile {
    private final String desc;
    public NullMobile() { this.desc = "Invalid brand or model."; }
    @Override public void getDesc() { System.out.println(desc); }
}
