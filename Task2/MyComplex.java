package Task2;
import java.math.*;

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

    public void setValue(double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    public boolean isReal(){
        return this.imag==0.0;
    }

    public boolean isImaginary(){
        return this.real==0.0;
    }

    public boolean  equals(MyComplex another) {
        return this.real==another.real && this.imag == another.imag;
    }

    public boolean equals(double real, double imag) {
        return this.real==real && this.imag == imag;
    }

    public double magnitude(){
        return Math.sqrt(Math.pow(this.real,2)+Math.pow(this.imag,2));
    }

    public double argument(){
        return Math.atan(this.imag/this.real);
    }

    public MyComplex add(MyComplex right){
        this.real+=right.real;
        this.imag+=right.imag;
        return this;
    }

    public MyComplex addNew(MyComplex right){
        return new MyComplex (this.real+right.real, this.imag+right.imag);
    }

    public MyComplex subtract(MyComplex right){
        this.real-=right.real;
        this.imag-=right.imag;
        return this;
    }

    public MyComplex subtractNew(MyComplex right){
        return new MyComplex(this.real-right.real, this.imag-right.imag);
    }

    public MyComplex multiply(MyComplex right){
        double tmp = (this.real*right.real)-(this.imag*right.imag);
        this.imag = (this.real*right.imag)+(this.imag*right.real);
        this.real = tmp;
        return this;
    }

    public MyComplex divide(MyComplex right){
        double tmp = ((this.real*right.real)+(this.imag*right.imag)) /
                (Math.pow(right.real,2)+Math.pow(right.imag,2));
        this.imag = ((right.real*this.imag)-(this.real*right.imag)) /
                (Math.pow(right.real,2)+Math.pow(right.imag,2));
        this.real = tmp;
        return this;
    }

    public MyComplex conjugate(){
        return new MyComplex(this.real,this.imag*-1);
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 19 * result + (int) real;
        result = 19 * result + (int) imag;

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        MyComplex myComplex = (MyComplex) obj;
        return myComplex.real == real && myComplex.imag == imag;
    }

    @Override
    public String toString() {
        return "(" + real +
                "" + (0 > this.imag ? imag : "+"+imag) +
                "i)";
    }
}