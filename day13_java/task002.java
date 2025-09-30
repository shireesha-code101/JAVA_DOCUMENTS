package day13_java;

import java.io.FileWriter;
import java.io.IOException;
 class Customer {
    String name;
    String custID;

    public Customer(String name, String custID) {
        this.name = name;
        this.custID = custID;
    }

    public String getName() {
        return name;
    }

    public String getCustID() {
        return custID;
    }

    public void saveData() {
        try (FileWriter fw = new FileWriter(name + ".txt")) {
            fw.write("the customer name is " + name + "\t");
            fw.write("the customer id is " + custID + "\t");
            System.out.println("the data is saved in the file with your name");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Customer cobj = new Customer("prasunamba", "C001");
        cobj.saveData();
    }
}
