
import java.util.ArrayList;
import java.util.Collections;

public class Library {

    private ArrayList<Book> bookList;
    private ArrayList<User> userList;
    private double loanTime; // Standard amount of time that a book is borrowed.

    public Library(){
        this.bookList  = new ArrayList<Book>();
        this.userList = new ArrayList<User>();


    }

    public void borrowBook (User user, String title)throws Exception {
        if(availableToBorrow(title)){
            user.addBook(bookList.get(indexBookByTitle(title)));
            bookList.get(indexBookByTitle(title)).setStatus(false);
            bookList.get(indexBookByTitle(title)).calcReturnDate();
        }
        else{
            throw  new Exception(" the book is borrowed ");

        }

    } // how long should the book be borrowed?

    public void addBook (Book book){
        bookList.add(book);
    }

    public void removeBook( Book book){
        bookList.remove(book);
    }

    public void sortBooks(){
        Collections.sort(bookList);
    }

    public boolean searchBook(String title){
        boolean status = false;

        for( Book item : bookList){
            if(item.getTitle().equals(title)){
                status = true;
            }
        }
        return  status;

    }

    public boolean availableToBorrow (String title){
        for(Book item : bookList){
            if(searchBook(title)&& item.isStatus()){
                return true;
            }
            else if(searchBook(title)&& !item.isStatus()){
                return false;
            }
        }
        return false;
    }

    public int indexBookByTitle(String title){
        int index = 0;
        if(searchBook(title)) {
            for (int i = 0; i < bookList.size(); i++) {
                if (bookList.get(i).getTitle().equals(title)) {
                    index= i;
                }

            }
        }
        return  index;
    }

    public void addUser(User User){
        userList.add(User);
    }

    public String findReturnDate(String title){
        if(!availableToBorrow()){
            return "ERROR: Book not available."
        }
        Book loanedBook = bookList.get(indexBookByTitle(title));
        if(loanedBook.isStatus)){
            return "ERROR: Book has not been borrowed."
        }
        else {
            return (" Year: " + loanedBook.getReturnDateYear + " \nMonth: " + loanedBook.getReturnDateMonth + " \nDay: " + loanedBook.getReturnDateDay + ".")
        }
    } //D.

    public ArrayList borrowHistory(String id){
        User user;
        for(int i = 0; i< userList.size; i++){
            if(id.equals(userList.get(i).getID){
                user = userList.get(i);
                break;
            }
        }
       return user.getBorrowedBooks()
    }

    public ArrayList<Book> getBookList() {
        return bookList;
    }


}
