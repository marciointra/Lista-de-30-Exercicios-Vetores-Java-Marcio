package atividade_vetor_01;
/*  Escreva um algoritmo que armazene em um vetor todos os números inteiros de 0 a 50.
    Após isso, o algoritmo deve imprimir todos os valores armazenados. 
*/

import java.io.DataInputStream;

public class Main {
    public static void main(String[] args) {
        DataInputStream digite = new DataInputStream(System.in);
        int tamVetor = 51;
        int[] salvarNumeros = new int[tamVetor];

        for (int i=0; i<tamVetor; i++) {
                salvarNumeros[i] = i;
        }
        for (int j=0; j<tamVetor; j++){
            System.out.print(salvarNumeros[j]+"|");
        }
    }
}