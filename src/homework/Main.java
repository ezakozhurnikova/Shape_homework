package homework;

public class Main  {
    public static void main(String[] args) {
        Shape circle=new Circle(3);
        System.out.println(circle.Area());
        System.out.println(circle.Perimeter());

        Shape rectangle=new Rectangle(5,6);
        System.out.println(rectangle.Area());
        System.out.println(rectangle.Perimeter());

    }
    /*Area of a Circle is 28.274333882308138
      Length of circumference is 18.84955592153876
      Area of Rectangle is 30
      Perimeter of Rectangle is 22*/

}
