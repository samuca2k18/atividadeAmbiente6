package com.example.atividadeambiente4;

public class Fibonacci {
    public String sequenciaFibonacci(int n) {
        // Usaremos um StringBuilder para armazenar o resultado
        StringBuilder resultado = new StringBuilder();

        int a = 0, b = 1;

        if (n <= 0) {
            return "Por favor, insira um número maior que 0.";
        } else if (n == 1) {
            return String.valueOf(a);  // Se n for 1, retorna apenas o primeiro termo
        } else {
            resultado.append(a).append(", ").append(b);  // Adiciona os dois primeiros termos

            for (int i = 2; i < n; i++) {
                int proximo = a + b;
                resultado.append(", ").append(proximo);
                a = b;
                b = proximo;
            }
        }

        return resultado.toString();  // Retorna a sequência como uma String
    }
}
