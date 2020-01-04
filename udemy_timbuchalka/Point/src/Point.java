public class Point {
    private int x;
    private int y;
    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }
    public Point(){

    }

    public int getX() {
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public double distance(Point A){
        double sqrt;
        sqrt = Math.sqrt((A.x - this.x) * (A.x - this.x) + (A.y - this.y) * (A.y - this.y));
        return sqrt;
    }
    public double distance(){
        Point A = new Point(0,0);
        return distance(A);
    }
    public double distance(int a,int b){
        Point A = new Point(a,b);
        return distance(A);
    }

}
