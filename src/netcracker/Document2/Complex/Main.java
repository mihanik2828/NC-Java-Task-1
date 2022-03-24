package netcracker.Document2.Complex;

public class Main {
    public static void main(String[] args) {
        MyComplex myComplex1 = new MyComplex(2,2);
        MyComplex myComplex2 = new MyComplex(1,3);
        MyComplex myComplex3 = new MyComplex(2,2);
        MyComplex myComplex4 = new MyComplex(0,2);

        System.out.println(myComplex1.toString()+"conjugate"+myComplex1.conjugate());
        // test add(),sub().....
        System.out.println(myComplex1.toString()+"add      "+myComplex2.toString()+"returned result"+myComplex1.add(myComplex2)+ "temp myComplex1" + myComplex1.toString());
        System.out.println(myComplex1.toString()+"subtract "+myComplex2.toString()+"returned result"+myComplex1.subtract(myComplex2)+ "temp myComplex1" + myComplex1.toString());
        System.out.println(myComplex1.toString()+"multiply "+myComplex2.toString()+"returned result"+myComplex1.multiply(myComplex2)+ "temp myComplex1" + myComplex1.toString());
        System.out.println(myComplex1.toString()+"divide   "+myComplex2.toString()+"returned result"+myComplex1.divide(myComplex2)+ "temp myComplex1" + myComplex1.toString());
        // test addNew(),subNew()
        System.out.println(myComplex1.toString()+"addNew   "+myComplex2.toString()+"returned result"+myComplex1.addNew(myComplex2) + "temp myComplex1" + myComplex1.toString());
        System.out.println(myComplex1.toString()+"subtractNew"+myComplex2.toString()+"returned result"+myComplex1.subtractNew(myComplex2)+ "temp myComplex1" + myComplex1.toString());
        //magnitude,equals,argument
        System.out.println();
        System.out.println(myComplex1.toString());
        System.out.println("Equals "+myComplex1.equals(myComplex2));
        System.out.println("Equals "+myComplex1.equals(myComplex3));

        System.out.println("Magnitude "+myComplex1.magnitude());
        System.out.println("Argument "+myComplex1.argument());
        System.out.println();
        System.out.println("Is Real in "+myComplex4.toString()+myComplex4.isImaginary());
        System.out.println("Is Imaginary in "+myComplex4.toString()+myComplex4.isReal());

    }
}
