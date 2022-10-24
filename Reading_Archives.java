import java.io.*;
import java.util.Scanner;

public class Reading_Archives {
  public static void main(String[] args) {
    // endereço >> linha
    // informações >> colunas

    int linhas = 2, colunas = 4;
    Scanner Entrada = new Scanner(System.in);
    Scanner Entrada1 = new Scanner(System.in);
    String[][] address = new String[linhas][colunas];

    String pausa;

    // l for lines, c for columns
    int l, c;
    for (l = 0; l < linhas; l++) {
      System.out.println("Insira o endereço");
      System.out.println("Tipo de logradouro");
      address[l][0] = Entrada1.next();
      System.out.println("nome de logradouro");
      address[l][1] = Entrada.nextLine();
      System.out.println("número");
      address[l][2] = Entrada1.next();
      System.out.println("bairro");
      address[l][3] = Entrada.nextLine();
    }

    System.out.println("Endereços informados");
    pausa = Entrada.next();

    try {
      FileWriter archive = new FileWriter("C:\\home\\isadarub\\Área de Trabalho\\treinos_Java\\archives2.txt", true);
      PrintWriter saveArchive = new PrintWriter(archive);

      for (l = 0; l < linhas; l++) {
        saveArchive.println("\nEndereço " + (l + 1));
        for (c = 0; c < colunas; c++) {
          saveArchive.print(" " + address[l][c].toUpperCase());
        }
        System.out.println("");
      }
      saveArchive.close();
      archive.close();
    } catch (IOException e) {
      System.out.println("Error! Try again");
    }

    System.out.println("Programa finalizado.");
    pausa = Entrada.next();

    // criar objeto
    // criar buffer
    // try catch
    // ler uma linha por vez
    // imprimir uma linha por vez
    // fechar arquivo e buffer
    try {
      FileReader readArchive = new FileReader("C:\\home\\isadarub\\Área de Trabalho\\treinos_Java\\archives2.txt");
      BufferedReader bufferReading = new BufferedReader(readArchive);

      String linha;
      linha = bufferReading.readLine();

      while (linha != null) {
        System.out.println(linha);
        linha = bufferReading.readLine();
      }

      readArchive.close();
      bufferReading.close();
    } catch (IOException e) {
      System.out.println("Error! Can't read document.");
    }
  }
}
