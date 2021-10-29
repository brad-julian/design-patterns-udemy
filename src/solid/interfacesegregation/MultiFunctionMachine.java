package solid.interfacesegregation;

//public class MultiFunctionMachine implements Machine {
public class MultiFunctionMachine implements MultiFunctionDevice {
  @Override
  public void print(Document document) {
    // print the document
  }

  @Override
  public void fax(Document document) {
    // fax the document
  }

  @Override
  public void scan(Document document) {
    // scan the document
  }
}
