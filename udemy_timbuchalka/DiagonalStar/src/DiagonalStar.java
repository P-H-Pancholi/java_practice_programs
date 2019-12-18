public class DiagonalStar {
    public static void printSquareStar(int n){
        if(n < 5){
            System.out.println("Invalid Value");
        }else{
            for(int i = 0;i < n;i++){
                for(int j =0;j<n;j++){
                    if(i==0 || j == 0 || i == j || i == n-j-1 || i == n-1 || j == n-1){
                        System.out.print('*');
                    }else {
                        System.out.print(' ');
                    }
                }
                System.out.println("");
            }
        }
    }
}
