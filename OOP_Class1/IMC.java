package OOP_Class1;

public class IMC {
  public double height;
  public double weight;

  public IMC(double height, double weight) {
    this.height = height;
    this.weight = weight;
  }

  public double calculateIMC() {
    return this.weight / (this.height * this.height);
  }

  public String classifyIMC() {
    if (this.calculateIMC() < 18.5)
      return "You're under the recommended weight";
    else if (this.calculateIMC() >= 18.5 && this.calculateIMC() <= 24.9)
      return "You're in the recommended weight";
    else if (this.calculateIMC() >= 25 && this.calculateIMC() <= 29.9)
      return "Overweight";
    else if (this.calculateIMC() >= 30 && this.calculateIMC() <= 34.9)
      return "Obesity I";
    else if (this.calculateIMC() >= 35 && this.calculateIMC() <= 40)
      return "Obesity II";
    else
      return "Obesity III";
  }
}
