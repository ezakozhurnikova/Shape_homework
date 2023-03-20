package homework;

public class Rectangle implements Shape{
    int length;
    int width;

    public Rectangle(int length, int width){
        this.length=length;
        this.width=width;
    }

    @Override
    public void Area() {
        int s=length*width;
        System.out.println("Area of Rectangle is "+s);
    }

    @Override
    public void Perimeter() {
        int perimeter=2*(length+width);
        System.out.println("Perimeter of Rectangle is "+perimeter);

    }
}
