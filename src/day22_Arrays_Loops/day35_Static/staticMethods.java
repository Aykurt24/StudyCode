package day22_Arrays_Loops.day35_Static;

public class staticMethods {

    static int b = 200;
    int a = 100;

    public static void main(String[] args) {
        // System.out.println(a); // static only accepts static

        staticMethods obj = new staticMethods();

        System.out.println(obj.a);

        System.out.println("==========================");

        System.out.println(b);
        System.out.println(staticMethods.b);
        System.out.println(obj.b);  //  prefers to be called through class name


    }


    public void method() {
        System.out.println(a);
        System.out.println(b);
    }


}
