package OOP_Class1;

public class Main {
  public static void main(String[] args) {
    Person ex1 = new Person(1);
    ex1.CPF = "080.074.269-90";
    ex1.name = "Isa Daru";
    ex1.height = 1.58;
    ex1.weight = 61.3;
    System.out.println(ex1.printData());

    IMC objIMC1 = new IMC(ex1.height, ex1.weight);
    System.out.println("IMC: " + objIMC1.calculateIMC() + "\n" +
        "Classification: " + objIMC1.classifyIMC() + "\n");

    Person ex2 = new Person(2, "100.973.909-33", "Leona Christen", 1.80, 70);
    System.out.println(ex2.printData());

    IMC objIMC2 = new IMC(ex2.height, ex2.weight);
    System.out.println("IMC: " + objIMC2.calculateIMC() + "\n" +
        "Classification: " + objIMC2.classifyIMC() + "\n");
  }
}
