import java.util.*;
public class comparision{
    public static void main (String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a value:");
        int a=s.nextInt();
        System.out.println("enter b value:");
        int b=s.nextInt();
        System.out.println("a equal b:"+(a==b));
        System.out.println("a is not equal b:"+(a!=b));
        System.out.println("a is lessthan or equal to b:"+(a<=b));
        System.out.println("a is greater than or equal to b:"+(a>=b));
        System.out.println("a is less than b:"+(a<b));
        System.out.println("a is greater than b:"+(a>b));
    }
}