package Less_02;

public class Dog extends Animal implements Speakable, Runable {

    public Dog(String nickname, int legs, String owner) {
        super(nickname, legs, owner);
    }
    
    @Override
    public String speak() {
        return "WoW";
    }

    @Override
    public Integer runSpeed() {
        return 20;
    }

    @Override
    public String toString() {
        return "Dog" + super.toString();
    }
}