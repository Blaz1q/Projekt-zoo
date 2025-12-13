package zoo.domain;

public class Eagle extends Bird implements Trainable{

    public Eagle(String name, int age, String wingspan) {
        super(name, age, wingspan);
    }

    @Override
    public String performTrick() {
        return "fru";
    }
    @Override
    public String sound() {
        return "Robimy napad na fabryke jaboli!";
    }
}
