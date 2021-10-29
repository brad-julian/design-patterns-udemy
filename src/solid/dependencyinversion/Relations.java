package solid.dependencyinversion;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;
import static solid.dependencyinversion.Relationship.CHILD;
import static solid.dependencyinversion.Relationship.PARENT;

public class Relations implements RelationshipBrowser {

  private List<Relation> relations = new ArrayList<>();

  public List<Relation> getRelations() {
    return relations;
  }

  public void addParentAndChild(Person parent, Person child) {
    relations.add(new Relation(parent, PARENT, child));
    relations.add(new Relation(child, CHILD, parent));
  }

  @Override
  public List<Person> findAllChildrenOf(String name) {
    return relations.stream()
        .filter(relation -> name.equals(relation.getPerson1().getName()))
        .filter(relation -> relation.getRelationshipType() == PARENT)
        .map(relation -> relation.getPerson2())
        .collect(toList());
  }
}
