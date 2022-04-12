package singleton.testability;

import java.util.List;

public class ConfigurableRecordFinder {

  private PopulationDatabase database;

  public ConfigurableRecordFinder(PopulationDatabase database) {
    this.database = database;
  }

  public Integer getTotalPopulation(List<String> names) {
    Integer total = 0;

    for (String name : names) {
      total += database.getPopulation(name);
    }
    return total;
  }
}
