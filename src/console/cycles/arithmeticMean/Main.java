package console.cycles.arithmeticMean;

public class Main {
    public static void main(String[] args) {
        System.out.println("Выберите длину массива");
        int length = Integer.parseInt(System.console().readLine());
        double[] numArray = new double[length];
        double sumOfElements = 0;
        for (int i = 0; i < numArray.length; i++) {
            System.out.println("Введите элемент " + (i+1));
            numArray[i] = Double.parseDouble(System.console().readLine());
            sumOfElements += numArray[i];
        }
        double arithmeticMean = sumOfElements / length;
        String result = "Результат: ";
        for (double number:
             numArray) {
            result = result + (number * arithmeticMean) + ", ";
        }
        System.out.println(result);
    }
}
