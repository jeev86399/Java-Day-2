import java.util.*;
public class flipbits{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int pos=s.nextInt();
        System.out.println(a^(1<<pos));
    }
}