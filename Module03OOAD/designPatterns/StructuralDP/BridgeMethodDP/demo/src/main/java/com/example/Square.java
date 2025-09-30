package Module03OOAD.designPatterns.StructuralDP.BridgeMethodDP.demo.src.main.java.com.example;

public class Square extends Shape {
    private int side;

    // Constructor now takes ExcalidrawAPI and side length as parameters
    Square(int side, ExcalidrawAPI excalidrawAPI) {
        super(excalidrawAPI);
        this.side = side;
    }

    @Override
    void draw() {
        excalidrawAPI.drawSquare(side);
    }
}
