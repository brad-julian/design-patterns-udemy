package factory.abstractfactory;

import org.javatuples.Pair;
import org.reflections.Reflections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static java.lang.Integer.parseInt;
import static java.lang.String.format;

public class HotDrinksMachine {

  private List<Pair<String, HotDrinkFactory>> namedFactories = new ArrayList<>();

  public HotDrinksMachine() {
    Set<Class<? extends HotDrinkFactory>> hotDrinkFactories = new Reflections("factory.abstractfactory").getSubTypesOf(HotDrinkFactory.class);
    hotDrinkFactories.forEach(hotDrinkFactory -> {
      try {
        Pair<String, HotDrinkFactory> pair = new Pair(
            hotDrinkFactory.getSimpleName().replace("Factory", ""),
            hotDrinkFactory.getDeclaredConstructor().newInstance()
        );
        namedFactories.add(pair);
      } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
        e.printStackTrace();
      }
    });
  }
  
  public HotDrink makeDrink() throws IOException {
    System.out.println("Available drinks:");
    for (int i = 0; i < namedFactories.size(); i++) {
      Pair<String, HotDrinkFactory> drink = namedFactories.get(i);
      System.out.println(format("%s: %s", i, drink.getValue0()));
    }

    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    while (true) {
      String s;
      int i, amount;
      if ((s = bufferedReader.readLine()) != null
          && (i = parseInt(s)) >= 0
          && i < namedFactories.size()) {
        System.out.println("Specify amount (ml):");
        s = bufferedReader.readLine();
        if (s != null && (amount = parseInt(s)) > 0) {
          return namedFactories.get(i).getValue1().prepare(amount);
        }
      }
      System.out.println("Incorrect input, try again");
    }
  }
}
