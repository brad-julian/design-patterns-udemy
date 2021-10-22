package solid.openclosed;

import java.util.List;
import java.util.stream.Stream;

public class NaiveProductFilter {

  public Stream<Product> filterByColor(List<Product> products, Color color) {
    return products.stream().filter(p -> color == p.getColor());
  }

  public Stream<Product> filterBySize(List<Product> products, Size size) {
    return products.stream().filter(p -> size == p.getSize());
  }

  public Stream<Product> filterByColorAndSize(List<Product> products, Color color, Size size) {
    return products.stream().filter(p -> {
      return color == p.getColor() && size == p.getSize();
    });
  }
}
