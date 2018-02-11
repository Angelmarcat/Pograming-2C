/******************************************************************
**********      Angel Guillermo Martinez Cruz       ***************
**********      PayOfStudents.java                  ***************
**********      This pogram calculate the total pay of students  **
******************************************************************/
import javax.swing.JOptionPane;
public class PayOfStudents{
  public static void main(String[] args)
  {
    double pagoPorAlumno = 0, totalPagar = 0;
    int numeroAlumnos;
    numeroAlumnos = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of students"));
    if (numeroAlumnos>=100)
    {
      pagoPorAlumno = 65;
    }
    else if (numeroAlumnos>=50 && numeroAlumnos<=99)
    {
      pagoPorAlumno = 70;
    }
    else if (numeroAlumnos>=30 && numeroAlumnos<=49)
    {
      pagoPorAlumno = 95;
    }
    else if (numeroAlumnos<30)
    {
      pagoPorAlumno = 4000/numeroAlumnos;
    }
    totalPagar = pagoPorAlumno*numeroAlumnos;
    JOptionPane.showMessageDialog(null, "The payment per student: " + pagoPorAlumno);
    JOptionPane.showMessageDialog(null, "The total to pay: " + totalPagar);
  }
}
