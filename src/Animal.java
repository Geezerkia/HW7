import java.util.Random;

public class Animal {

    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int randomRunDist() {
        return new Random().nextInt();
    }

    public int randomSwimDist() {
        return new Random().nextInt();
    }
}
