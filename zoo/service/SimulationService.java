package zoo.service;
import zoo.domain.Animal;
import zoo.domain.Flyable;
import zoo.domain.Swimmable;
import zoo.domain.Trainable;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class SimulationService {
    Animal[] animals;
    ArrayList<String> Logs;
    public SimulationService(Animal[] animals){
        this.animals = animals;
        this.Logs = new ArrayList<>();
    }
    public void Simulate(){
        for(Animal animal : animals){
            if(animal instanceof Swimmable){
                ((Swimmable) animal).swim();
                Logs.add(animal.getName()+" swam.");
            }
            if(animal instanceof Flyable){
                ((Flyable) animal).fly();
                Logs.add(animal.getName()+" flew.");
            }
            if(animal instanceof Trainable){
                ((Trainable) animal).performTrick();
                Logs.add(animal.getName()+" performed a trick. ("+((Trainable) animal).performTrick()+")");
            }
            animal.eat();
            Logs.add(animal.getName()+" ate.");
            animal.sleep();
            Logs.add(animal.getName()+" slept.");
            System.out.println(animal.sound());
            Logs.add(animal.getName()+" made a sound. ("+animal.sound()+")");
        }
        System.out.println(ReportingService.toJSON(Logs));

        ReportingService reportingService = new ReportingService();
        reportingService.export(Logs, "zoo_simulation_log.txt");
    }
}

