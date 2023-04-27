package decorator.dynamiccomp;

public class TransparentShape implements Shape {

  private Shape shape;
  private int transparency;

  public TransparentShape() {
  }

  public TransparentShape(Shape shape, int transparency) {
    this.shape = shape;
    this.transparency = transparency;
  }

  @Override
  public String info() {
    return shape.info() + " and has " + transparency + "% transparency";
  }
}
