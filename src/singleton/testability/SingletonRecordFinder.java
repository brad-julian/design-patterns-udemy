package singleton.testability;

import java.util.List;

public class SingletonRecordFinder {

  public Integer getTotalPopulation(List<String> names) {
    SingletonDatabase cityPops = SingletonDatabase.getInstance();
    Integer total = 0;

    for (String name : names) {
      total += cityPops.getPopulation(name);
    }
    return total;
  }
}
