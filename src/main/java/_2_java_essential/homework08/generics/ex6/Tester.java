package _2_java_essential.homework08.generics.ex6;

public class Tester {
    public static void main(String[] args) {
        GenericSingleton<String> stringSingleton = new GenericSingleton<>();
        System.out.println(stringSingleton.getElement(String.class));
        System.out.println(stringSingleton.getElement(String.class));
        System.out.println(stringSingleton.getElement(String.class));

        GenericSingleton<MyDouble> myDoubleSingleton = new GenericSingleton<>();
        System.out.println(myDoubleSingleton.getElement(MyDouble.class));
        System.out.println(myDoubleSingleton.getElement(MyDouble.class));
        System.out.println(myDoubleSingleton.getElement(MyDouble.class));

        GenericSingleton<MyInteger> myIntegerSingleton = new GenericSingleton<>();
        System.out.println(myIntegerSingleton.getElement(MyInteger.class));
        System.out.println(myIntegerSingleton.getElement(MyInteger.class));
        System.out.println(myIntegerSingleton.getElement(MyInteger.class));

        GenericSingleton<MyString> myStringSingleton = new GenericSingleton<>();
        System.out.println(myStringSingleton.getElement(MyString.class));
        System.out.println(myStringSingleton.getElement(MyString.class));
        System.out.println(myStringSingleton.getElement(MyString.class));
    }
}
