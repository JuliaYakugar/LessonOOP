package Less_02;

public class Duck extends Animal implements Speakable, Runable, Flyable{
    
    public Duck(String nickname, int legs, String owner) {
        super(nickname, legs, owner);
    }

    @Override
    public String speak() {
        return "Gaga";
    }

    @Override
    public Integer runSpeed() {
        return 10;
    }

    @Override
    public int flySpeed() {
        return 40;
    }

    @Override
    public String toString() {
        return "Duck" + super.toString();
    }
}
