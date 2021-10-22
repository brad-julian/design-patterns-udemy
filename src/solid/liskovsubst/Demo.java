package solid.liskovsubst;

public class Demo {

  public static void main(String[] args) {
    Rectangle rect = new Rectangle(2, 3);
    useRectangle(rect);

    Square square = new Square(5);
    useRectangle(square);
  }

  public static void useRectangle(Rectangle r) {
    int width = r.getWidth();
    int newHeight = 10;
    r.setHeight(newHeight);

    int expectedArea = width * newHeight;
    System.out.println("Expected area: " + expectedArea);
    System.out.println("Actual area: " + r.getArea());
  }
}
