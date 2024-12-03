import java.util.*;
class xorequal
{
    public static void main(String args[])
    {
        //using xor equal or not checking
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        if((a^b)==0)
        {
            System.out.println("given numnbers are equal by x-or operends");
        }
        else
        {
            System.out.println("checking by xor opernend :not equal");
        }
    }
}