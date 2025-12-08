package zoo.domain;

public class Iguana extends Reptile implements Swimmable{

    public Iguana(String name, int age, String scalecolor) {
        super(name, age, scalecolor);
    }

    @Override
    public String swim() {
        return "Blblblblblbbb..";
    }
}

