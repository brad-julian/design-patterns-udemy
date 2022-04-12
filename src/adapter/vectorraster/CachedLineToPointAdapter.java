package adapter.vectorraster;

import java.util.*;
import java.util.function.Consumer;

import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.String.format;

public class CachedLineToPointAdapter implements Iterable<Point> {

  private static int count = 0;
  private static Map<Integer, List<Point>> cache = new HashMap();
  private int hash;

  public CachedLineToPointAdapter(Line line) {
    hash = line.hashCode();
    if (cache.containsKey(hash)) { return; }

    ArrayList<Point> points = new ArrayList<>();

    Point lineStart = line.getStart();
    Point lineEnd = line.getEnd();
    System.out.println(format(
        "%d: Generating points for line [%d,%d]-[%d,%d] (with caching)",
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
        points.add(new Point(left, y));
      }
    } else if (dy == 0) {
      for (int x = left; x <= right; ++x) {
        points.add(new Point(x, top));
      }
    }

    cache.put(hash, points);
  }

  @Override
  public Iterator<Point> iterator() {
    return cache.get(hash).iterator();
  }

  @Override
  public void forEach(Consumer<? super Point> action) {
    cache.get(hash).forEach(action);
  }
}
