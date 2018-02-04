/*********************************************************************************************************
**************      Angel Guillermo  Martinez Cruz                                 ***********************
**************      SaleGround.java                                                ***********************
**************      This program calculate the area of Sale Ground                 ***********************
**********************************************************************************************************/
import java.util.Scanner;
public class SaleGround{
  public static void main(String[]args){
    double area;//this variable is for calculates the area of a AreaGround
    System.out.println("We will divide our ground in two, in a rectangle and a triangle \n");
    System.out.println("First enter the measures of the rectangle \n");
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the base: ");
    double baser=sc.nextDouble();//variable for the base of the ractangle
    System.out.println("Enter the height: ");
    double heightr=sc.nextDouble();//variable for the height of the rectangle
    System.out.println("Now, enter the measures of the triangle \n");
    System.out.println("Enter the base: ");
    double baset=sc.nextDouble();//variable for the base of the triangle
    System.out.println("Enter the height: ");
    double heightt=sc.nextDouble();//variable for the height of the triangle
    area=((baser*heightr)+(baset*heightt)/2);//operation
    System.out.println("The area of the ground is: "+area+" meters quares");
  }//end main
}//end AreaGround
