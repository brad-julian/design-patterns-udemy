package factory;

import static factory.CoordinateSystem.POLAR;
import static java.lang.Math.cos;
import static java.lang.Math.sin;

public class Point {

  private double x, y;

  private Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  private Point(double a, double b, CoordinateSystem cs) {
    if (cs == POLAR) {
      x = a * cos(b);
      y = a * sin(b);
    } else {
      x = a;
      y = b;
    }
  }

  public static class Factory {
    public static Point newCartesianPoint(double x, double y) {
      return new Point(x, y);
    }

    public static Point newPolarPoint(double rho, double theta) {
      return new Point(rho * cos(theta), rho * sin(theta));
    }
  }
}
