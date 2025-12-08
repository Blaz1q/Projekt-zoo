package zoo.domain;

public abstract class Animal {
    private String name;
    private int age;
    public Animal(String name, int age) {
        if(age<=0) age = 5;
        if(name.trim().isEmpty()) name = "Nieokreślony";
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public abstract String sound();

    public String info() {
        return name + " (" + age + " years old)";
    }

    public String getName() { return name; }
    public int getAge() { return age; }
}

// Klasa konkretna zwierzęcia
class Mammal extends Animal {
    public final int MAX_AGE_MAMMAL = 100;
    String furColor;
    public Mammal(String name, int age, String furcolor) {
        super(name, age);
        this.furColor = furcolor;
    }

    @Override
    public String sound() {
        return "miau, hau!";
    }
}
class Bird extends Animal {
    public final int MAX_AGE_BIRD = 20;
    String wingspan;
    public Bird (String name, int age, String wingspan) {
        super(name, age);
        this.wingspan = wingspan;
    }

    @Override
    public String sound() {
        return "ćwir, ćwir!";
    }
}
class Reptile extends Animal {
    public final int MAX_AGE = 200;
    String scalecolor;
    public Reptile (String name, int age, String scalecolor) {
        super(name, age);
        this.scalecolor = scalecolor;
    }

    @Override
    public String sound() {
        return "RAAAHHH daj dwa złote!";
    }
}