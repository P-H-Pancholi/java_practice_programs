public class Hello {
    public static void main(String[] args){
        double myfirstvariable = 20.0d;
        double mysecondvariable = 80.0d;
        double mythirdvariable = myfirstvariable + mysecondvariable;
        double myfourthvariable = mythirdvariable * 100.0d;
        System.out.println(myfourthvariable % 40.0d);
        boolean myflag = myfourthvariable % 40.0d == 0 ? true : false;
        System.out.println(myflag);
        if ( !myflag)
            System.out.println("Got some remainder");
        System.out.println();
    }
}
