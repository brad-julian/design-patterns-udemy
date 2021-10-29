package builder;

import static java.lang.String.format;
import static java.lang.String.join;

public class Demo {

  public static void main(String[] args) {
    String hello = "hello";
    System.out.println("<p>" + hello + "</p>");

    String[] words = {"hello", "world"};

    System.out.println("\nWITH STRING CONCATENTATION:");
    System.out.println("<ul>\n" + "<li>" + join("</li>\n<li>", words) + "</li>\n</ul>");

    System.out.println("\nWITH STRING BUILDER:");
    StringBuilder sb = new StringBuilder();
    sb.append("<ul>\n");
    for (String word : words) {
      sb.append(format("  <li>%s</li>\n", word));
    }
    sb.append("</ul>");
    System.out.println(sb);

    System.out.println("\nWITH HTML BUILDER:");
    HtmlBuilder htmlBuilder = new HtmlBuilder("ul");
    for (String word : words) {
      htmlBuilder.addChild("li", word);
    }
    System.out.println(htmlBuilder);
  }
}
