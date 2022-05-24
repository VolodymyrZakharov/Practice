package books;

public class BestSeller extends LiteratureBook {

    private double coefficient;

    public BestSeller(int id, String title, String author, int price, double coefficient) {
        super(id, title, author, price);
        this.coefficient = coefficient;

    }

    public int getPrice() {
        return (int) (super.getPrice() * coefficient);
    }
}
