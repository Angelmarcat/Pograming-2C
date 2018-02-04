/**********************************************************************************************************
***************      Angel Guillermo  Martinez Cruz                                 ***********************
***************     PositiveOrNegative.java                                         ***********************
***************     This program verify if a number is positive or negative         ***********************
**********************************************************************************************************/
import javax.swing.JOptionPane;
public class PositiveOrNegative
{
  public static void main(String[] args)
  {
    double num;
    num=Double.parseDouble(JOptionPane.showInputDialog("Enther a number: "));
    if (num<0)
    {
      JOptionPane.showMessageDialog(null,"The number is negative");
    }
    else if (num>0)
    {
      JOptionPane.showMessageDialog(null,"The number is positive");
    }
    else if (num==0)
    {
      JOptionPane.showMessageDialog(null,"The number is neutral");
    }
  }
}
