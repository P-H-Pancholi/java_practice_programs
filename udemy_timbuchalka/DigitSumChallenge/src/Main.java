public class Main {
    public static void main(String[] args) {
        System.out.println(sumDigit(125));
        System.out.println(sumDigit(-8));
        System.out.println(sumDigit(38));
        System.out.println(sumDigit(8));

    }
    public static int sumDigit(int a){
        if (a < 10){
            return -1;
        }
        int sum = 0;
        while (a != 0){
            sum = sum + a % 10;
            a = (int) a / 10;
        }
        return sum;
    }
}
