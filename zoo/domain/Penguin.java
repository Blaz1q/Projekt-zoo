package zoo.domain;

public class Penguin extends Bird implements Swimmable, Trainable{

    public Penguin(String name, int age, String wingspan) {
        super(name, age, wingspan);
    }

    @Override
    public String swim() {
        return "BLlblblblblblblbl..";
    }

    @Override
    public String performTrick() {
        return "Skok na bunge z obrotem";
    }
}
