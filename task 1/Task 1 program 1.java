import java.util.Scanner;
class mmsc
{
    public static void main(String args[])
    {
        int a;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number :");
        a=s.nextInt();
        if (a>=50){
            System.out.println("senior citizen ship");
        }
else if (a>=18){
            System.out.println("major");
        }
else{
            System.out.println("minor");
 }
   }
}