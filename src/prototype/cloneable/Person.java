package prototype.cloneable;

import java.util.Arrays;

public class Person {

  public Address address;
  public String[] names;

  public Person(Address address, String[] names) {
    this.address = address;
    this.names = names;
  }

  @Override
  public String toString() {
    return "Person{" +
        "address=" + address +
        ", names=" + Arrays.toString(names) +
        '}';
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return new Person((Address) address.clone(), names.clone());
  }
}
