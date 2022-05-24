package books;

public class LiteratureBook extends Book{
    public LiteratureBook(int id, String title, String author, int price) {
        super(id, title, author, price);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 10;
    }
}
