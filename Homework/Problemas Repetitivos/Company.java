/*********************************************************************************************************************************************************
*****************        Angel Guillermo Martínez Cruz                                           *********************************************************
*****************        Company.java                                                              *********************************************************
*****************        this program calculates the weekly salary of N workers and how much did the company for the N employees**************************
*********************************************************************************************************************************************************/
import javax.swing.JOptionPane;
public class Company {
  public static void main(String[] args)  {
    double pagoHora, pagoEmpleado = 0, pagoGlobal = 0;
    int numeroEmpleados, horasTrabajadasSemanal;
    numeroEmpleados = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of employees to calculate"));
    for ( int i = 1; i<=numeroEmpleados; i++)
    {
      pagoHora = Double.parseDouble(JOptionPane.showInputDialog("Enter the payment per hour"));
      horasTrabajadasSemanal = Integer.parseInt(JOptionPane.showInputDialog("Enter the hours worked in a week"));
      pagoEmpleado = pagoHora*horasTrabajadasSemanal;
      JOptionPane.showMessageDialog(null, "Payment to the employee " + i + " is: $" + pagoEmpleado);
      pagoGlobal += pagoEmpleado;
    }
    JOptionPane.showMessageDialog(null, "The total paid to employees is: $" + pagoGlobal);
  }
}
