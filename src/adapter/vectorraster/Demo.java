package adapter.vectorraster;

import java.util.List;

public class Demo {

  private static final List<VectorObject> vectorObjects = List.of(
      new VectorRectangle(1, 1, 10, 10),
      new VectorRectangle(3, 3, 6, 6)
  );

  public static void main(String[] args) {
    draw();
  }

  public static void drawPoint(Point p) {
    System.out.println(".");
  }

  private static void draw() {
    for (VectorObject vo : vectorObjects) {
      for (Line line : vo) {
        LineToPointAdapter adapter = new LineToPointAdapter(line);
        adapter.forEach(Demo::drawPoint);
      }
    }
  }
}
