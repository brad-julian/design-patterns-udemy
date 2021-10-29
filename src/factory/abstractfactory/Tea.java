package factory.abstractfactory;

public class Tea implements HotDrink {

  @Override
  public void sip() {
    System.out.println("This tea is delicious");
  }
}
