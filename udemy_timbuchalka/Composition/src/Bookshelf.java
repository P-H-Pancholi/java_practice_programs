

public class Bookshelf {
    private int NoOfBooks;
    private int Capacity;
    public Bookshelf(int NoOfBooks,int Capacity){
        this.NoOfBooks = NoOfBooks;
        this.Capacity = Capacity;
    }
    public int getNoOfBooks(){
        return NoOfBooks;
    }
    public int getCapacity(){
        return Capacity;
    }
    public void increaseNoOfBooks(int n) {
        if (this.NoOfBooks + n > Capacity) {
            System.out.println("Number of books increased from capacity.");
            System.out.println("Buy a new shelf");
        } else {
            this.NoOfBooks += n;
            System.out.println("Number of books increased by " + n);
        }
    }
    public void removeABook(){
        System.out.println("A book is removed from the shelf");
    }
}
