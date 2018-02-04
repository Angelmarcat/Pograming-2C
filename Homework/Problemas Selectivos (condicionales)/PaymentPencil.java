/**********************************************************************************************************
***************      Angel Guillermo  Martinez Cruz                                 ***********************
***************     PaymentPencil.java                                              ***********************
***************     This program calculates the payment for x number of pencils     ***********************
**********************************************************************************************************/
import javax.swing.JOptionPane;
public class PaymentPencil
{
  public static void main(String[] args)
  {
    int x;
    double pag;
    x=Integer.parseInt(JOptionPane.showInputDialog("Enter the number of pencils:"));
    if(x>=1000)
    {
      pag=x*0.85;
      JOptionPane.showMessageDialog(null,"The total to payment is:$"+pag);
    }
    else
    {
      pag=x*0.90;
      JOptionPane.showMessageDialog(null,"The total to payment is:$"+pag);
    }
  }
}
