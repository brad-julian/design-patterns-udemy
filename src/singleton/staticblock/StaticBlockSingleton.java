package singleton.staticblock;

import java.io.File;
import java.io.IOException;

public class StaticBlockSingleton {

  private static StaticBlockSingleton instance;

  static { // handles exception thrown by constructor
    try {
      instance = new StaticBlockSingleton();
    } catch (IOException e) {
      System.err.println("Failed to created singleton");
      e.printStackTrace();
    }
  }

  private StaticBlockSingleton() throws IOException {
    System.out.println("Singleton is initializing");
    File.createTempFile(".", ".");
  }

  public static StaticBlockSingleton getInstance() {
    return instance;
  }
}
