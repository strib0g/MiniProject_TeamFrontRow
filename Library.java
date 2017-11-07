
import java.util.ArrayList;
import java.util.Collections;

public class Library {

    private ArrayList<book> bookList;
    private ArrayList<user> userList;

    public Library(){
        this.bookList  = new ArrayList<book>();
        this.userList = new ArrayList<user>();


    }

    public void borrowBook (user User, String title)throws Exception {
        if(availableToBorrow(title)){
            User.addBook(bookList.get(indexBookByTitle(title)));
            bookList.get(indexBookByTitle(title)).setStatus(false);
        }
        else{
            throw  new Exception(" the book is borrowed ");

        }

    }


    public void addBook (book Book){
        bookList.add(Book);
    }

    public void removeBook( book Book){
        bookList.remove(Book);
    }

    public void sortBooks(){
        Collections.sort(bookList);
    }

    public boolean searchBook(String title){
        boolean status = false;

        for( book item : bookList){
            if(item.getTitle().equals(title)){
                status = true;
            }
        }
        return  status;

    }

    public boolean availableToBorrow (String title){
        for(book item : bookList){
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


    public void addUser(user User){
        userList.add(User);
    }

    public ArrayList<book> getBookList() {
        return bookList;
    }
}
