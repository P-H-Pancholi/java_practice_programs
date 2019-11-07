public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        boolean temp = true;
        if (hourOfDay > 23 || hourOfDay < 0){
            return false;
        }
        if (hourOfDay > 8 && hourOfDay < 22){
            temp = false;
        }
        if(temp == barking){
            return true;
        }
        return false;
    }
}
