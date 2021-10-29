package factory.abstractfactory;

import java.io.IOException;

public class Demo {

  public static void main(String[] args) throws IOException {
    HotDrinksMachine hotDrinksMachine = new HotDrinksMachine();

    HotDrink drink = hotDrinksMachine.makeDrink();
    drink.sip();
  }
}
