package OOP_Class1;

public class Person {
  public int id;
  public String CPF;
  public String name;
  public double height;
  public double weight;
  public int year_of_birth;

  public Person(int id) {
    this.id = id;
  }

  public Person(int id, String CPF, String name, double height, double weight) {
    this.id = id;
    this.CPF = CPF;
    this.name = name;
    this.height = height;
    this.weight = weight;
  }

  public String printData() {
    return "ID: " + this.id + "\n" +
        "CPF: " + this.CPF + "\n" +
        "name: " + this.name + "\n" +
        "height: " + this.height + "\n" +
        "weight: " + this.weight + "\n";
  }
}
