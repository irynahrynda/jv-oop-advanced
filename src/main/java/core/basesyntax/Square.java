package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double side, String color) {
        super("square", color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName()
                + ", area: " + getArea() + " sq.units"
                + ", side: " + side + " units"
                + ", color: " + getColor());
    }
}