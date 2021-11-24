package singleton.enums;

import java.io.*;

public class Demo {

  public static void main(String[] args) throws Exception {
    EnumBasedSingleton instance = EnumBasedSingleton.INSTANCE;

    String filename = "enum_singleton.bin";
    saveToFile(instance, filename);

    instance.setValue(111);

    EnumBasedSingleton deserialized = (EnumBasedSingleton) readFromFile(filename);
    System.out.println(
        "  Same singleton reference? " +
            (instance == deserialized ? "Yes" : "No")
    );

    System.out.println(
        "  Same singleton value? " +
            (instance.getValue() == deserialized.getValue() ? "Yes" : "No")
    );
  }

  static void saveToFile(EnumBasedSingleton singleton, String filename) throws IOException {
    try (FileOutputStream fileStream = new FileOutputStream(filename);
         ObjectOutputStream outputStream = new ObjectOutputStream(fileStream)) {
      outputStream.writeObject(singleton);
    }
  }

  static Object readFromFile(String filename) throws Exception {
    try (FileInputStream fileStream = new FileInputStream(filename);
         ObjectInputStream inputStream = new ObjectInputStream(fileStream)) {
      return inputStream.readObject();
    }
  }
}
