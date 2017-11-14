
import java.util.ArrayList;
import java.util.Collections;

public class Library {

    private ArrayList<Book> bookList;
    private ArrayList<User> userList;

    public Library(){
        this.bookList  = new ArrayList<Book>();
        this.userList = new ArrayList<User>();


    }

    public void borrowBook (User user, String title)throws Exception {
        if(availableToBorrow(title)){
            user.addBook(bookList.get(indexBookByTitle(title)));
            bookList.get(indexBookByTitle(title)).setStatus(false);
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
        Book loanedBook;
        loanedBook = bookList.get(indexBookByTitle(title));
        if(loanedBook.getReturnDate.equals("")){
            return "ERROR: Return date could not be found."
        }
        else {
            return loanedBook.getReturnDate;
        }
    } //D. Maybe add one where you input the book?

    public ArrayList<Book> getBookList() {
        return bookList;
    }


}
