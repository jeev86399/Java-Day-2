import java.util.*;
public class swap3{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=b;
        b=a;
        a=c;
        String res=String.format("after swapping \n boy=%d \ngirl=%d",a,b);
        System.out.println(res);
    }
}