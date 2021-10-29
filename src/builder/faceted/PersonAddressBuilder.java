package builder.faceted;

public class PersonAddressBuilder extends PersonBuilder {

  public PersonAddressBuilder(Person person) {
    this.person = person;
  }

  public PersonAddressBuilder at(String streetAddress) {
    person.setStreetAddress(streetAddress);
    return this;
  }

  public PersonAddressBuilder in(String city) {
    person.setCity(city);
    return this;
  }

  public PersonAddressBuilder withZip(String zipCode) {
    person.setZipCode(zipCode);
    return this;
  }
}
