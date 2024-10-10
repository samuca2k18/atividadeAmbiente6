package com.example.atividadeambiente4;

public class Contagem {
    // Método para contar alunos aprovados
    public String contarAprovados(int n, int[] notas) {
        int cont = 0;

        // Percorre as notas e conta os alunos aprovados (nota >= 50)
        for (int nota : notas) {
            if (nota >= 50) {
                cont++;
            }
        }

        // Retorna a contagem de alunos aprovados e o total de alunos
        return "São " + n + " alunos\n" + "São " + cont + " alunos aprovados";
    }
}
