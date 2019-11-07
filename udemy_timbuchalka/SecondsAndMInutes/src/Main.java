public class Main {
    public static void main(String[] args) {
        getDurationString(61,0);

    }
    public static int getDurationString(int minutes,int seconds){
        if((minutes < 0) || (seconds < 0) || (seconds > 59)){
            System.out.println("Invalid value");
            return -1;
        }
        int hours = (int)minutes/60;
        int newMinutes = minutes%60;
        System.out.println(hours+"h " + newMinutes + "m " + seconds + "s ");
        return 0;
    }
    public static int getDurationString(int seconds){
        if(seconds < 0){
            System.out.println("Invalid Value");
            return -1;
        }
        int minutes = (int)seconds / 60;
        int newSeconds = seconds % 60;
        getDurationString(minutes,newSeconds);
        return 0;

    }
}
