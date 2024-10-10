package com.example.atividadeambiente4;

public class NumeroPrimo {

    public String verificarPrimo(int n) {
        int i = 2, cont = 0;

        // Verifica se o número é primo
        while (i < n) {
            if (n % i == 0) {
                cont++;
            }
            i++;
        }

        // Retorna a mensagem com base na verificação
        if (cont == 0) {
            return "O número " + n + " é primo";
        } else {
            return "O número " + n + " não é primo";
        }
    }
}
