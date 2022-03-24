package netcracker.Document1.BookClass;

public class Main {
    public static void main(String[] args) {
        Author a1 = new Author("Mikl");
        Author a2 = new Author("Mikol");
        Author a3 = new Author("Nikola");

        Book book = new Book("Battle for Azerot" , new Author[]{a1, a2, a3}, 25);
        System.out.println(book.toString()+" " + book.getAuthorName());
    }
}
