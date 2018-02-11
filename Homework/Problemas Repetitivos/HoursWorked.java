/*********************************************************************************************************************************************************
*****************        Angel Guillermo Martínez Cruz                                           *********************************************************
*****************        HoursWorked.java                                                              ***************************************************
*****************        This program determines the total hours an employee works and the salary that will be paid for the hours worked******************
*********************************************************************************************************************************************************/
import javax.swing.JOptionPane;
public class HoursWorked {
  public static void main(String[] args)  {
    double pagoHora = 0, sueldoSemanal = 0;
    int horasTotales = 0, horasDia;
    pagoHora = Double.parseDouble(JOptionPane.showInputDialog("Enter enter rate per hour"));
    for ( int i = 1; i<= 6; i++)  {
      horasDia = Integer.parseInt(JOptionPane.showInputDialog("Enter the hours worked in the day " + i));
      horasTotales += horasDia;
    }
    sueldoSemanal = horasTotales*pagoHora;
    JOptionPane.showMessageDialog(null, "The salary is: " + sueldoSemanal);
  }
}
