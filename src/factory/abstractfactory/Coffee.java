package factory.abstractfactory;

public class Coffee implements HotDrink {

  @Override
  public void sip() {
    System.out.println("This coffee is delicious");
  }
}
