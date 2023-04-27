package composite.shapes;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.join;
import static java.lang.System.lineSeparator;
import static java.util.Collections.nCopies;
import static org.apache.commons.lang3.StringUtils.isBlank;

public class GraphicObject {

  String name = "Group";
  String color;
  List<GraphicObject> children = new ArrayList<>();

  public GraphicObject() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    print(sb, 0);
    return sb.toString();
  }

  private void print(StringBuilder sb, int depth) {
    sb.append(join("", nCopies(depth, "*")))
        .append(depth > 0 ? " " : "")
        .append(isBlank(color) ? "" : color + " ")
        .append(getName())
        .append(lineSeparator());
    for (GraphicObject child : children) {
      child.print(sb, depth + 1);
    }
  }
}
