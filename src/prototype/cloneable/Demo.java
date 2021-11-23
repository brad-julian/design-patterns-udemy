package prototype.cloneable;

public class Demo {

  public static void main(String[] args) throws CloneNotSupportedException {
    Person johnSmith = new Person(new Address("London Road", 123), new String[]{"John", "Smith"});
    System.out.println(johnSmith);

    Person janeSmith = (Person) johnSmith.clone();
    janeSmith.names[0] = "Jane";
    janeSmith.address.houseNumber = 124;
    System.out.println(janeSmith);
    System.out.println(johnSmith);
  }
}
