package homework;

public class Circle implements Shape{
    int r;
    double p=Math.PI;

    public Circle(int r){
        this.r=r;
    }

    @Override
    public double Area() {

        double s=p*(r*r);
      return s;

    }

    @Override
    public double Perimeter() {
        double perimeter=2*r*p;
        return perimeter;

    }

    public int getR() {
        return r;
    }

    public double getP() {
        return p;
    }
}
