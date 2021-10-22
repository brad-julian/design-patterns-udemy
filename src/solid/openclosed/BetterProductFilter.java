package solid.openclosed;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class BetterProductFilter implements Filter<Product> {

  @Override
  public Stream<Product> filter(List<Product> items, Predicate<Product> spec) {
    return items.stream().filter(p -> spec.test(p));
  }
}
