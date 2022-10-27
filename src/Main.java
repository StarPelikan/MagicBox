public class Main {
    public static void main(String[] arg) {
        MagicBox<String> magicBox = new MagicBox<>(5);

        boolean examination = magicBox.add("Сеня");
        System.out.println(examination);
        magicBox.add("Вован");
        magicBox.add("Колян");
        magicBox.add("Вано");
        magicBox.add("Петро");
        String pick = magicBox. pick();
        System.out.println(pick);

    }
}