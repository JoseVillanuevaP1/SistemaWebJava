package controlador;

import java.util.List;

public class Ctrl_Algoritmos {

    public static int busquedaSecuencial(List<String> lista, String elemento) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equals(elemento)) {
                return i; // Se encontró el elemento, se devuelve el índice
            }
        }
        return -1; // No se encontró el elemento en la lista
    }

// Función de ordenamiento Radix para cadenas de caracteres
    public static void radixSort(List<Object[]> filas, int columna) {
        int n = filas.size();
        int maxLen = getMaxStringLength(filas, columna);

        for (int i = maxLen - 1; i >= 0; i--) {
            countingSort(filas, columna, i);
        }
    }

    // Función auxiliar para obtener la longitud máxima de cadena en una columna
    private static int getMaxStringLength(List<Object[]> filas, int columna) {
        int maxLen = 0;
        for (Object[] fila : filas) {
            String descripcion = (String) fila[columna];
            maxLen = Math.max(maxLen, descripcion.length());
        }
        return maxLen;
    }

    // Función auxiliar para realizar el ordenamiento por cuenta en una posición específica
    private static void countingSort(List<Object[]> filas, int columna, int pos) {
        int n = filas.size();
        int[] count = new int[256];
        Object[] output = new Object[n];

        for (Object[] fila : filas) {
            String descripcion = (String) fila[columna];
            int index = (pos < descripcion.length()) ? descripcion.charAt(descripcion.length() - pos - 1) : 0;
            count[index]++;
        }

        for (int i = 1; i < 256; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            Object[] fila = filas.get(i);
            String descripcion = (String) fila[columna];
            int index = (pos < descripcion.length()) ? descripcion.charAt(descripcion.length() - pos - 1) : 0;
            output[count[index] - 1] = fila;
            count[index]--;
        }

        for (int i = 0; i < n; i++) {
            filas.set(i, (Object[]) output[i]);
        }
    }
}
