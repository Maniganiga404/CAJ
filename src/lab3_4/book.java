package lab3_4;

public class book {
    private String author;
    private String title;
    private double price;
    private String publisher;
    private int stock;

    book(String author, String title, double price, String publisher, int stock) {
        this.author = author;
        this.title = title;
        this.price = price;
        this.publisher = publisher;
        this.stock = stock;
    }

    public boolean searchBook(String searchTitle, String searchAuthor) {
        if (this.title.equalsIgnoreCase(searchTitle)
                && this.author.equalsIgnoreCase(searchAuthor)) {
            return true;
        }

        return false;
    }

    public boolean checkStock(int copies) {
        return stock >= copies;
    }

    public double calculateCost(int copies) {
        return price * copies;
    }

    @Override
    public String toString() {
        return "Title: " + title +
                " | Author: " + author +
                " | Price: " + price +
                " | Publisher: " + publisher +
                " | Stock: " + stock;
    }
}

