package builder.fluent;

public class Demo {

  public static void main(String[] args) {
    PersonBuilder personBuilder = new PersonBuilder();

    // no position
    Person brad = personBuilder.withName("Brad").build();

    EmployeeBuilder employeeBuilder = new EmployeeBuilder();

    Person employeeBrad = employeeBuilder.withName("Brad").worksAt("Resonate").build();
  }
}
