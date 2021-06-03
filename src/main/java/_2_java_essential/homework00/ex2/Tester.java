package _2_java_essential.homework00.ex2;

class Tester {
    public static void main(String[] args) {

        /**MyInteger*/
        int a = 10, b = 12;
        MyInteger i = new MyInteger(100);
        System.out.println("MyInteger: " + i);
        System.out.print(i + " + " + a + " = ");
        i.plus(a);
        System.out.println(i);

        System.out.print(i + " - " + a + " = ");
        i.minus(a);
        System.out.println(i);

        System.out.print(i + " * " + a + " = ");
        i.multiply(a);
        System.out.println(i);

        System.out.print(i + " / " + a + " = ");
        i.devide(a);
        System.out.println(i);

        System.out.print(i + " % " + b + " = ");
        i.multiplyPart(b);
        System.out.println(i);



        /**MyInt*/
        MyInt i2 = new MyInt(100);
        System.out.println("\n\n\nMyInt: " + i2);
        System.out.print(i2 + " + " + a + " = ");
        i2.plus(a);
        System.out.println(i2);

        System.out.print(i2 + " - " + a + " = ");
        i2.minus(a);
        System.out.println(i2);

        System.out.print(i2 + " * " + a + " = ");
        i2.multiply(a);
        System.out.println(i2);

        System.out.print(i2 + " / " + a + " = ");
        i2.devide(a);
        System.out.println(i2);

        System.out.print(i2 + " % " + b + " = ");
        i2.multiplyPart(b);
        System.out.println(i2);


        /**MyDouble*/
        MyDouble d = new MyDouble(100.11);
        System.out.println("\n\n\nMyDouble: " + d);
        System.out.print(d + " + " + a + " = ");
        d.plus(a);
        System.out.println(d);

        System.out.print(d + " - " + a + " = ");
        d.minus(a);
        System.out.println(d);

        System.out.print(d + " * " + a + " = ");
        d.multiply(a);
        System.out.println(d);

        System.out.print(d + " / " + a + " = ");
        d.devide(a);
        System.out.println(d);



        /**My_double*/
        My_double d2 = new My_double(100.11);
        System.out.println("\n\n\nMydouble: " + d2);
        System.out.print(d2 + " + " + a + " = ");
        d2.plus(a);
        System.out.println(d2);

        System.out.print(d2 + " - " + a + " = ");
        d2.minus(a);
        System.out.println(d2);

        System.out.print(d2 + " * " + a + " = ");
        d2.multiply(a);
        System.out.println(d2);

        System.out.print(d2 + " / " + a + " = ");
        d2.devide(a);
        System.out.println(d2);



        /**MyString*/
        String str = "!!!!!";
        MyString s = new MyString("Some string");
        System.out.println("\n\n\nMyString: " + s);
        System.out.print("(" + s + ") + (" + str + ") = ");
        s.concat(str);
        System.out.println("(" + s + ")");

        System.out.println("(" + s + ") = (" + str + ")");
        s.setValue(str);
        System.out.println("MyString: " + s);
    }
}
