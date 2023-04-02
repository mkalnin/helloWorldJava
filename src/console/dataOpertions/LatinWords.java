package console.dataOpertions;

public class LatinWords {
    public static void main(String[] args) {
        System.out.println("Введите строку из рксских и английских слов");
        String string = System.console().readLine();
        String words[] = string.split("\\s");
        String output = "";
        for (String word:
             words) {
            boolean valid = word.matches("\\w+");
            if (valid) {
                output = output + word + " ";
            }
        }
        System.out.println(output);
    }
}
