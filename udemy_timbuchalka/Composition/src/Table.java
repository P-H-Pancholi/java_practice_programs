

public class Table {
    private String colour;
    private TheDimension dimension;
    public Table(String colour, TheDimension dimension){
        this.colour = colour;
        this.dimension = dimension;
    }
    public String getColour(){
        return colour;
    }
    public TheDimension getDimension(){
        return dimension;
    }

}
