public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPLaces(double a,double b){
        if((int)(a*1000) == (int)(b*1000)){
            return true;
        }
        return false;
    }
}
