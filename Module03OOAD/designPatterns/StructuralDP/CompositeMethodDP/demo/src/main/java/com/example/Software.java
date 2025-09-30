package Module03OOAD.designPatterns.StructuralDP.CompositeMethodDP.demo.src.main.java.com.example;

// leaf component
public class Software implements Company {
    private int id;
    private String name;

    public Software(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void displayName() {
        System.out.println("Software Department: " + name + " (ID: " + id + ")");
    }

    // getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
