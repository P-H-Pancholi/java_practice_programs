public class TeenNumberChecker {
    public static boolean hasTeen(int a, int b, int c){
        if(isTeen(a) || isTeen(b) || isTeen(c)){
            return true;
        }else {
            return false;
        }

    }
    public static boolean isTeen(int d){
        if(d>12 && d<20){
            return true;
        }
        return false;
    }
}
