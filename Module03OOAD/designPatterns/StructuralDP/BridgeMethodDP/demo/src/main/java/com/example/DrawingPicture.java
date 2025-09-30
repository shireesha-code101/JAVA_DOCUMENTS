package Module03OOAD.designPatterns.StructuralDP.BridgeMethodDP.demo.src.main.java.com.example;

public class DrawingPicture implements ExcalidrawAPI {
    @Override
    public void drawSquare(int s) {
        System.out.println("Draw square in Drawing Picture using Excalidraw with side " + s);
    }
}
