package factory.exercise;

public class PersonFactory {

  private int i = 0;

  public Person createPerson(String name) {
    return new Person(i++, name);
  }
}
