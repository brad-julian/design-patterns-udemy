package solid.interfacesegregation;

import jdk.jshell.spi.ExecutionControl;

public interface Machine {

  void print(Document document);

  void fax(Document document);

  void scan(Document document) throws ExecutionControl.NotImplementedException;
}
