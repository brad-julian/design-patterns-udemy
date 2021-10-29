package solid.dependencyinversion;

public class Relation {

  private Person person1;
  private Relationship relationshipType;
  private Person person2;

  public Relation(Person person1, Relationship relationshipType, Person person2) {
    this.person1 = person1;
    this.relationshipType = relationshipType;
    this.person2 = person2;
  }

  public Person getPerson1() {
    return person1;
  }

  public Relationship getRelationshipType() {
    return relationshipType;
  }

  public Person getPerson2() {
    return person2;
  }
}
