import java.util.Arrays;
import java.util.Random;

public class Cat extends Animal {
    private static int catCounter;

    public Cat(String name) {
        super(name);
    }

    public static int getCatCounter() {
        return catCounter;
    }

    public static String catRandomName() {
        var random = new Random();
        var list = Arrays.asList("Марсік", "Каспер", "Луна", "Барсік", "Юкі", "Лейла", "Ласка", "Ніка", "Боня", "Соня");
        return list.get(random.nextInt(list.size()));
    }

    public static String oneCatResult() {
        Cat cat = new Cat(catRandomName());
        catCounter++;
        return cat.getName() + " пробіг " + cat.randomRunDist() + " м., плавати не вміє.";
    }

    public static void allCatsResultOutput() {
        System.out.println("Результати змагань кішок:" + "\n-------------------------------");
        var random = new Random();
        var catCount = random.nextInt(10) + 1;
        for (var i = 1; i <= catCount; i++) {
            System.out.println(i + ". " + oneCatResult());
        }
    }

    @Override
    public int randomRunDist() {
        var min = 1;
        var max = 200;
        var diff = max - min;
        var random = new Random();
        return random.nextInt(diff + 1) + min;
    }
}
