/*****************************************************************************************
**************      Angel Guillermo  Martinez Cruz                 ***********************
**************      AreaOfTriangle                                 ***********************
**************      This pogram calculate the area of a triangle.  ***********************
*****************************************************************************************/
import java.util.Scanner;
public class AreaOfTriangle {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b;
        System.out.print("Se va a calcular el area de un triangulo.");
        System.out.println("\nIngresa base");
        a=sc.nextDouble();
        System.out.println("Ingresa altura");
        b=sc.nextDouble();
        double area;
        area=b*a/2;
       System.out.print("El area del triangulo es: "+area);
     }
}
