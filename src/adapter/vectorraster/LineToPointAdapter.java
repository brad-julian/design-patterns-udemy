package adapter.vectorraster;

import java.util.ArrayList;

import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.String.format;

public class LineToPointAdapter extends ArrayList<Point> {

  private static int count = 0;

  public LineToPointAdapter(Line line) {
    Point lineStart = line.getStart();
    Point lineEnd = line.getEnd();
    System.out.println(format(
        "%d: Generating points for line [%d,%d]-[%d,%d] (no caching)",
        ++count, lineStart.getX(), lineStart.getY(), lineEnd.getX(), lineEnd.getY()
    ));

    int left = min(lineStart.getX(), lineEnd.getX());
    int right = max(lineStart.getX(), lineEnd.getX());
    int top = min(lineStart.getY(), lineEnd.getY());
    int bottom = max(lineStart.getY(), lineEnd.getY());
    int dx = right - left;
    int dy = lineEnd.getY() - lineStart.getY();

    if (dx == 0) {
      for (int y = top; y <= bottom; ++y) {
        add(new Point(left, y));
      }
    } else if (dy == 0) {
      for (int x = left; x <= right; ++x) {
        add(new Point(x, top));
      }
    }
  }
}
