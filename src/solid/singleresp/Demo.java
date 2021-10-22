package solid.singleresp;

import java.io.FileNotFoundException;

public class Demo {

  public static void main(String[] args) throws FileNotFoundException {
    Journal journal = new Journal();
    journal.addEntry("I had a good demo today");
    journal.addEntry("I started a new Udemy course");

    JournalFileWriter p = new JournalFileWriter();
    String filename = "journal.txt";
    p.saveToFile(journal, filename, true);
  }
}