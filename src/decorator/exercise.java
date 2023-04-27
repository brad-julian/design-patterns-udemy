class Bird
{
  public int age;

  public String fly()
  {
    return age < 10 ? "flying" : "too old";
  }
}

class Lizard
{
  public int age;

  public String crawl()
  {
    return (age > 1) ? "crawling" : "too young";
  }
}

class Dragon
{

  private Bird birdSelf;
  private Lizard lizardSelf;

  public Dragon() {
    birdSelf = new Bird();
    lizardSelf = new Lizard();
  }

  private int age;
  public void setAge(int age)
  {
    birdSelf.age = age;
    lizardSelf.age = age;
  }
  public String fly()
  {
    return birdSelf.fly();
  }
  public String crawl()
  {
    return lizardSelf.crawl();
  }
}