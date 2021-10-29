package solid.interfacesegregation;

public class Photocopier implements Printer, Scanner {
  @Override
  public void print(Document document) {
    // print the document
  }

  @Override
  public void scan(Document document) {
    // scan the document
  }
}
