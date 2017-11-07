import java.util.ArrayList;

public class user extends person {
    private ArrayList<book> borrowedBooks;

    public user (String name, String DOB, String address, String ID) throws Exception{
        super(name,DOB,address,ID);
        this.borrowedBooks = new ArrayList<>();

    }

    public ArrayList<book> getBorrowedBooks() {
        return borrowedBooks;
    }
    public void addBook(book borrowedBook){
        borrowedBooks.add(borrowedBook);
    }
    public  void removeBook(book returnedBook){
        borrowedBooks.remove(returnedBook);
    }

    @Override
    public String toString() {
        return super.getName();
    }
    public  void printAllUserBooks(){
        for(book item: borrowedBooks){
            item.toString();
        }
    }
}
