package netcracker.Document2.Complex;

import java.util.Objects;

public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex() {
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    @Override
    public String toString() {
        return "\t"+'('+real+(imag<0?"":"+")+imag+"i)  ";
    }

    public boolean isReal()
    {
        return real!=0;
    }

    public boolean isImaginary()
    {
        return imag!=0;
    }

    public boolean equals(double real1,double imag1)
    {
        return (real==real1)&&(imag==imag1);
    }

    public boolean equals(MyComplex myComplex) {
        return (real==myComplex.getReal())&&(imag==myComplex.getImag());
    }

    public double argument()
    {
        return (real<0&&imag<0)||(real<0 && imag>0) ? Math.atan(real/imag)+Math.PI*Math.signum(imag) : Math.atan(real/imag);
    }

    public double magnitude()
    {
        return Math.sqrt(Math.pow(real,2) + Math.pow(imag,2));
    }

    public MyComplex add(MyComplex right)
    {
        this.setReal(this.real+right.real);
        this.setImag(this.imag+right.imag);
        return this;
    }
    public MyComplex subtract(MyComplex right)
    {
        this.setReal(this.real-right.real);
        this.setImag(this.imag-right.imag);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyComplex myComplex = (MyComplex) o;
        return Double.compare(myComplex.real, real) == 0 && Double.compare(myComplex.imag, imag) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(real, imag);
    }

    public MyComplex multiply(MyComplex right)
    {
        this.setReal(this.real*right.real);
        this.setImag(this.imag*right.imag);
        return this;
    }
    public MyComplex divide(MyComplex right)
    {
        this.setReal(this.real/right.real);
        this.setImag(this.imag/right.imag);
        return this;
    }

    public MyComplex addNew(MyComplex right)
    {
        return new MyComplex((this.real+right.real),(this.imag+right.imag));
    }

    public MyComplex subtractNew(MyComplex right)
    {
        return new MyComplex((this.real-right.real),(this.imag-right.imag));
    }

    public MyComplex conjugate()
    {
        return new MyComplex(real,-imag);
    }
}
