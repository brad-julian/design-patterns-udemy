package solid.openclosed;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface Filter<T> {
  Stream<T> filter(List<T> items, Predicate<T> spec);
}
