package builder.faceted;

public class Demo {

  public static void main(String[] args) {
    PersonBuilder personBuilder = new PersonBuilder();

    Person person = personBuilder
        .lives()
          .at("123 London Road")
          .in("London")
          .withZip("12345")
        .works()
          .at("Fabrikam")
          .asA("Engineer")
          .earning(100_000)
        .build();
    System.out.println(person);
  }
}
