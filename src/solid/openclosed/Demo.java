package solid.openclosed;

import java.util.List;
import java.util.function.Consumer;

import static solid.openclosed.Color.BLUE;
import static solid.openclosed.Color.GREEN;
import static solid.openclosed.Size.LARGE;
import static solid.openclosed.Size.SMALL;

public class Demo {

  public static void main(String[] args) {
    Product apple = new Product("Apple", GREEN, SMALL);
    Product tree = new Product("Tree", GREEN, LARGE);
    Product house = new Product("House", BLUE, LARGE);

    List<Product> products = List.of(apple, tree, house);

    NaiveProductFilter npf = new NaiveProductFilter();
    System.out.println("Green Products (naive): ");
    npf.filterByColor(products, GREEN).forEach(printProducts());

    System.out.println();

    BetterProductFilter bpf = new BetterProductFilter();
    System.out.println("Large Products (better): ");
    bpf.filter(products, new SizePredicate(LARGE)).forEach(printProducts());

    System.out.println();

    AndPredicate<Product> smallAndGreen = new AndPredicate<>(new SizePredicate(SMALL), new ColorPredicate(GREEN));
    System.out.println("Small green Products (and spec): ");
    bpf.filter(products, smallAndGreen).forEach(printProducts());

    System.out.println();

    System.out.println("Large blue Products (concat predicate): ");
    bpf.filter(products, new SizePredicate(LARGE))
        .filter(new ColorPredicate(BLUE))
        .forEach(printProducts());
  }

  private static Consumer<Product> printProducts() {
    return new Consumer<Product>() {
      @Override
      public void accept(Product product) {
        System.out.println("  " + product.toString());
      }
    };
  }
}
