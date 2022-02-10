package singleton.multiton;

import java.util.HashMap;

public class Printer {

  private static HashMap<Subsystem, Printer> instances;
  private static int instanceCount = 0;

  static {
    instances = new HashMap<>();
  }

  private Printer() {
    instanceCount++;
    System.out.println(instanceCount + " total instances created so far");
  }

  public static Printer get(Subsystem ss) {
    if (instances.containsKey(ss)) {
      return instances.get(ss);
    }
    Printer instance = new Printer();
    instances.put(ss, instance);
    return instance;
  }
}
