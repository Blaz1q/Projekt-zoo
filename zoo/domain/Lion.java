package zoo.domain;

public class Lion extends Mammal implements Trainable{

    public Lion(String name, int age, String furcolor) {
        super(name, age, furcolor);
    }

    @Override
    public String performTrick() {
        return "Skok na bunge";
    }
    @Override
    public String sound() {
        return "roar!";
    }
}
