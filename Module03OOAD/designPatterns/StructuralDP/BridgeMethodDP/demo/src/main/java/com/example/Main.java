package Module03OOAD.designPatterns.StructuralDP.BridgeMethodDP.demo.src.main.java.com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bridge Method Design Pattern - Structural DP!");

        // Create the implementor objects (Drawing APIs)
        ExcalidrawAPI obj1 = new DrawingFrame();
        ExcalidrawAPI obj2 = new DrawingPicture();

        // Create shapes with different implementations
        Shape square = new Square(5,obj1); // Use DrawingFrame API
        square.draw();

        Shape square2 = new Square(5,obj2); // Use DrawingFrame API
        square.draw();

    }
}
