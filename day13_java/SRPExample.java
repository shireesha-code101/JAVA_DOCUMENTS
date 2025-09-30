   import java.io.FileWriter;
    import java.io.IOException;
   
   
    class Customer {
    private final String name;
    private final String custID;

    public Customer(String name, String custID) {
        this.name = name;
        this.custID = custID;
    }

    public String getName() {
        return name;
    }

    // Corrected: added () after method name
    public String getCustID() {
        return custID;
    }
}

    class CustomerFileWriter {
    public void writeToFile(Customer customer) {
        String filename = customer.getName() + ".txt";
        try (FileWriter fw = new FileWriter(filename)) {
            fw.write("Customer name: " + customer.getName() + "\t");
            fw.write("Customer ID: " + customer.getCustID() + "\t");
            System.out.println("Data saved to file: " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class SRPExample {
    public static void main(String[] args) {
        Customer customer = new Customer("Prasunamba", "C001");
        CustomerFileWriter writer = new CustomerFileWriter();
        writer.writeToFile(customer);
    }
}
