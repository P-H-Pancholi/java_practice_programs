public class AreaCalculator {
    public static double area(double radius){
        if(radius < 0){
            return -1.0;
        }
        double PI = Math.PI;
        return PI*radius*radius;
    }
    public static double area(double x,double y){
        if((x<0) || (y<0)){
            return -1.0;
        }
        return x*y;
    }
}
