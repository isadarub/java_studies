package OOP_Class1;

public class Main {
  public static void main(String[] args) {
    Person ex1 = new Person(1);
    ex1.setCPF("080.074.269-90");
    ex1.setName("Isa Daru");
    ex1.setHeight(1.58);
    ex1.setWeight(61.3);
    System.out.println(ex1.printData());

    IMC objIMC1 = new IMC(ex1.getHeight(), ex1.getWeight());
    System.out.println("IMC: " + objIMC1.calculateIMC() + "\n" +
        "Classification: " + objIMC1.classifyIMC() + "\n");

    Person ex2 = new Person(2, "100.973.909-33", "Leona Christen", 1.80, 70);
    System.out.println(ex2.printData());

    IMC objIMC2 = new IMC(ex2.getHeight(), ex2.getWeight());
    System.out.println("IMC: " + objIMC2.calculateIMC() + "\n" +
        "Classification: " + objIMC2.classifyIMC() + "\n");
  }
}
