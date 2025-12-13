package zoo.domain;

public class Elephant extends Mammal implements Trainable {

    public Elephant(String name, int age, String skinColor) {
        super(name, age, skinColor);
    }

    @Override
    public String performTrick() {
        return "chodzi po piłce";
    }
    @Override
    public String sound() {
        return "*trabka*!";
    }
}
