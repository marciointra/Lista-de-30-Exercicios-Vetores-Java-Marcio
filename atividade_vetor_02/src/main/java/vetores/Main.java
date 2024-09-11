package vetores;

import java.util.Arrays;
import java.util.Random;

/*
   Escreva um algoritmo que armazene em um vetor todos os números inteiros de 100 a
   1 (em ordem decrescente). Após isso, o algoritmo deve imprimir todos os valores
   armazenados.
*/
public class Main {
   public static void main(String[] args) {
      // Criando um vetor para armazenar os números inteiros
      int tamVetor = 101;
      int[] vetor = new int[tamVetor];

      for (int i = 0; i < tamVetor; i++) {
         vetor[i] = i;
      }

      // Ordenando o vetor em ordem decrescente usando uma variável auxiliar
      for (int i = 0; i <= 50; i++) {
         int aux = vetor[i];
         vetor[i] = vetor[100 - i];
         vetor[100 - i] = aux;
      }

      // Imprimindo os valores armazenados
      System.out.println("Imprimindo números inteiros em ordem decrescente:");
      for (int i = 0; i < vetor.length; i++) {
         System.out.print(vetor[i] + ", ");
      }
   }
}