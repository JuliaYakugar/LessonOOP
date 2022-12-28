package Less_02;

import java.io.IOException;

public class main {

    public static void main (String[] args) throws IOException {
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Cat("Milka", 4, "Yulya"))
            .addAnimal(new Dog("Sharic", 4, "Anna"))
            .addAnimal(new Duck("Donald", 2, "Ivan"))
            .addAnimal(new Eagle("Trut", 2, "Ira"))
            .addAnimal(new Dolphin("Dora", 0, "Anna"));

        System.out.println(zoo.toString());
        System.out.println(zoo.talk());

        for (Runable item : zoo.getRunable()) {
            System.out.println(item.runSpeed());
        }

        System.out.println(zoo.getChampionSpeed());
        System.out.println("Fly");
        for (Flyable item : zoo.getFlyable()) {
            System.out.println(item.flySpeed());
        }

        System.out.println("Swim");
        for (Swimable item : zoo.getSwimable()) {
            System.out.println(item.swimSpeed());
        }

        SaveService saveService = new SaveService();
        saveService.save(zoo.getAnimals());
    }
    
}
