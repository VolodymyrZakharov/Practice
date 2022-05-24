package list;

public class Rectangle1 implements Formula{

    private int length;
    private int width;

    public Rectangle1(int length, int width) {
        this.length = length;
        this.width = width;
    }


    @Override
    public double perimeter() {
        return 2*(length + width);
    }

    @Override
    public double square() {
        return length * width;
    }

}