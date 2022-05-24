package list;

public class Rectangle extends AbstractFigure {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double Perimeter() {
        return 2*(width + length);
    }

    @Override
    public double Square() {
        return width * length;
    }
}
