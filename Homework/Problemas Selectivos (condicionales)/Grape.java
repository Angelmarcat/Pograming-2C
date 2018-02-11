/******************************************************************
**********      Angel Guillermo Martinez Cruz       ***************
**********      Grape.java                          ***************
**********      This pogram calculate the payment of grape    *****
******************************************************************/
import javax.swing.JOptionPane;
public class Grape
{
  public static void main(String[] args)
  {
    String tipoUva;
    int tamaUva, kilosProduccion = 0;
    double precioUva, ganancia = 0;
    tipoUva = JOptionPane.showInputDialog("Enter the tipe Grape");
    tamaUva = Integer.parseInt(JOptionPane.showInputDialog("Enter grape size"));
    kilosProduccion = Integer.parseInt(JOptionPane.showInputDialog("Enter kilos produced"));
    precioUva = Double.parseDouble(JOptionPane.showInputDialog("Enter the price of the grape"));
    if (tipoUva=="A" || tipoUva=="a")
    {
      if (tamaUva==1)
      {
        precioUva = precioUva+0.20;
      }
      if (tamaUva==2)
      {
        precioUva = precioUva+0.30;
      }
    }//end if
    if (tipoUva=="B" || tipoUva=="b")
    {
      if (tamaUva==1)
      {
        precioUva = precioUva-0.30;
      }
      if (tamaUva==2)
      {
        precioUva = precioUva-0.50;
      }
    }//end if
    ganancia = precioUva*kilosProduccion;
    JOptionPane.showMessageDialog(null, "La ganacia obtenida es: " + ganancia);
  }
}
