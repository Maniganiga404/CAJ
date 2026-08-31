package lab3_3;

public class TestBook {


    public static void main(String[] args) {
            Author a1 = new Author("Manish", "mani@gmail.com", 'M');
            Author a2 = new Author("Bhavish", "bhavi@gmail.com", 'M');
            Author a3 = new Author("paresh", "par@gmail.com",'F');

            Book b1 = new Book("Java", a1, 2000, 10);

            assert (b1.getAuthor().getName().equals("Manish"));
        }
    }
