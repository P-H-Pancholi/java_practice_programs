public class EqualSumChecker {
    public static boolean hasEqualSum(int a,int b,int c){
        int temp = a + b;
        if(temp == c){
            return true;
        }
        return false;
    }
}
