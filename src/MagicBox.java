import java.util.Random;

public class MagicBox<T> {
    T[] items;

    public MagicBox(int size) {
        items = (T[]) new Object[size];

    }

    public T pick() {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                throw new RuntimeException("Коробка не полна, осталось " + (items.length -i) + " ячеек");
            }
        }
        Random random = new Random();
        int randomInt = random.nextInt();
        return items[random.nextInt(items.length)];
    }

    public boolean add(Object obj) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = (T) obj;
                return true;
            }
        }
        return false;
    }

}
