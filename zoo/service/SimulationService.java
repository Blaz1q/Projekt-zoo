package zoo.service;
import zoo.domain.Animal;
import zoo.domain.Flyable;
import zoo.domain.Swimmable;
import zoo.domain.Trainable;

public class SimulationService {
    Animal[] animals;
    SimulationService(Animal[] animals){
        this.animals = animals;
    }
    public void Simulate(){
        for(Animal animal : animals){
            if(animal instanceof Swimmable){
                ((Swimmable) animal).swim();
            }
            if(animal instanceof Flyable){
                ((Flyable) animal).fly();
            }
            if(animal instanceof Trainable){
                ((Trainable) animal).performTrick();
            }
            animal.eat();
            animal.sleep();
            animal.sound();
        }
    }
}
