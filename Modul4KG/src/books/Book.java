package books;

public class Book {
    private String bookId;
    private String title;
    private int stock;
    private String author;
    private String category;
    private int duration;

    public int getDuration() {
        return duration;
    }
    public Book(String bookId, String title, int stock, String category , String author) {
        this.bookId = bookId;
        this.title = title;
        this.stock = stock;
        this.category = category;
        this.author = author;
    }

    public String getIdBuku() {
        return bookId;
    }

    public String getJudul() {
        return title;
    }

    public int getStok() {
        return stock;
    }


    public String getCategory() {
        return category;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    public void setStok(int stock) {
        this.stock = stock;
    }

    public String getAuthor() {
        return author;
    }
}
