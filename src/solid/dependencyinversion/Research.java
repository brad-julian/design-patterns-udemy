package solid.dependencyinversion;

import java.util.List;

import static solid.dependencyinversion.Relationship.PARENT;

public class Research {

//  public Research(Relations relations) {
//    List<Relation> relationList = relations.getRelations();
//    relationList.stream()
//        .filter(relation -> "John".equals(relation.getPerson1().getName()))
//        .filter(relation -> relation.getRelationshipType() == PARENT)
//        .forEach(relation -> System.out.println("John has a child called " + relation.getPerson2().getName()));
//  }

  public Research(RelationshipBrowser relationsBrowser) {
    List<Person> children = relationsBrowser.findAllChildrenOf("John");
    for (Person child : children) {
      System.out.println("John has a child called " + child.getName());
    }
  }
}
