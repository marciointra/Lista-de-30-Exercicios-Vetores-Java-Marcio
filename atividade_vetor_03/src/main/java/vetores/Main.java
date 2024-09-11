package vetores;
/*
Escreva um algoritmo que armazene em um vetor todos os números pares do intervalo
fechado de 1 a 100. Após isso, o algoritmo deve imprimir todos os valores armazenados.
*/
public class Main {
   public static void main(String[] args) {
      int tamVetor = 101;
      int[] vetor = new int[tamVetor]; int[] pares = new int[tamVetor];
      int contadorPar = 0;

      for (int i = 0; i < tamVetor; i++){
         vetor[i] = i;
         if (vetor[i] % 2 == 0) {
            pares[contadorPar] = vetor[i];
            contadorPar++;
         }
      }

      System.out.println("Imprimindo os números pares do vetor:");
      for (int i = 0; i < contadorPar; i++){
         System.out.print(pares[i] + ", ");
      }
   }
}