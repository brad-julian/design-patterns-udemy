package singleton.innerstatic;

public class InnerStaticSingleton {

  private InnerStaticSingleton() {
    System.out.println("Initializing a singleton from inner static class");
  }

  public InnerStaticSingleton getInstance() {
    return Impl.INSTANCE;
  }

  private static class Impl {
    private static final InnerStaticSingleton INSTANCE = new InnerStaticSingleton();
  }
}
