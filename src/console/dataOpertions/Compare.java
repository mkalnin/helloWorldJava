package console.dataOpertions;

public class Compare {
    public static void main(String[] args) {
        System.out.println("Введите первое число");
        double num1 = Double.parseDouble(System.console().readLine());
        System.out.println("Введите второе число");
        double num2 = Math.ceil(Double.parseDouble(System.console().readLine()));
        int num2ceil = (int) num2;
        double resultMin = Math.min(num1, num2ceil);
        System.out.println("Большее число: " + Math.max(num1, num2ceil));
        System.out.println("Меньшее число: " + resultMin);
    }
}
