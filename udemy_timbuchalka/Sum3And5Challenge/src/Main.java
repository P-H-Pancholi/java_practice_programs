public class Main {
    public static void main(String[] args) {
        int Count = 0;
        int Sum = 0;
        for(int i = 5;i < 1000;i += 5){
            if(i % 3 == 0){
                System.out.println("The number " + i + " is divisible by both 5 and 3");
                Count += 1;
                Sum += i;
            }
            if(Count == 5){
                break;
            }
        }
        System.out.println("And Sum of these numbers is : " + Sum);
    }
}
