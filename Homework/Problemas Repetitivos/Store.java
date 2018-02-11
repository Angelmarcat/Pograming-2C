/*********************************************************************************************************************************************************
*****************        Angel Guillermo Martínez Cruz                                           *********************************************************
*****************        Store.java                                                              *********************************************************
*****************        this program calculates how many purchases were greater than 1000, howmany were greater than 500 but less than or equal to 1000, and how many were less than or equal to 500 and the amount of what is sold in each category and globally.******
*********************************************************************************************************************************************************/
import javax.swing.JOptionPane;
public class Store{
  public static void main(String[] args)  {
    int venta, numeroVentas, mayores1000 = 0, mayores500 = 0, menores500 = 0;
    double montoMayores1000 = 0, montoMayores500 = 0, montoMenores500 = 0, montoGlobal = 0;
    numeroVentas = Integer.parseInt(JOptionPane.showInputDialog("Enter the sales number"));
    for ( int i = 1; i<=numeroVentas; i++)
    {
      venta = Integer.parseInt(JOptionPane.showInputDialog("Ingest the amount of the sale " + i));
      if (venta>1000)
      {
        mayores1000 += 1;
        montoMayores1000 += venta;
      }
      else if (venta>500 && venta<=1000)
      {
        mayores500 += 1;
        montoMayores500 += venta;
      }
      else if (venta<=500)
      {
        menores500 += 1;
        montoMenores500 += venta;
      }
    }//end for
    montoGlobal = montoMayores1000+montoMenores500+montoMayores500;
    JOptionPane.showMessageDialog(null, "The number of sales greater than $ 1000 is: " + mayores1000 + "\nThe number of sales greater than $ 500 is: " + mayores500 + "\nThe number of sales under $ 500 is: " + menores500 + "\nThe overall amount is: " + montoGlobal);
  }
}
