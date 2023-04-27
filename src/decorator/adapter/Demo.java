package decorator.adapter;

public class Demo {

  public static void main(String[] args) {
    MyStringBuilder msb = new MyStringBuilder();
    msb.append("Hello").appendLine(", world!");
    System.out.println(msb.concat("And this too"));
  }
}
