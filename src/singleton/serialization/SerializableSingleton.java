package singleton.serialization;

import java.io.Serializable;

public class SerializableSingleton implements Serializable {

  private static final SerializableSingleton INSTANCE = new SerializableSingleton();

  private int value = 0;

  private SerializableSingleton() {
  }

  public static SerializableSingleton getInstance() {
    return INSTANCE;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  protected Object readResolve() {
    return INSTANCE;
  }
}
