package console.dataOpertions;


public class LikeJava {
    public static void main(String[] args) {
        System.out.println("Веедите 'I like Java!!!'");
        String string = System.console().readLine();
        boolean contains = string.contains("Java");
        boolean starts = string.startsWith("I like");
        boolean ends = string.endsWith("!!!");
        if (contains && starts && ends) {
            System.out.println(string.toUpperCase());
        } else {
            System.out.println("Строка неверна");
        }
        String replaced = string.replace("a", "o");
        String jovo = replaced.substring(7, 11);
        System.out.println(jovo);
    }
}
