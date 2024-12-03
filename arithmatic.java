import java.util.*;
public class arithmatic{
    public static void main (String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int d,e,f,g,h;
        d=a+b;
        e=a-b;
        f=a*b;
        g=a/b;
        h=a%b;
        System.out.println("addition="+d);
        System.out.println("supraction="+e);
        System.out.println("multipication="+f);
        System.out.println("division="+g);
        System.out.println("modulus="+h);
    }
}