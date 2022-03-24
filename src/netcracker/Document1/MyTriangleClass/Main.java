package netcracker.Document1.MyTriangleClass;

public class Main {
    public static void main(String[] args) {
        MyTriangle myTriangle1 = new MyTriangle(1,1,2,2,5,2);//Scalene
        MyTriangle myTriangle2 = new MyTriangle(1,1,5,1,3,4);//Isosceles
        MyTriangle myTriangle3 = new MyTriangle(1,1,9,1,5,9);//Equilateral



        System.out.println(myTriangle1.toString()+"Perimeter:"+myTriangle1.getPerimeter()+" Type:"+myTriangle1.getType());
        System.out.println(myTriangle2.toString()+"Perimeter:"+myTriangle2.getPerimeter()+" Type:"+myTriangle2.getType());
        System.out.println(myTriangle3.toString()+"Perimeter:"+myTriangle3.getPerimeter()+" Type:"+myTriangle3.getType());

    }
}
