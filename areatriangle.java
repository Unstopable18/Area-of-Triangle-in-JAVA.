//WAP in JAVA for Area of Triangle. 
import java.util.Scanner;
public class areatriangle
{
    public static void main (String args[])  
    {         
        float b,h,area ;  
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Base of traingle: ");
        b=sc.nextFloat();
        System.out.println("Enter Heigth of traingle: ");
        h=sc.nextFloat();
        area = ( b*h) / 2 ;  	
        System.out.println("*******************************");                         
        System.out.println("Area of Triangle is: "+area);                        
    }
}