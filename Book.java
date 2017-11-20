import java.util.Calendar;

public class Book implements Comparable<Book> {

    private String title;
    private String firstName;
    private String surname;
    private String genre;
    private String publisher;
    private String shelf;
    private boolean status;

    private int returnDateDay; //D
    private int returnDateMonth; //D
    private int returnDateYear; //D

    public Book (String title, String firstName, String surname, String genre, String publisher,String shelf) {
        this.title = title;
        this.firstName = firstName;
        this.surname = surname;
        this.genre = genre;
        this.publisher = publisher;
        this.shelf = shelf;
        this.status = true;

    }

    public void calcReturnDate(){
        Calendar cal = new GregorianCalendar();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH) + 21;
        if ((day > 31 && (cal.get(Calendar.MONTH) == 0 || cal.get(Calendar.MONTH) == 2 || cal.get(Calendar.MONTH) == 4 || cal.get(Calendar.MONTH) == 6 || cal.get(Calendar.MONTH) == 7 ||cal.get(Calendar.MONTH) ==9 || cal.get(Calendar.MONTH) == 11))
                || (day >30) && (cal.get(Calendar.MONTH) == 3 || cal.get(Calendar.MONTH) == 5 || cal.get(Calendar.MONTH) == 8 || cal.get(Calendar.MONTH) == 10)
                || (day > 28 && cal.get(Calendar.MONTH) == 1) ){
            if(month == 0 || month == 2 || month == 4 || month == 6 || month == 7 || month == 9 || month == 11 ){
                day -= 31;
            }
            else if(month == 1){
                if(year % 4 == 0){
                    day -= 29;
                }
                else{
                    day -= 28;
                }
            }
            else {
                day -=30;
            }
            month += 1;
            if (month > 11)
                month -= 12;
                year += 1;
            }
            month += 1;


        }//D // Supposed to be used when a book is borrowed so that it sets the returndates. Check for bugs and problems..

    public void returnBookDateReset(){
        returnDateDay = null;
        returnDateMonth = null;
        returnDateYear = null;
    } //D. Intended to be used when a book is returned.

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

    public int getReturnDateDay() {
        return returnDateDay;
    } // D

    public int getReturnDateMonth() {
        return returnDateMonth;
    } //D

    public int getReturnDateYear() {
        return returnDateYear;
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

    public void setReturnDateDay(int returnDateDay) {
        this.returnDateDay = returnDateDay;
    }// D

    public void setReturnDateMonth(int returnDateMonth) {
        this.returnDateMonth = returnDateMonth;
    } //D

    public void setReturnDateYear(int returnDateYear) {
        this.returnDateYear = returnDateYear;
    }//D

    @Override
    public String toString() {
        return "Title: " + this.title + "\n Author: " + getAuthor() + "\n Genre: " + this.genre + "\n Publisher: " + getPublisher() + "\n Shelf: " + getShelf() + ".";
    } // Changed it a bit.
}
