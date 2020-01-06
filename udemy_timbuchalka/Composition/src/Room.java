public class Room {
    private Table table;
    private Bookshelf bookshelf;
    private Television television;
    public Room(Table table,Bookshelf bookshelf, Television television){
        this.table = table;
        this.bookshelf = bookshelf;
        this.television = television;
    }
    public Table getTable(){
        return table;
    }
    public Bookshelf getBookshelf(){
        return bookshelf;
    }
    public Television getTelevision(){
        return television;
    }
}
