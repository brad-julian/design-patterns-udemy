package solid.interfacesegregation;

public class OldFashionedPrinter implements Machine {
  @Override
  public void print(Document document) {
    // print the document
  }

  @Override
  public void fax(Document document) {
    throw new RuntimeException("This old fashioned printer can't fax");
  }

  @Override
  public void scan(Document document) {
    throw new RuntimeException("This old fashioned printer can't scan");
  }
}
