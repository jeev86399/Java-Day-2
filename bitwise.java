import java.util.*;
public class bitwise{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("bitwise and:"+(a&b));
        System.out.println("bitwise and by formula:"+((a+b)-(a|b)));
        System.out.println("bitwise or:"+(a|b));
        System.out.println("bitwise or by formula:"+((a+b)-(a&b)));
        System.out.println("bitwise x-or:"+(a^b));
        System.out.println("bitwise x-or by formula:"+((a|b)-(a&b)));
    }
}