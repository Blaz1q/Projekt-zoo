package zoo.app;

import zoo.domain.Animal;
import zoo.domain.Elephant;
import zoo.domain.Iguana;
import zoo.domain.Penguin;
import zoo.service.SimulationService;

public class Main {
    public static void main(String[] args){
        Elephant elephant = new Elephant("Władek",22,"Czarny");
        Iguana iguana = new Iguana("Kawa",10,"Zielony");
        Penguin penguin = new Penguin("Szeregowy",5,"1m");
        Animal[] animals = {elephant,iguana,penguin};
        SimulationService simulationService = new SimulationService(animals);
        simulationService.Simulate();
    }
}
