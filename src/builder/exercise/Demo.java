package builder.exercise;

public class Demo {

  public static void main(String[] args) {
    CodeBuilder codeBuilder = new CodeBuilder("Person")
        .addField("name", "String")
        .addField("age", "int");

    System.out.println(codeBuilder);

    System.out.println(new CodeBuilder("Foo"));
  }
}
