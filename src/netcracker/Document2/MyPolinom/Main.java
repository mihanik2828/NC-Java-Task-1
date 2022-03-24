package netcracker.Document2.MyPolinom;

public class Main {
    public static void main(String[] args) {
        double[] coef1 = new double[]{2,1,3};
        double[] coef2 = new double[]{1,2};
        MyPolinomial polinomial1 = new MyPolinomial(coef1);
        MyPolinomial polinomial2 = new MyPolinomial(coef2);
        System.out.println(polinomial1.getDegree());
        System.out.println(polinomial1.toString());
        System.out.println(polinomial2.toString());

        System.out.println();

        System.out.println(polinomial1.add(polinomial2));
        System.out.println(polinomial1.multiple(polinomial2).toString());
    }
}
