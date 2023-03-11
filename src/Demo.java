import java.util.Arrays;
import java.util.Random;

public class Demo {

    private static int catCount;
    private static int dogCount;

    public static void main(String[] args) {

        allCatsResultOutput();
        allDogsResultOutput();
        allAnimalsResultOutput();
    }

    public static String catRandomName() {
        var random = new Random();
        var list = Arrays.asList("Марсік", "Каспер", "Луна", "Барсік", "Юкі", "Лейла", "Ласка", "Ніка", "Боня", "Соня");
        return list.get(random.nextInt(list.size()));
    }

    public static String dogRandomName() {
        var random = new Random();
        var list = Arrays.asList("Бобік", "Джек", "Річі", "Арчі", "Джесі", "Гаррі", "Сем", "Річі", "Чаппі", "Tім");
        return list.get(random.nextInt(list.size()));
    }

    public static String oneCatResul() {
        Cat cat = new Cat(catRandomName());
        return cat.getName() + " пробіг " + cat.randomRunDist() + " м., плавати не вміє.";
    }

    public static String oneDogResult() {
        Dog dog = new Dog(dogRandomName());
        return dog.getName() + " пробіг " + dog.randomRunDist() + " м.," + " проплив " + dog.randomSwimDist() + " м.";
    }

    public static void allCatsResultOutput() {
        System.out.println("Результати змагань кішок:" + "\n-------------------------------");
        var random = new Random();
        catCount = random.nextInt(10) + 1;
        for (var i = 1; i <= catCount; i++) {
            System.out.println(i + ". " + oneCatResul());
        }
    }

    public static void allDogsResultOutput() {
        System.out.println("""

                Результати змагань собак:
                -------------------------------""");
        var random = new Random();
        dogCount = random.nextInt(10) + 1;
        for (var i = 1; i <= dogCount; i++) {
            System.out.println(i + ". " + oneDogResult());
        }
    }

    public static void allAnimalsResultOutput() {
        System.out.println("\nУсього прийняло участь у змаганні:" + "\n------------------------------------\n" + catCount + " кішок\n" + dogCount + " собак\n" + "Разом: " + (catCount + dogCount) + " тварин.");
    }
}
