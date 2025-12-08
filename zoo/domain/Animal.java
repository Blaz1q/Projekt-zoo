package zoo.domain;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
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
    String furColor;
    public Mammal(String name, int age, String furcolor) {
        this.furColor = furcolor;
        super(name, age);
    }

    @Override
    public String sound() {
        return "miau, hau!";
    }
}
class Bird extends Animal {
    String wingspan;
    public Bird (String name, int age, String wingspan) {
        this.wingspan = wingspan;
        super(name, age);
    }

    @Override
    public String sound() {
        return "ćwir, ćwir!";
    }
}
class Reptile extends Animal {
    String scalecolor;
    public Reptile (String name, int age, String scalecolor) {
        this.scalecolor = scalecolor;
        super(name, age);
    }

    @Override
    public String sound() {
        return "RAAAHHH daj dwa złote!";
    }
}