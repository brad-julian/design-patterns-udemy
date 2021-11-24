package singleton.basic;

public class Demo {

  public static void main(String[] args) {
    BasicSingleton instance = BasicSingleton.getInstance();
    System.out.println(instance.getValue());

    instance.setValue(5);
    System.out.println(instance.getValue());
  }
}
