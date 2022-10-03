package TianClass;

public class Shape extends Triangle {
private String color = "red";

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    public Shape(float side1, float side2, float side3, String color) {
        super(side1, side2, side3);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", side3=" + side3 +
                '}';
    }
}
