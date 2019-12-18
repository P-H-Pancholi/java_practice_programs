public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        if (number < 0){
            return -1;
        }
        int sum = number % 10;
        while (number != 0){

            if(number / 10 == 0){
                sum += number;
            }
            number /= 10;
        }
        return sum;
    }
}
