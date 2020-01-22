import java.util.Arrays;


public class Main{
  public static void main(String[] args){
    double[] s1 = new double[]{1,1,1};
    double[] s2 = new double[]{0,0,1};
    double[] s3 = new double[]{0,1,1};
    double[] tribo_array = Xbonacci.tribonacci(s1,10);
    System.out.println(Arrays.toString(tribo_array));
    tribo_array = Xbonacci.tribonacci(s2,10);
    System.out.println(Arrays.toString(tribo_array));
    tribo_array = Xbonacci.tribonacci(s3,10);
    System.out.println(Arrays.toString(tribo_array));
  }
}

class Xbonacci {

  public static double[] tribonacci(double[] s, int n) {
      double[] tribo_array = new double[n];
      for(int i = 0;i < n;i++){
        if(i < 3){
          tribo_array[i] = s[i];
        }else{
          tribo_array[i] = tribo_array[i-1] + tribo_array[i-2]
                            +tribo_array[i-3];
        }
      }
      return tribo_array;
  }
}
