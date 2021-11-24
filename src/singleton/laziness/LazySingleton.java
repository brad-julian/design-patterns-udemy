package singleton.laziness;

public class LazySingleton {

  private static LazySingleton instance;

  private LazySingleton() {
    System.out.println("Initializing a lazy singleton");
  }

  // This method is not thread safe.
  /*public static LazySingleton getInstance() {
    if (instance == null) {
      instance = new LazySingleton();
    }
    return instance;
  }*/

  // This method has performance concerns
  /*public static synchronized LazySingleton getInstance() {
    if (instance == null) {
      instance = new LazySingleton();
    }
    return instance;
  }*/

  // this is outdated in many ways, but is good to be aware of
  public static LazySingleton getInstance() {
    if (instance == null) {
      synchronized (LazySingleton.class) {
        if (instance == null) {
          instance = new LazySingleton();
        }
      }
    }
    return instance;
  }
}
