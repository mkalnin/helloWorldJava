package console.cycles.sum;

public class Main {
    public static void main(String[] args) {
        System.out.println("Выберите целое положительное число");
        int number = Integer.parseInt(System.console().readLine());
        int i = 1;
        int sum = 0;
        while (i < number) {
            sum += i;
            i += 2;
        }

        System.out.println("Сумма нечетных положительных чисел меньше " + number + " равна " + sum);
    }
}
