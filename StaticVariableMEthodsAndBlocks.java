//Write a program to demonstrate Static Variables, Methods, and Blocks.

public class StaticVariableMEthodsAndBlocks {

    //Static Variables
    static int m=2;
    static int n;

    //Static Block
    static {
        n = 5*m;
        System.out.println("Static Block Variable 'n:'" +n);
    }

    //Static Method
    static void staticMethod(int A)
    {
        System.out.println("Static Method Invoked");
        System.out.println("A =" + A);
        System.out.println("Using Static Variables");
        System.out.println("m =" + m);
        System.out.println("n =" + n);

    }
}
