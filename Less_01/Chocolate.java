package Less_01;

public class Chocolate extends Product {

    private String color;

    public Chocolate(String name, double price, String color) {
        super(name, price);
        this.setColor(color);
    }

    public String getColor() {
        return color;
    }
    
    private void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return String.format("%s %s", super.toString(), color);
    }
}
