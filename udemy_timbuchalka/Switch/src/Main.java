public class Main {
    public static void main(String[] args) {
        int value = 1;
//        if (value == 1){
//            System.out.println("It was a 1");
//        }
//        else if(value == 2){
//            System.out.println("It was a 2");
//        }else{
//            System.out.println("Neither 2 nor 1");
//        }
        int switchValue = 1;
        switch (switchValue){
            case 1:
                System.out.println("It was 1");
                break;
            case 2:
                System.out.println("It was a 2");
                break;
            case 3: case 4: case 5:
                System.out.println("It was a 3, or a 4, or a 5");
            default:
                System.out.println("Neither 1, 2, 3, 4 or 5");
        }

    }
}
