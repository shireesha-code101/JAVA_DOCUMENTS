package number2;

public class LaptopDirector {
    private LaptopBuilder laptopBuilder;

    public LaptopDirector(LaptopBuilder builder) {
        this.laptopBuilder = builder;
    }

    public Laptop constructLaptop() {
        // Example configuration (customize as needed)
        return laptopBuilder
                .buildMemory(2)
                .buildStorage(3)
                .build();
    }
}