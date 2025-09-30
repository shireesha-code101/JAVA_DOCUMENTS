package number2;


public class Laptop {
    private int memory;
    private int storage;

    public Laptop() {
        System.out.println("Laptop constructor called");
    }

    public int getMemory() { return memory; }
    public int getStorage() { return storage; }

    public void setMemory(int memory) { this.memory = memory; }
    public void setStorage(int storage) { this.storage = storage; }

    @Override
    public String toString() {
        return "Laptop [memory=" + memory + "GB, storage=" + storage + "GB]";
    }
}
