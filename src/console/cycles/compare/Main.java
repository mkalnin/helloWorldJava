package console.cycles.compare;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        int[] presetArray = {1,2,3};
        System.out.println("Выберите длину массива");
        int length = Integer.parseInt(System.console().readLine());
        int[] numArray = new int[length];
        for (int i = 0; i < numArray.length; i++) {
            System.out.println("Введите элемент " + (i+1));
            numArray[i] = Integer.parseInt(System.console().readLine());
        }

        for (int number : numArray) {
            if (number == presetArray[0] || number == presetArray[1] || number == presetArray[2]) {
                System.out.println("Данное значение имеется в константах");
                break;
            }
        }

    }
}
