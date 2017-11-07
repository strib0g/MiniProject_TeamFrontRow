
public class book implements Comparable<book> {

    private String title;
    private String author;
    private String genre;
    private String publisher;
    private String shelf;
    private boolean status;





    public book (String title, String author, String genre, String publisher,String shelf) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.publisher = publisher;
        this.shelf = shelf;
        this.status = true;

    }

    public String getAuthor() {
        return author;
    }

    public String getShelf() {
        return shelf;
    }

    public String getGenre() {
        return genre;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getTitle() {
        return title;
    }

    public boolean isStatus() {
        return status;
    }

    @Override
    public int compareTo(book comparedBook) {
        return this.getTitle().compareTo(comparedBook.getTitle());
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setShelf(String shelf) {
        this.shelf = shelf;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return  this.title;
    }
}
