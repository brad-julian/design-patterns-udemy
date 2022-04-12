package singleton.testability;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Tests {

  @Test
  public void test_singletonTotalPopulation() {
    SingletonRecordFinder rf = new SingletonRecordFinder();

    int totalPop = rf.getTotalPopulation(List.of("Seoul", "Mexico City"));
    assertEquals(17500000+17400000, totalPop);
  }

  @Test
  public void test_configurableTotalPopulation() {
    MockDatabase mockDb = new MockDatabase();
    mockDb.cityPops.put("alpha",1);
    mockDb.cityPops.put("bravo",3);
    mockDb.cityPops.put("charlie",5);

    ConfigurableRecordFinder rf = new ConfigurableRecordFinder(mockDb);

    int totalPop = rf.getTotalPopulation(List.of("alpha", "charlie"));
    assertEquals(6, totalPop);
  }

  class MockDatabase implements PopulationDatabase {

    private Dictionary<String, Integer> cityPops = new Hashtable();

    @Override
    public Integer getPopulation(String cityName) {
      return cityPops.get(cityName);
    }
  }
}
