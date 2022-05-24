package list;

public class Circle1 implements Formula{

    static double Pi = 3.14;
    private int r;

    public Circle1(int r) {
        this.r = r;
    }


    @Override
    public double perimeter () {
        return 2*Pi*r;
    }

    @Override
    public double square() {
        return Pi*r*r;
    }

}
