package netcracker.Document1.RectangleClass;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(25, 27);

        System.out.println(rectangle1.toString()+" Area:"+rectangle1.getArea() + "  Perimeter:"+ rectangle1.getPerimeter());
        System.out.println(rectangle2.toString()+" Area:"+rectangle2.getArea() + "  Perimeter:"+ rectangle2.getPerimeter());
    }
}
