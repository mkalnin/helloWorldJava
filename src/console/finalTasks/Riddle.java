package console.finalTasks;

import java.util.Random;

public class Riddle {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        String answer = "";
                String[] clues = {
                "Хранится на компьютере",
                "Лечится антивирусом",
                "В формате zip"
        };
        for (int i = 0; i < 3; i++) {
            answer = System.console().readLine();
            //
            if (answer.equalsIgnoreCase("Подсказка")) {
                if (i == 0) {
                    System.out.println(clues[random.nextInt(clues.length - 1)]);
                    answer = System.console().readLine();
                    if (answer.equalsIgnoreCase("Заархивированный вирус")) {
                        System.out.println("Правильно!");
                        break;
                    } else {
                        System.out.println("Обидно, приходи в другой раз");
                        break;
                    }
                } else {
                    System.out.println("Подсказка уже недоступна");
                    answer = System.console().readLine();
                }
            }
            //
            if (answer.equalsIgnoreCase("Заархивированный вирус")) {
                System.out.println("Правильно!");
                break;
            } else {
                if (i != 2) {
                    System.out.println("Подумай еще");
                } else {
                    System.out.println("Обидно, приходи в другой раз");
                }
            }
        }
    }

}
