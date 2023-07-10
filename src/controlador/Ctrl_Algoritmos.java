package controlador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ctrl_Algoritmos {

    public static boolean busquedaSecuencial(ArrayList<Integer> lista, int elemento) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) == elemento) {
                return true; // Se encontró el elemento en la lista
            }
        }
        return false; // No se encontró el elemento en la lista
    }

    public static void radixSort(ArrayList<Character> lista) {
        if (lista == null || lista.isEmpty()) {
            return;
        }

        // Obtener el valor máximo en la lista para determinar el número de dígitos
        int max = Collections.max(lista);

        // Realizar el ordenamiento Radix
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(lista, exp);
        }
    }

    private static void countingSort(ArrayList<Character> lista, int exp) {
        int n = lista.size();
        ArrayList<Character> output = new ArrayList<>(n);
        int[] count = new int[256]; // Rango de caracteres
        Arrays.fill(count, 0);

        // Contar la frecuencia de cada dígito en la lista
        for (int i = 0; i < n; i++) {
            char ch = lista.get(i);
            int digit = (int) ch / exp % 10;
            count[digit]++;
        }

        // Calcular las posiciones finales de cada dígito en la lista ordenada
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Construir la lista ordenada
        for (int i = n - 1; i >= 0; i--) {
            char caracter = lista.get(i);
            int digit = (int) caracter / exp % 10;
            output.set(count[digit] - 1, caracter);
            count[digit]--;
        }

        // Actualizar la lista original con la lista ordenada
        for (int i = 0; i < n; i++) {
            lista.set(i, output.get(i));
        }
    }
}
