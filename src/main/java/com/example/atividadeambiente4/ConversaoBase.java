package com.example.atividadeambiente4;

public class ConversaoBase {

    private int n;  // Número para conversão

    // Construtor
    public ConversaoBase(int n) {
        this.n = n;
    }

    // Método para converter o número para binário
    public String converterParaBinario() {
        int q = n;
        int ndigit = 0;
        int novarep[] = new int[100];
        int r;
        StringBuilder resultadoBinario = new StringBuilder();

        // Faz a conversão para binário
        do {
            r = q % 2;
            novarep[ndigit] = r;
            ndigit++;
            q = q / 2;
        } while (q != 0);

        // Constrói o número binário em ordem inversa
        for (int i = ndigit - 1; i >= 0; i--) {
            resultadoBinario.append(novarep[i]);
        }

        return resultadoBinario.toString();  // Retorna o número convertido como uma string
    }
}
