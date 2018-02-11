/****************************************************************************************************
*****************        Angel Guillermo Martínez Cruz                  *****************************
*****************        AverageStature.java                            *****************************
*****************        This program calculates the average stature of a group**********************
*****************************************************************************************************/
import javax.swing.JOptionPane;
public class AverageStature {
  public static void main(String[] args) {
    int C=0;
    double ES, SU =0, PR;
    C = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of the peoples"));
    for (int i = 1; i<=C; i++)  {
    ES = Double.parseDouble(JOptionPane.showInputDialog("Enter the stature of the people " + i));
    SU += ES;
    }
    PR = SU/C;
    JOptionPane.showMessageDialog(null, "The stature average of the group is: " + PR);
  }
}
