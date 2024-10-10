package com.example.atividadeambiente4;

public class SerieInfinita {
    private int n;   // Número de termos
    private float x; // Valor de x

    // Construtor
    public SerieInfinita(int n, float x) {
        this.n = n;
        this.x = x;
    }

    // Método para calcular o valor da série infinita
    public float calcularSerie() {
        float termo = x;
        float s = x;
        int i = 1;
        float x2 = x * x;

        for (int j = 1; j < n; j++) {
            i = i + 2;
            termo = -termo * x2 / (i * (i - 1));
            s = s + termo;
        }

        return s;
    }
}

