import java.util.Scanner;

public class Arrays {
  
  // public static void main (String[] args){
  //   int nota1, nota2, nota3;
  //   int soma, tam=3;
  //   int[]notas=new int[tam];

  //   Scanner Teclado=new Scanner(System.in);

  //   System.out.println("Digite a nota1");
  //   notas[0]=Teclado.nextInt();
  //   System.out.println("Digite a nota2");
  //   notas[1]=Teclado.nextInt();
  //   System.out.println("Digite a nota3");
  //   notas[2]=Teclado.nextInt();

  //   soma=notas[0]+notas[1]+notas[2];

  //   System.out.println("A soma é "+ soma);
  // }


  public static void main (String[] args){
    int soma=0, tam=5;
    int[]notas=new int[tam];

    Scanner Teclado=new Scanner(System.in);

    for(int i=0; i<tam;i++){
      System.out.println("Digite a nota "+(i+1));
      notas[i]=Teclado.nextInt();
      soma+=notas[i];
    }

    System.out.println("A soma é "+ soma);
  }
}
