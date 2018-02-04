/*********************************************************************************************************
**************      Angel Guillermo  Martinez Cruz                                 ***********************
**************      SaleMilk.java                                                  ***********************
**************      program calculate sale of the day.                             ***********************
**********************************************************************************************************/
import java.util.Scanner;
public class SaleMilk
{
  public static void main (String[]args)
  {
    int L; //Cantidad de litros que produce
    double PG; //Precio del galón
    double TG; //Cantidad de galones que produce
    double GA; //Ganancia por la entrega de leche


    //veificar tipo de dato utilizado
    System.out.println ("Ingresa el precio del galon");
    Scanner PG1 = new Scanner (System.in);
    PG=PG1.nextInt();
    System.out.println ("Ingresa la cantidad de litros vendidos");
    Scanner L1 = new Scanner (System.in);
    L=L1.nextInt();
    TG=L*3.785;
    System.out.println ("La cantidad de galones que producidos hoy fueron  " + TG);
    GA=TG*PG;
    System.out.println ("La ganancia del dia de hoy fue de $" + GA);
  }
}
