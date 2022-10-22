import java.util.Scanner;

public class Arrays_Multi {
  // sistema de registro de notas
  //mat = matérias
  //alu = alunes
  public static void main(String[] args){
    int mat=2, alu=3;
    int[][]notas=new int[alu][mat];

    Scanner Teclado=new Scanner(System.in);
    Scanner EntradaNome=new Scanner(System.in);
    // a = contador de alunos, m = contador de matérias
    int a, m;
    String[] nomes=new String[alu];

    for(a=0; a<alu; a++){
      System.out.println("\n\nDigite o nome do aluno: " +(a+1));
      nomes[a]=EntradaNome.nextLine();
      for(m=0; m<mat;m++){
        System.out.println("Digite a nota ");
        notas[a][m]=Teclado.nextInt();
      }
    }

    System.out.println("Imprimindo as notas...");
    
    int soma=0;
    for(a=0; a<alu; a++){
      System.out.println("\nAluno:"+nomes[a]);
      for(m=0; m<mat;m++){
        System.out.print(" "+notas[a][m]+" ");
        soma+=notas[a][m];
      }
      System.out.println("Média do aluno "+(soma/mat));
      soma=0;
    }
  }

}
