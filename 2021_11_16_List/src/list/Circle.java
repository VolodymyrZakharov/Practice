package list;

public class Circle extends AbstractFigure{

    static double Pi = 3.14;
    private int r;


    public Circle (int r) {
        this.r = r;
    }

    @Override
    public double Perimeter () {
        return 2*Pi*r;
    }

    @Override
    public double Square () {
        return Pi*r*r;
    }

}
