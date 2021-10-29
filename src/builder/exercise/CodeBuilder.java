package builder.exercise;

import java.util.LinkedList;
import java.util.List;

import static java.lang.String.format;
import static java.util.stream.Collectors.joining;

public class CodeBuilder {

  private String className;
  private List<Field> fields = new LinkedList<>();

  public CodeBuilder(String className) {
    this.className = className;
  }

  public CodeBuilder addField(String name, String type) {
    fields.add(new Field(name, type));
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder()
        .append(openClass())
        .append(fieldsString())
        .append("}");
    return sb.toString();
  }

  private String openClass() {
    return format("public class %s\n{\n", className);
  }

  private String fieldsString() {
    return fields.stream()
        .map(field -> format("  public %s %s;\n", field.type, field.name))
        .collect(joining(""));
  }

  private static class Field {
    String name;
    String type;

    public Field(String name, String type) {
      this.name = name;
      this.type = type;
    }
  }
}
