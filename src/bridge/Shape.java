package bridge;

public abstract class Shape {

  Renderer renderer;

  public Shape(Renderer renderer) {
    this.renderer = renderer;
  }

  public abstract void draw();
  public abstract void resize(float factor);
}
