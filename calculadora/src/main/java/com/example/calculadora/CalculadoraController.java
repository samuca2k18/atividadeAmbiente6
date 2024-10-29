package com.example.calculadora;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

@RestController
public class CalculadoraController {

    @GetMapping("/operacao")
    public String operacao(@RequestParam String tipo) {
        switch (tipo) {
            case "Primos":
                return calcularPrimos(10).toString();
            case "Somatório":
                return Integer.toString(somatorio(10));
            case "Fibonacci":
                return Integer.toString(fibonacci(10));
            case "MDC":
                return Integer.toString(mdc(48, 18));
            case "QuickSort":
                int[] array = {3, 6, 8, 10, 1, 2, 1};
                return Arrays.toString(quicksort(array));
            case "Contagem":
                return Integer.toString(contagem(new int[]{1, 2, 3, 4, 5}));
            default:
                return "Operação não encontrada";
        }
    }

    private List<Integer> calcularPrimos(int n) {
        List<Integer> primos = new ArrayList<>();
        for (int i = 2; primos.size() < n; i++) {
            int finalI = i;
            if (primos.stream().allMatch(p -> finalI % p != 0)) {
                primos.add(i);
            }
        }
        return primos;
    }

    private int somatorio(int n) {
        return IntStream.rangeClosed(1, n).sum();
    }

    private int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    private int mdc(int a, int b) {
        return b == 0 ? a : mdc(b, a % b);
    }

    private int[] quicksort(int[] arr) {
        if (arr.length <= 1) return arr;
        int pivot = arr[0];
        int[] menores = Arrays.stream(arr).skip(1).filter(x -> x <= pivot).toArray();
        int[] maiores = Arrays.stream(arr).skip(1).filter(x -> x > pivot).toArray();
        return IntStream.concat(
                IntStream.concat(Arrays.stream(quicksort(menores)), IntStream.of(pivot)),
                Arrays.stream(quicksort(maiores))
        ).toArray();
    }

    private int contagem(int[] arr) {
        return arr.length;
    }
}
