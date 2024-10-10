package com.example.atividadeambiente4;

public class Fatorial {

    public int n;  // Número para calcular o fatorial

    // Construtor
    public Fatorial(int n) {
        this.n = n;
    }

    // Método para calcular o fatorial
    public int calcularFatorial() {
        int prod = 1;

        // Calcular o fatorial
        for (int i = 1; i <= n; i++) {
            prod *= i;
        }

        return prod;  // Retorna o resultado do fatorial
    }
}
