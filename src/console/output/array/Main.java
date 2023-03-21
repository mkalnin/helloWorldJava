package console.output.array;

public class Main {
    public static void main(String[] args) {
        int [] array1 = {1, 2, 3, 4, 5};

        //Меняем первый и последний элемент местами
        int firstElement = array1[0];
        int lastElement = array1[array1.length - 1];
        array1[0] = lastElement;
        array1[array1.length - 1] = firstElement;

        //Выводим сумму первого и среднего элемента
        System.out.println(array1[0] + array1[(array1.length - 1) / 2]);
    }
}
