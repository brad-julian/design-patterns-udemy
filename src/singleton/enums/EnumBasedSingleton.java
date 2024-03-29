package singleton.enums;

public enum EnumBasedSingleton {
  INSTANCE;

  EnumBasedSingleton() {
    value = 42;
  }

  private int value;

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }
}
