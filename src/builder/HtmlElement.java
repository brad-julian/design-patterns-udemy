package builder;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;
import static java.lang.String.join;
import static java.util.Collections.nCopies;

public class HtmlElement {

  String name;
  private String text;
  List<HtmlElement> elements = new ArrayList<>();

  private final int indentSize = 2;
  private final String newLine = System.lineSeparator();

  public HtmlElement() {  }

  public HtmlElement(String name, String text) {
    this.name = name;
    this.text = text;
  }

  private String indentSpaces(int numSpaces) {
    List<String> spaces = nCopies(numSpaces, " ");
    return join("", spaces);
  }
  private String openingTag(String indentSpaces) {
    return format("%s<%s>%s", indentSpaces, name, newLine);
  }

  private String closingTag(String indentSpaces) {
    return format("%s</%s>%s", indentSpaces, name, newLine);
  }

  private String toStringImpl(int indentLevel) {
    StringBuilder stringBuilder = new StringBuilder();
    String i = indentSpaces(indentLevel * indentSize);
    stringBuilder.append(openingTag(i));

    if (text != null && !text.isBlank()) {
      stringBuilder.append(indentSpaces(indentSize * (indentLevel+1)))
          .append(text)
          .append(newLine);
    }

    for (HtmlElement element : elements) {
      stringBuilder.append(element.toStringImpl(indentLevel + 1));
    }

    stringBuilder.append(closingTag(i));

    return stringBuilder.toString();
  }

  @Override
  public String toString() {
    return toStringImpl(0);
  }
}
