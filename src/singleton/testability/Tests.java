package singleton.testability;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Tests {

  @Test
  public void test_singletonTotalPopulation() {
    SingletonRecordFinder rf = new SingletonRecordFinder();

    int totalPop = rf.getTotalPopulation(List.of("Seoul", "Mexico City"));
    assertEquals(17500000+17400000, totalPop);
  }
}
