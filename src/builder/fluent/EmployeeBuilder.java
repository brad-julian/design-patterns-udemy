package builder.fluent;

public class EmployeeBuilder extends PersonBuilder<EmployeeBuilder> {

  public EmployeeBuilder worksAt(String position) {
    person.setPosition(position);
    return self();
  }

  @Override
  protected EmployeeBuilder self() {
    return super.self();
  }
}
