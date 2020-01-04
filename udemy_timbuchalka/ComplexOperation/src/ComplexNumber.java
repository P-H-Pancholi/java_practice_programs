public class ComplexNumber {
    private double real;
    private double imaginary;
    public ComplexNumber(double real,double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    public double getReal(){
        return this.real;
    }
    public double getImaginary(){
        return this.imaginary;
    }
    public void add(ComplexNumber A){
        this.real += A.real;
        this.imaginary += A.imaginary;
    }
    public void add(double real, double imaginary){
        ComplexNumber A = new ComplexNumber(real,imaginary);
        add(A);
    }
    public void subtract(ComplexNumber A){
        this.real -= A.real;
        this.imaginary -= A.imaginary;
    }
    public void subtract(double real,double imaginary){
        ComplexNumber A = new ComplexNumber(real,imaginary);
        subtract(A);
    }
}
