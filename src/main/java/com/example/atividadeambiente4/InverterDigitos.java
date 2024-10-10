package com.example.atividadeambiente4;

public class InverterDigitos {

    private int n;  // Número para inverter os dígitos

    // Construtor
    public InverterDigitos(int n) {
        this.n = n;
    }

    // Método para inverter os dígitos do número
    public int inverter() {
        int inverso = 0;
        int digito;

        // Processa cada dígito do número e inverte
        while (n > 0) {
            digito = n % 10;
            inverso = inverso * 10 + digito;
            n = n / 10;
        }

        return inverso;  // Retorna o número invertido
    }
}


