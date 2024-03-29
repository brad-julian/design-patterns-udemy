package bridge;

public class Demo {

  public static void main(String[] args) {
    RasterRenderer rasterRenderer = new RasterRenderer();
    VectorRenderer vectorRenderer = new VectorRenderer();

    Circle circle = new Circle(vectorRenderer, 5);
    circle.draw();
    circle.resize(2);
    circle.draw();
  }
}
