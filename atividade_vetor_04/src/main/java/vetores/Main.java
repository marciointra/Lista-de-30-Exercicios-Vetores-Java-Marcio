package vetores;

/* Escreva um algoritmo em JAVA que armazene em um vetor o quadrado dos números ímpares no intervalo
   fechado de 1 a 20. Após isso, o algoritmo deve imprimir todos os valores armazenados.
*/

public class Main {
   public static void main(String[] args) {
      int tamVetor = 10;
      int[] numerosImparesQuadrados = new int[tamVetor];
      int contador = 0;

      for (int i = 1; i <= 20; i++) {
         if (i % 2 != 0) {
            numerosImparesQuadrados[contador] = i * i;
            contador++;
         }
      }

      System.out.println("Imprimindo quadrados dos números ímpares no intervalo de 1 a 20:");
      for (int i = 0; i < contador; i++) {
         System.out.print(numerosImparesQuadrados[i] + ", ");
      }
   }
}