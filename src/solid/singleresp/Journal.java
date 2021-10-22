package solid.singleresp;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.join;
import static java.lang.System.lineSeparator;

public class Journal {
  private final List<String> entries = new ArrayList<>();
  private static int count = 0;

  public void addEntry(String text) {
    entries.add("" + (++count) + ": " + text);
  }

  public void removeEntry(int index) {
    entries.remove(index);
  }

  public String entriesString() {
    return entriesString(lineSeparator());
  }

  public String entriesString(String entryDelimiter) {
    return join(entryDelimiter, entries);
  }

  @Override
  public String toString() {
    return "Journal {" + lineSeparator() +
        "  " + entriesString(lineSeparator() + "  ") + lineSeparator() +
        "}";
  }
}
