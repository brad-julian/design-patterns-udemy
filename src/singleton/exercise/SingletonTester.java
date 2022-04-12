package singleton.exercise;

import java.util.function.Supplier;

class SingletonTester {
  public static boolean isSingleton(Supplier<Object> func) {
    Object instanceOne = func.get();
    Object instanceTwo = func.get();

    return instanceOne == instanceTwo;
  }
}