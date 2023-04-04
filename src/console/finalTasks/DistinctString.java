package console.finalTasks;

public class DistinctString {
    public static void main(String[] args) {
        System.out.println("Введите количество слов");
        int length = Integer.parseInt(System.console().readLine());
        String[] words = new String[length];
        String longestWord = "";
        int wordLength = 0;

        for (int i = 0; i < length; i++) {
            System.out.println("Введите " + (i+1) + " слово");
            words[i] = System.console().readLine();
            int uniqueCharNumber = getUniqueChars(words[i]);
            if (uniqueCharNumber > wordLength) {
                wordLength = uniqueCharNumber;
                longestWord = words[i];
            }
        }

        System.out.println(longestWord);
    }

    private static int getUniqueChars(String input)
    {
        String temp = "";
        for (int i = 0; i < input.length(); i++){
            char current = input.charAt(i);
            if (temp.indexOf(current) < 0){
                temp = temp + current;
            } else {
                temp = temp.replace(String.valueOf(current), String.valueOf(current));
            }
        }

        return temp.length();
    }
}
