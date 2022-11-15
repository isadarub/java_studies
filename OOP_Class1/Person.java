package OOP_Class1;

public class Person {
  private int id;
  private String CPF;
  private String name;
  private double height;
  private double weight;

  public Person(int id) {
    this.id = id;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getCPF() {
    return CPF;
  }

  public void setCPF(String cPF) {
    CPF = cPF;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
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
