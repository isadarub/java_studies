package OOP_Class1;

public class Main {
  public static void main(String[] args) {
    OOP_Class1.Person ex1 = new Person(1);
    ex1.CPF = "080.074.269-90";
    ex1.name = "Isa Daru";
    ex1.height = 1.58;
    ex1.weight = 61.4;
    System.out.println(ex1.printData());

    OOP_Class1.Person ex2 = new Person(2, "100.973.909-33", "Leona Christen", 1.80, 70);
    System.out.println(ex2.printData());
  }
}
