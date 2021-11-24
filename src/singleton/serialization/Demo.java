package singleton.serialization;

import java.io.*;

public class Demo {

  public static void main(String[] args) throws Exception {
    // Things that circumvent basic singleton approach:
    //   1. reflection
    //   2. serialization
    BasicSingleton basicSingleton = BasicSingleton.getInstance();
    basicSingleton.setValue(111);

    String filename = "singleton.bin";
    saveToFile(basicSingleton, filename);

    basicSingleton.setValue(222);

    BasicSingleton basicDeserialized = (BasicSingleton) readFromFile(filename);

    System.out.println("Basic approach:");
    System.out.println(
        "  Same singleton reference? " +
        (basicSingleton == basicDeserialized ? "Yes" : "No")
    );

    System.out.println(
        "  Same singleton value? " +
        (basicSingleton.getValue() == basicDeserialized.getValue() ? "Yes" : "No")
    );

    SerializableSingleton serializableSingleton = SerializableSingleton.getInstance();
    serializableSingleton.setValue(111);

    saveToFile(serializableSingleton, filename);

    serializableSingleton.setValue(222);

    SerializableSingleton serializableDeserialized = (SerializableSingleton) readFromFile(filename);

    System.out.println("Serializable approach:");
    System.out.println(
        "  Same singleton reference? " +
            (serializableSingleton == serializableDeserialized ? "Yes" : "No")
    );

    System.out.println(
        "  Same singleton value? " +
            (serializableSingleton.getValue() == serializableDeserialized.getValue() ? "Yes" : "No")
    );
  }

  static void saveToFile(BasicSingleton singleton, String filename) throws IOException {
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

  static void saveToFile(SerializableSingleton singleton, String filename) throws IOException {
    try (FileOutputStream fileStream = new FileOutputStream(filename);
         ObjectOutputStream outputStream = new ObjectOutputStream(fileStream)) {
      outputStream.writeObject(singleton);
    }
  }
}
