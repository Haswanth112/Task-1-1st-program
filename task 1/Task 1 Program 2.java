import java.util.*;
class primenumber
{
    public static void main(String args[])
    {
        int a,flag=1;
        System.out.print("Enter a number :");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        for(int i=2; i<a; i++)
        {
        if(a % i==0)
        {
        
            flag=0;
            break;
        }
    }
    if (flag==1)
    {
        System.out.println(a+" is prime number ");

    }
    else
    System.out.println(a+" is not a prime");

        
    }
}
