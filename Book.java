
public class Book implements Comparable<Book> {

    private String title;
    private String firstName;
    private String surname;
    private String genre;
    private String publisher;
    private String shelf;
    private int returnDay; // D
    private int returnMonth; // D
    private int returnYear; // D
    private boolean status;





    public Book (String title, String firstName, String surname, String genre, String publisher,String shelf) {
        this.title = title;
        this.firstName = firstName;
        this.surname = surname;
        this.genre = genre;
        this.publisher = publisher;
        this.shelf = shelf;
        this.returnDate = ""; //D
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

    public int getReturnDay(){
        return returnDate;
    } // D

    public int getReturnMonth() {
        return returnMonth;
    } //D

    public int getReturnYear() {
        return returnYear;
    } //D

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

    public void setReturnDay(int returnDay){
        this.returnDay = returnDay;
    } //D

    public void setReturnMonth(int returnMonth) {
        this.returnMonth = returnMonth;
    } //D

    public void setReturnYear(int returnYear) {
        this.returnYear = returnYear;
    } // D

    @Override
    public String toString() {
        return  this.title;
    }
}
