package composite.neuralnet;

import java.util.*;
import java.util.function.Consumer;

public class Neuron implements SomeNeurons {

  List<Neuron> in, out;

  public void addIn(Neuron other) {
    in.add(other);
  }

  public void addOut(Neuron other) {
    out.add(other);
  }

  @Override
  public Iterator<Neuron> iterator() {
    return Collections.singleton(this).iterator();
  }

  @Override
  public Spliterator<Neuron> spliterator() {
    return Collections.singleton(this).spliterator();
  }

  @Override
  public void forEach(Consumer<? super Neuron> action) {
    action.accept(this);
  }
}
