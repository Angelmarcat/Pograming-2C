/*********************************************************************************************************************************
*****************        Angel Guillermo Martínez Cruz                                           *********************************
*****************        Saving.java                                                             *********************************
*****************        This program calculates how much a person saves in a year               *********************************
*********************************************************************************************************************************/
import javax.swing.JOptionPane;
public class Saving {
  public static void main(String[] args) {
    double cantidadAhorrada = 0, ahorroMensual;
    for (int i = 1; i<=12; i++)  {
      ahorroMensual = Double.parseDouble(JOptionPane.showInputDialog("Enter the amount to be saved in the month " + i));
      JOptionPane.showMessageDialog(null, "The amount saved in the month " + i + " is: " + ahorroMensual);
      cantidadAhorrada += ahorroMensual;
    }
    JOptionPane.showMessageDialog(null, "The amount saved in the year is: " + cantidadAhorrada);
  }
}
