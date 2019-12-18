public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        if(number < 0){
            return -1;
        }
        int sum = 0;
        while (number != 0){
            int a = number % 10;
            if (a % 2 == 0){
                sum += a;
            }
            number /= 10;
        }
        return sum;
    }
}
