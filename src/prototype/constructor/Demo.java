package prototype.constructor;

public class Demo {

  public static void main(String[] args) {
    Employee johnSmith = new Employee("John Smith", new Address("123 London Road", "London", "UK"));
    System.out.println(johnSmith);

    Employee janeSmith = new Employee(johnSmith);
    janeSmith.name = "Jane Smith";
    janeSmith.address.streetAddress = "124 London Road";
    System.out.println(janeSmith);
    System.out.println(johnSmith);
  }
}
