package com.example.atividadeambiente4;

public class TrocaDeVariaveis {public String trocaDeValores() {
    int a = 30;
    int b = 40;
    int aux;

    // Armazenar os valores antes e depois da troca
    StringBuilder resultado = new StringBuilder();

    resultado.append("Antes da troca:\n");
    resultado.append("Valor de a: ").append(a).append("\n");
    resultado.append("Valor de b: ").append(b).append("\n");

    // Lógica de troca
    aux = a;
    a = b;
    b = aux;

    resultado.append("Depois da troca:\n");
    resultado.append("Valor de a: ").append(a).append("\n");
    resultado.append("Valor de b: ").append(b).append("\n");

    return resultado.toString(); // Retorna os resultados como uma String formatada
}
}
