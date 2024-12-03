import java.util.*;
public class assign{
    public static void main (String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a value:");
        int a=s.nextInt();
        System.out.println("assign addtion:"+(a+=10)+"\nassign supraction:"+(a-=5)+"\nassign multipication:"+(a*=2)+"assign divisible:"+(a/=10)+"\nassign modulus:"+(a%=1));
    }
}
