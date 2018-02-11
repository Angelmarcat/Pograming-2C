/*********************************************************************************************************************************************************
*****************        Angel Guillermo Martínez Cruz                                           *********************************************************
*****************        Credit.java                                                              *********************************************************
*****************        this program calculates how much a person must pay monthly and how much to pay after 20 months***********************************
*********************************************************************************************************************************************************/
import javax.swing.JOptionPane;
public class Credit {
  public static void main(String[] args)  {
    double pagoMes = 10, pagoTotal = 0;
    for ( int i = 1; i<=20; i++)  {
      pagoTotal += pagoMes;
      JOptionPane.showMessageDialog(null, "Payment of the month " + i + " is: " + pagoMes);
      pagoMes *= 2;
    }
    JOptionPane.showMessageDialog(null, "The total payment after 20 months is: " + pagoTotal);
  }
}
