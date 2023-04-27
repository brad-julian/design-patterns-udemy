package composite.neuralnet;

public interface SomeNeurons extends Iterable<Neuron> {

  default void connectTo(SomeNeurons other) {
    if (this == other) return;

    for (Neuron from : this) {
      for (Neuron to : other) {
        from.addOut(to);
        to.addIn(from);
      }
    }
  }
}
