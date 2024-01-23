package class_work2;
import java.util.Scanner;

public class Class_work2 
{

    public static void main(String[] args)
    {
        Scanner leapyear = new Scanner(System.in);
        System.out.print("Enter year : ");
        int year = leapyear.nextInt();
        if (year%4!=0)
        {
            System.out.println("is not a leap year");
        }
        else if (year%100==0 && year%400!=0)
        {
            System.out.println("is not a leap year");
        }
        else 
        {
            System.out.println("is a leap year");  
        }
    }
}
