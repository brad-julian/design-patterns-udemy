package solid.liskovsubst;

public class RectangleFactory {

  public static Rectangle newRectangle(int width, int height) {
    return new Rectangle(width, height);
  }

  public static Rectangle newSquare(int size) {
    return new Rectangle(size, size);
  }
}
