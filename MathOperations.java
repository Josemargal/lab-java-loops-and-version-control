import java.util.Arrays;

public class MathOperations {

    // Tarea 1: Diferencia entre el mayor y el menor valor de un array
    public static int maxMinDifference(int[] arr) {
        if (arr.length < 1) {
            throw new IllegalArgumentException("El array debe tener al menos un elemento.");
        }
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        return max - min;
    }

    // Tarea 2: Encontrar el menor y el segundo menor valor de un array
    public static void findTwoSmallest(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("El array debe tener al menos dos elementos.");
        }
        Arrays.sort(arr);
        System.out.println("Menor: " + arr[0] + ", Segundo menor: " + arr[1]);
    }

    // Tarea 3: Calcular la expresión matemática dada
    public static double calculateExpression(double x, double y) {
        return Math.pow((4 * y / 5) - x, 2) + Math.pow(x, 2);
    }

    public static void main(String[] args) {
        // Probando el codigo
        int[] array = {7, 2, 10, 3, 5};
        System.out.println("Diferencia máx-mín: " + maxMinDifference(array));
        findTwoSmallest(array);

        double x = 3.0;
        double y = 4.0;
        System.out.println("Resultado de la expresión: " + calculateExpression(x, y));
    }
}
