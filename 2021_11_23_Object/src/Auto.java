public class Auto extends Object {

    String make;
    int year;
    String color;

    public Auto(String make, int year, String color) {
        this.make = make;
        this.year = year;
        this.color = color;
    }

    @Override
    public boolean equals(Object o2) {
        if (!(o2 instanceof Auto))
            return false;

        Auto auto2 = (Auto) o2;

        return year == auto2.year
                && make.equals(auto2.make)
                && color.equals(auto2.color);
    }

    @Override
    public String toString() {
        return "The maker: " + make + ", the year: " + year + ", the color: " + color;
    }
}