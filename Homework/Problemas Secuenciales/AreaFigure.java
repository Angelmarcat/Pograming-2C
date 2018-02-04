/*********************************************************************************************************
**************      Angel Guillermo  Martinez Cruz                                 ***********************
**************      AreaFigure.java                                                ***********************
**************      This program calculate the area of next figure                 ***********************
**********************************************************************************************************/
import java.util.Scanner;
public class AreaFigure
{
  public static void main(String[]args)
  {
    double area;//this variable is for calculates the area of a Figure
    System.out.println("We will divide our figure in three, in a semicircumference and in two triangles \n");
    System.out.println("First enter the measures of the semicircumference \n");
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the radio: ");
    double radio=sc.nextDouble();//variable for the radio of the semicircumference
    final double PI=3.1416;
    System.out.println("Now, enter the measures of the triangles \n");
    System.out.println("Enter the hypotenuse of one of the triangles: ");
    double hyp=sc.nextDouble();//variable for the hypotenuse of the triangle
    double ac=(PI*radio+radio)/2;
    double at= (Math.sqrt((hyp*hyp)-(radio*radio)))*2;
    area=ac+at;//operation
    System.out.println("The area of the figure is : "+area+" centimeters quares");
  }//end main
}//end AreaFigure
