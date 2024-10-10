package com.example.atividadeambiente4;

public class QuickSort {
    int array[] = new int[10];

    // Método que executa o QuickSort e retorna o resultado como String
    public String executarQuickSort() {
        // Inicializa o vetor com valores aleatórios
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        // Constrói o resultado como uma string
        StringBuilder resultado = new StringBuilder("Desordenado:\n");
        for (int i = 0; i < array.length; i++) {
            resultado.append(array[i]).append(" ");
        }
        resultado.append("\n");

        // Chama o método quicksort
        quicksort(array, 0, array.length - 1);

        // Adiciona a lista ordenada ao resultado
        resultado.append("\nOrdenado:\n");
        for (int i = 0; i < array.length; i++) {
            resultado.append(array[i]).append(" ");
        }

        return resultado.toString();
    }

    static void quicksort(int array[], int inicio, int fim) {
        if (inicio < fim) {
            int p = particao(array, inicio, fim);
            quicksort(array, inicio, p);        // Correção: vai até `p - 1`
            quicksort(array, p + 1, fim);       // Segunda chamada permanece a partir de `p + 1`
        }
    }

    static int particao(int array[], int inicio, int fim) {
        int meio = (inicio + fim) / 2;
        int pivot = array[meio];
        int i = inicio - 1;
        int j = fim + 1;

        while (true) {
            do {
                i++;
            } while (array[i] < pivot);

            do {
                j--;
            } while (array[j] > pivot);

            if (i >= j) {
                return j;
            }

            int aux = array[i];
            array[i] = array[j];
            array[j] = aux;
        }
    }
}

