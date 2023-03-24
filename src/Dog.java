import java.util.Arrays;
import java.util.Random;

public class Dog extends Animal {
    private static int dogCounter;

    public Dog(String name) {
        super(name);
    }

    public static int getDogCounter() {
        return dogCounter;
    }

    public static String dogRandomName() {
        var random = new Random();
        var list = Arrays.asList("Бобік", "Джек", "Річі", "Арчі", "Джесі", "Гаррі", "Сем", "Річі", "Чаппі", "Tім");
        return list.get(random.nextInt(list.size()));
    }

    public static String oneDogResult() {
        Dog dog = new Dog(dogRandomName());
        dogCounter++;
        return dog.getName() + " пробіг " + dog.randomRunDist() + " м.," + " проплив " + dog.randomSwimDist() + " м.";
    }

    public static void allDogsResultOutput() {
        System.out.println("""

                Результати змагань собак:
                -------------------------------""");
        var random = new Random();
        var dogCount = random.nextInt(10) + 1;
        for (var i = 1; i <= dogCount; i++) {
            System.out.println(i + ". " + oneDogResult());
        }
    }

    @Override
    public int randomRunDist() {
        var min = 1;
        var max = 500;
        var diff = max - min;
        var random = new Random();
        return random.nextInt(diff + 1) + min;
    }

    @Override
    public int randomSwimDist() {
        var min = 1;
        var max = 10;
        var diff = max - min;
        var random = new Random();
        return random.nextInt(diff + 1) + min;
    }
}
