package prototype.serialization;

import org.apache.commons.lang3.SerializationUtils;

public class Demo {

  public static void main(String[] args) {
    Foo life = new Foo(42, "life");
    Foo universe = SerializationUtils.roundtrip(life);
    universe.whatever = "universe";

    System.out.println(life);
    System.out.println(universe);
  }
}
