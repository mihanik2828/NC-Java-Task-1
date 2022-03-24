package netcracker.Document1.CircleClass;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(4,"red");
        System.out.println(circle.toString() + circle.getArea());
        circle.setColor("yellow");
        circle.setRadius(5);
        System.out.println(circle.toString() + circle.getArea());

    }
}
