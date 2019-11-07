public class SpeedConverter {
    public static long toMilesPerHour(double KilometerPerHour){
        if (KilometerPerHour < 0) {
            return -1;
        }
        return (Math.round(KilometerPerHour/ 1.609));
    }
    public static void PrintConversion(double KilometerPerHour){
        if(KilometerPerHour < 0){
            System.out.println("Invalid Value");
        }else{
            long MilesPerHour = toMilesPerHour(KilometerPerHour);
            System.out.println(KilometerPerHour + " Km/h = " + MilesPerHour + " Mi/hr" );
        }

    }
}
