package adapter.vectorraster;

import java.util.List;

public class Demo {

  private static final List<VectorObject> vectorObjects = List.of(
      new VectorRectangle(1, 1, 10, 10),
      new VectorRectangle(3, 3, 6, 6)
  );

  public static void main(String[] args) {
    draw();
    draw(true);
    draw(true);
  }

  public static void drawPoint(Point p) {
    System.out.println(".");
  }

  private static void draw() {
    draw(false);
  }

  private static void draw(boolean useCache) {
    for (VectorObject vo : vectorObjects) {
      for (Line line : vo) {
        if (useCache) {
          CachedLineToPointAdapter adapter = new CachedLineToPointAdapter(line);
          adapter.forEach(Demo::drawPoint);
        } else {
          LineToPointAdapter adapter = new LineToPointAdapter(line);
          adapter.forEach(Demo::drawPoint);
        }
      }
    }
  }
}
