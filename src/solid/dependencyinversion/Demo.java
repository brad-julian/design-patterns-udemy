package solid.dependencyinversion;

public class Demo {

  public static void main(String[] args) {
    Person parent = new Person("John");
    Person child1 = new Person("Chris");
    Person child2 = new Person("Matt");

    Relations relations = new Relations();
    relations.addParentAndChild(parent, child1);
    relations.addParentAndChild(parent, child2);

    new Research(relations);
  }
}
