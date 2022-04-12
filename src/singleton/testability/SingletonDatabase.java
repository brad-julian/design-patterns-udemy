package singleton.testability;

import com.google.common.collect.Iterables;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

import static java.lang.Integer.parseInt;

public class SingletonDatabase implements PopulationDatabase {
  private static int instanceCount = 0;
  private static final SingletonDatabase INSTANCE = new SingletonDatabase();

  private Dictionary<String, Integer> capitals = new Hashtable<>();

  private SingletonDatabase() {
    instanceCount++;

    initializeDatabase();
  }

  private void initializeDatabase() {
    System.out.println("Initializing database");

    try {
      File file = new File(
          SingletonDatabase.class.getProtectionDomain().getCodeSource().getLocation().getPath()
      );
      Path fullPath = Paths.get(file.getPath(), "capitals.txt");
      List<String> lines = Files.readAllLines(fullPath);

      Iterables.partition(lines, 2).forEach(kv -> {
        capitals.put(kv.get(0).trim(), parseInt(kv.get(1)));
      });
    } catch (Exception e) {
      System.err.println(e);
    }
  }

  public static SingletonDatabase getInstance() {
    return INSTANCE;
  }

  public Integer getPopulation(String name) {
    return capitals.get(name);
  }
}
