/****************************************************************************************************************************
********************************            Angel Guillermo  Martinez Cruz              *************************************
********************************            FreeFries.java                              *************************************
****This pogram reads points scored by home team and the opposing team and determines IF the fans win free.******************
****************************************************************************************************************************/
import javax.swing.JOptionPane; // para utilizar modo grafico GUI
public class FreeFries
{
  public static void main(String[]args)
  {
    int homePoints; //points scored by home team
    int opponentPoints; //points scored by opposing team
    homePoints =
    Integer.parseInt(JOptionPane.showInputDialog("Enter home points"));
    opponentPoints =
    Integer.parseInt(JOptionPane.showInputDialog("Enter opponent points"));
    if (homePoints>opponentPoints && homePoints >= 100)
    {
      JOptionPane.showMessageDialog(null, "A free order of French Fries for White Tigers Fans");
    }
  }
}
