package solid.openclosed;

public class Product {
  private String name;
  private Color color;
  private Size size;

  public Product() {
  }

  public Product(String name, Color color, Size size) {
    this.name = name;
    this.color = color;
    this.size = size;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public Size getSize() {
    return size;
  }

  public void setSize(Size size) {
    this.size = size;
  }

  @Override
  public String toString() {
    return "Product{" +
        "name='" + name + '\'' +
        ", color=" + color +
        ", size=" + size +
        '}';
  }
}
