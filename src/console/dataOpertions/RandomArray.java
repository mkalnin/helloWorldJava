package console.dataOpertions;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[15];
        random.nextDouble(-20, 20);
        int max = 0;
        int min = 0;
        for (int i = 0; i < 15; i++) {
            int newVal = random.nextInt(-20, 20);
            array[i] = newVal;
            min = Math.min(newVal, min);
            max = Math.max(newVal, max);
        }
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Максимальное значение по модулю: " + Math.max(max, Math.abs(min)));
    }
}
