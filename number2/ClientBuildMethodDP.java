package number2;

public class ClientBuildMethodDP {
    public static void main(String[] args) {
        LaptopBuilder builder = new LaptopConcreteBuilder();
        LaptopDirector director = new LaptopDirector(builder);
        Laptop laptop = director.constructLaptop();

        System.out.println(laptop); // Shows memory and storage
    }
}