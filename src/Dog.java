import java.util.Random;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
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
