/*************************************************************************************************
**************      Angel Guillermo  Martinez Cruz                         ***********************
**************      CalculateSalary.java                                   ***********************
**************      This program calculate the salary.                     ***********************
**************************************************************************************************/

import java.util.Scanner;
public class CalculateSalary
{
  public static void main (String[]args)
  {
    Double HT; //Horas trabajadas
    Double PH; //Pago por hora
    Double SS; //Sueldo semanal
    Scanner in = new Scanner(System.in);
    System.out.println ("Por favor ingrese el pago por hora de este trabajador");
    HT = in.nextDouble();
    System.out.println ("Ingresa el las horas trabajadas por el esta semana.");
    PH = in.nextDouble();
    SS=HT*PH;
    System.out.println ("El total a pagar por esta semana al trabajador sera de $" + SS);
  }
}
