package bridge;

public class Circle extends Shape {

  private float radius;

  public Circle(Renderer renderer) {
    super(renderer);
  }

  public Circle(Renderer renderer, float radius) {
    super(renderer);
    this.radius = radius;
  }

  public float getRadius() {
    return radius;
  }

  public void setRadius(float radius) {
    this.radius = radius;
  }

  @Override
  public void draw() {
    renderer.renderCircle(radius);
  }

  @Override
  public void resize(float factor) {
    radius *= factor;
  }
}
