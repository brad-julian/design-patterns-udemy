package solid.openclosed;

import java.util.function.Predicate;

public class SizePredicate implements Predicate<Product> {

  private Size size;

  public SizePredicate(Size size) {
    this.size = size;
  }

  @Override
  public boolean test(Product product) {
    return size == product.getSize();
  }
}