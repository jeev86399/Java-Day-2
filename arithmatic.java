import java.util.*;
public class arithmatic{
    public static void main (String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println("addition="+(a+b));
        System.out.println("supraction="+(a-b));
        System.out.println("multipication="+(a*b));
        System.out.println("division="+(a/b));
        System.out.println("modulus="+(a%b));
    }
}