package homework;

public class Rectangle implements Shape{
    int length;
    int width;

    public Rectangle(int length, int width){
        this.length=length;
        this.width=width;
    }

    @Override
    public double Area() {
        double s=length*width;
        return s;

    }

    @Override
    public double Perimeter() {
        double perimeter=2*(length+width);
        return perimeter;

    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
}
