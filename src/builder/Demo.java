package builder;

import static java.lang.String.format;
import static java.lang.String.join;

public class Demo {

  public static void main(String[] args) {
    String hello = "hello";
    System.out.println("<p>" + hello + "</p>");

    String[] words = {"hello", "world"};
    System.out.println("WITH STRING CONCATENTATION:");
    System.out.println("<ul>\n" + "<li>" + join("</li>\n<li>", words) + "</li>\n</ul>");

    System.out.println();

    StringBuilder sb = new StringBuilder();
    sb.append("<ul>\n");
    for (String word : words) {
      sb.append(format("  <li>%s</li>\n", word));
    }
    sb.append("</ul>");
    System.out.println("WITH STRING BUILDER:");
    System.out.println(sb);
  }
}
