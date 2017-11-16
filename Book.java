
public class Book implements Comparable<Book> {

    private String title;
    private String firstName;
    private String surname;
    private String genre;
    private String publisher;
    private String shelf;
    private boolean status;





    public Book (String title, String firstName, String surname, String genre, String publisher,String shelf) {
        this.title = title;
        this.firstName = firstName;
        this.surname = surname;
        this.genre = genre;
        this.publisher = publisher;
        this.shelf = shelf;
        this.status = true;

    }

    public String getFirstName() {
        return firstName;
    }
    
    public String getSurname(){
        return surname;
    }
    
    
    public String getAuthor(){
        return firstName + " " + surname;
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
    public int compareTo(Book comparedBook) {
        return this.getTitle().compareTo(comparedBook.getTitle());
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public void setSurname(String surname){
        this.surname = surname;
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
        return "Title: " + this.title + "\n Author: " + getAuthor() + "\n Genre: " + this.genre + "\n Publisher: " + getPublisher();
    } // Changed it a bit.
}
