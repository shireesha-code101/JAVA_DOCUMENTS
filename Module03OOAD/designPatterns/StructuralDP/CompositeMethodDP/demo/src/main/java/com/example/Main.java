package Module03OOAD.designPatterns.StructuralDP.CompositeMethodDP.demo.src.main.java.com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Composite Method DP - Structural DP");

        Company softwareDept = new Software(1, "Software Development");
        Company hrDept = new HR(2, "Human Resources");

        CompanyHead companyHead = new CompanyHead(3, "ABC Company");
        companyHead.addDepartments(softwareDept);
        companyHead.addDepartments(hrDept);

        companyHead.displayName();
    }
}
