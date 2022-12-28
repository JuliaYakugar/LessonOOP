package Less_02;

public class Eagle extends Animal implements Speakable, Runable, Flyable{
    public Eagle(String nickname, int legs, String owner) {
        super(nickname, legs, owner);
    }

    @Override
    public String speak() {
        return "Pipi";
    }

    @Override
    public Integer runSpeed() {
        return 10;
    }

    @Override
    public int flySpeed() {
        return 60;
    }

    @Override
    public String toString() {
        return "Eagle" + super.toString();
    }
}
