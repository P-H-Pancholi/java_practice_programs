public class Main{
  public static void main(String[] args) {
    int[] myArray1 = new int[]{25,25,50};
    int[] myArray2 = new int[]{25,100};
    int[] myArray3 = new int[]{25,25,50,50,100};
    System.out.println(Line.Tickets(myArray1));
    System.out.println(Line.Tickets(myArray2));
    System.out.println(Line.Tickets(myArray3));
  }
}

class Line{
  public static String Tickets(int[] peopleInLine){
    int sum = 0;
    int bill_25 = 0;
    int bill_50 = 0;
    int bill_100 = 0;
    for(int i = 0;i < peopleInLine.length; i++){
      int j = peopleInLine[i] - 25;
      if(j == 0){
        bill_25 += 1;
      }
      if(j == 25){
        bill_50 += 1;
        if(bill_25 == 0){
          return "NO";
        }
        bill_25 -= 1;
      }
      if(j == 75){
        bill_100 += 1;
        if(bill_25 == 0 ){
          return "NO";
        }
        if(bill_50 == 0){
          if(bill_25 < 3){
            return "NO";
          }else{
            bill_25 -= 3;
          }
        }else{
          bill_25 -= 1;
          bill_50 -= 1;
        }
      }
    }
    return "YES";
  }
}
