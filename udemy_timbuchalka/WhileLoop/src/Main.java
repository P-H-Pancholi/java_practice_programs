public class Main {
    public static void main(String[] args) {
        //Create a method called isEvenNumber with an parameter int
        //Its purpose is to define argument is
        //even or not
        //return true if even number, otherwise false
        int number = 4;
        int finishedNumber = 20;
        while(number <= finishedNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            System.out.println("Even number " + number);
        }
    }
    public static boolean isEvenNumber(int a){
        if(a%2 == 0){
            return true;
        }else{
            return false;
        }
    }
}
