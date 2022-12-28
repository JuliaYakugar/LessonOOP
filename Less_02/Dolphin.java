package Less_02;

public class Dolphin extends Animal implements Speakable, Swimable{
    public Dolphin(String nickname, int legs, String owner) {
        super(nickname, legs, owner);
    }

    @Override
    public String speak() {
        return "Weee Weee";
    }

    @Override
    public Integer swimSpeed() {
        return 150;
    }

    @Override
    public String toString() {
        return "Dolphin" + super.toString();
    }
}
