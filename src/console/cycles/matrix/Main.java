package console.cycles.matrix;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите размер матрицы");
        int length = Integer.parseInt(System.console().readLine());
        double[][] numArray = new double[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.println("Строка " + (i + 1) + " элемент " + (j + 1) + " введите значение:");
                numArray[i][j] = Double.parseDouble(System.console().readLine());
            }
        }

        String output = "Первая строка умноженная на 3: ";
        for (double number:
             numArray[0]) {
            output = output + (number * 3) + ", ";
        }
        System.out.println(output);
    }
}
