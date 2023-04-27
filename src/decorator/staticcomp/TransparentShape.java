package decorator.staticcomp;

import java.util.function.Supplier;

public class TransparentShape<T extends Shape> implements Shape {

  private Shape shape;
  private int transparency;

  public TransparentShape(Supplier<? extends T> ctor, int transparency) {
    this.shape = ctor.get();
    this.transparency = transparency;
  }

  @Override
  public String info() {
    return shape.info() + " and has " + transparency + "% transparency";
  }
}
