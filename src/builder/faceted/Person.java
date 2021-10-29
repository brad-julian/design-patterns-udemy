package builder.faceted;

public class Person {

  // address
  private String streetAddress;
  private String city;
  private String zipCode;

  // employment
  private String companyName;
  private String position;
  private int annualIncome;

  public String getStreetAddress() {
    return streetAddress;
  }

  public void setStreetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public int getAnnualIncome() {
    return annualIncome;
  }

  public void setAnnualIncome(int annualIncome) {
    this.annualIncome = annualIncome;
  }

  @Override
  public String toString() {
    return "Person{" +
        "streetAddress='" + streetAddress + '\'' +
        ", city='" + city + '\'' +
        ", postcode='" + zipCode + '\'' +
        ", companyName='" + companyName + '\'' +
        ", position='" + position + '\'' +
        ", annualIncome=" + annualIncome +
        '}';
  }
}
