package decorator.string;

public class Demo {

  public static void main(String[] args) {
    MagicString helloWorld = new MagicString("Hello, world!");
    System.out.println("The string \"" + helloWorld + "\" has " + helloWorld.getNumberOfVowels() + " vowels");
  }
}
