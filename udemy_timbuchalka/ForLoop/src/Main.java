public class Main {
    public static void main(String[] args) {
        System.out.println("10,000 at 2% rate of interest = " + calculateInterest(10000.00,2.00));
        //using the for loop call the function calculateInterest with amount
        //10000 and rate of interest 2,3,4,5,6,7,8 and
        //print the result back
        // to console
        for (int i = 2;i < 9;i++){
            System.out.println("10,000 at " + i + "% rate of interest = " + String.format("%.2f",calculateInterest(10000,i)));
        }
        for (int i = 8;i > 1;i--){
            System.out.println("10,000 at " + i + "% rate of interest = " + String.format("%.2f",calculateInterest(10000,i)));
        }
        //Create a for statement using any range of number
        //Determine if the number is prime or not
        //if the number is prime increment the count and print it out
        //if that count is three exit the loop
        //hint : use break statement
        int Count = 0;
        for (int i = 1;i < 15;i++ ){
            if(isPrime(i)){
                Count += 1;
                System.out.println("Prime number found: " + i);
            }
            if(Count == 3){
                break;
            }
        }


    }
    public static boolean isPrime(int n){
        if(n == 1){
            return false;
        }else {
            for(int i = 2;i <= n/2;i++){
                if(n % i == 0){
                    return false;
                }
            }
        }
        return true;
    }

    public static double calculateInterest(double amount,double InterestRate){
        return (amount * (InterestRate/100));
    }
}
