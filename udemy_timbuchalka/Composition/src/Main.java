public class Main {
    public static void main(String[] args) {
        //Create a single room of house using composition
        // Think about different things in that room
        // Maybe physical parts or furniture
        // Add at least one method to access an object via getter
        // and that objects public method
        // Then add at least one method to hide object e.g. not using getters
        //but to access the object used in composition within main class
        Bookshelf bookshelf = new Bookshelf(20,55);
        Television television = new Television(false);
        TheDimension dimension = new TheDimension(5,6,7);
        Table table = new Table("brown",dimension);
        Room room = new Room(table,bookshelf,television);
        room.getTelevision().TurnOnTV();
        System.out.println("We have the chair of colour " + room.getTable().getColour());
        room.getBookshelf().increaseNoOfBooks(36);

    }
}
