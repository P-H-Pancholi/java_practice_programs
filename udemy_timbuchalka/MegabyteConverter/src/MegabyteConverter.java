public class MegabyteConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes < 0){
            System.out.println("Invalid Valid");
        }else {
            int Megabytes = kiloBytes / 1024;
            int remainingKiloBytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + Megabytes + " MB and " + remainingKiloBytes + " KB");
        }
    }
}
