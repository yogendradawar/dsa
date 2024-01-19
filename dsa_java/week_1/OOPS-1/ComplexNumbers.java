
public class ComplexNumbers {
    int real;
    int imaginary;

    public ComplexNumbers(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    void plus(ComplexNumbers c2) {
        int tempReal = this.real + c2.real;
        int tempImaginary = this.imaginary + c2.imaginary;

        this.real = tempReal;
        this.imaginary = tempImaginary;
    }

    void print() {
        System.out.print(this.real + " + " + "i" + this.imaginary);
    }

    void multiply(ComplexNumbers c2) {
        int tempReal = (this.real * c2.real) - (this.imaginary * c2.imaginary);
        int tempImaginary = (this.real * c2.imaginary) + (this.imaginary * c2.real);

        this.real = tempReal;
        this.imaginary = tempImaginary;
    }
}
