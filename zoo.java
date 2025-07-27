import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        Animal lion = new Lion("Simba");
        Animal eagle = new Eagle("Freedom");
        Animal penguin = new Penguin("Pingu");
        Animal dolphin = new Dolphin("Echo");

        ArrayList<Animal> zooAnimals = new ArrayList<>();
        zooAnimals.add(lion);
        zooAnimals.add(eagle);
        zooAnimals.add(penguin);
        zooAnimals.add(dolphin);

        System.out.println("=== Animal Sounds ===");
        for (Animal animal : zooAnimals) {
            System.out.println(animal.getName() + ": " + animal.makeSound());
        }

        System.out.println("\n=== Special Abilities ===");
        for (Animal animal : zooAnimals) {
            if (animal instanceof Flyable) {
                System.out.println(animal.getName() + ": " + ((Flyable) animal).fly());
            }
            if (animal instanceof Swimable) {
                System.out.println(animal.getName() + ": " + ((Swimable) animal).swim());
            }
        }
    }
}