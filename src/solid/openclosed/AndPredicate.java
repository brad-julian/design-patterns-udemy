package solid.openclosed;

import java.util.function.Predicate;

public class AndPredicate<T> implements Predicate<T> {

  private Predicate<T> firstPredicate;
  private Predicate<T> secondPredicate;

  public AndPredicate(Predicate<T> firstPredicate, Predicate<T> secondPredicate) {
    this.firstPredicate = firstPredicate;
    this.secondPredicate = secondPredicate;
  }

  @Override
  public boolean test(T t) {
    return firstPredicate.test(t) && secondPredicate.test(t);
  }
}
