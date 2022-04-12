package adapter.vectorraster;

public class VectorRectangle extends VectorObject {

  public VectorRectangle(int x, int y, int width, int height) {
    Point topLeft  = new Point(x, y);
    Point topRight = new Point(x+width, y);
    Point bottomRight = new Point(x+width, y+height);
    Point bottomLeft  = new Point(x, y+height);

    // "draw" our rectangle
    add(new Line(topLeft, topRight));
    add(new Line(topRight, bottomRight));
    add(new Line(bottomRight, bottomLeft));
    add(new Line(bottomLeft, topLeft));
  }
}
