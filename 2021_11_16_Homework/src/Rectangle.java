public class Rectangle extends Shape {

    private int height;
    private int width;

    public Rectangle(char symbol, int height, int width) {
        super(symbol);
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public void draw() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(getSymbol());
            }
            System.out.println();
        }
    }
}
