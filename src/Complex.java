
public class Complex implements ComplexInterface {
    private int real;
    private int imaginary;

    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public int getReal() {
        return real;
    }

    public int getImaginary() {
        return imaginary;
    }

    @Override
    public Complex add(Complex a) {
        return new Complex(this.getReal() + a.getReal(), this.getImaginary() + a.getImaginary());
    }

    @Override
    public Complex sub(Complex a) {
        return new Complex(this.getReal() - a.getReal(), this.getImaginary() - a.getImaginary());
    }

    @Override
    public Complex multiply(Complex a) {
        return new Complex(this.getReal() * a.getReal() - this.getImaginary() * a.getImaginary(), this.getReal() * a.getImaginary() + this.getImaginary() * a.getReal());
    }

    @Override
    public void printComplex(){
        if(this.getImaginary() < 0){
            System.out.println(this.getReal() + " - " + this.getImaginary()*(-1) + "i");
        }
        else{
            System.out.println(this.getReal() + " + " + this.getImaginary() + "i");
        }
    }
}
