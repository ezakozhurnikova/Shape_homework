package homework;

public class Circle implements Shape{
    int r;
    double p=Math.PI;

    public Circle(int r){
        this.r=r;
    }

    @Override
    public void Area() {
        double s=p*(r*r);
        System.out.println("Area of a Circle is "+s);

    }

    @Override
    public void Perimeter() {
        double perimeter=2*r*p;
        System.out.println("Length of circumference is "+perimeter);

    }
}
