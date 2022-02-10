package singleton.monostate;

public class Demo {

  public static void main(String[] args) {
    ChiefExecutiveOfficer ceo = new ChiefExecutiveOfficer();
    ceo.setName("Adam Smith");
    ceo.setAge(55);

    ChiefExecutiveOfficer ceo2 = new ChiefExecutiveOfficer();
    System.out.println(ceo2);
  }
}
