public class Main {
    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(6,11);
        calcFeetAndInchesToCentimeters(25);


    }
    public static int calcFeetAndInchesToCentimeters(double feet,double inches){
        if((feet < 0) || (inches < 0) || (inches > 12)){
            return -1;
        }
        double newInches = inches + feet * 12.0;
        double centimeters = newInches * 2.54;
        System.out.println(feet + " feet and "+ inches+ " inches makes " + centimeters + " centimeters");
        return 0;

    }
    public static int calcFeetAndInchesToCentimeters(double inches){
        if(inches<0){
            return -1;
        }
        double feet = (int) (inches/12);
        double remainingInches = (int) (inches % 12);
        calcFeetAndInchesToCentimeters(feet,remainingInches);
        return 0;
    }

}
