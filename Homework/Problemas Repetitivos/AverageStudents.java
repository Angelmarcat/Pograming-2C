/**************************************************************************************************
*****************        Angel Guillermo Martínez Cruz                *****************************
*****************        AverageStudents.java                         *****************************
*****************        This program calculates the average age of a group of N students    ******
**************************************************************************************************/
import javax.swing.JOptionPane;
public class AverageStudents {
  public static void main(String[] args) {
    int edadAlumno, sumaEdades = 0, numeroAlumnos;
    double edadPromedio;
    numeroAlumnos = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of the students"));
    for (int i = 1; i<=numeroAlumnos; i++)
    {
      edadAlumno = Integer.parseInt(JOptionPane.showInputDialog("Enter the age of the student " + i));
      sumaEdades += edadAlumno;
    }
    edadPromedio = sumaEdades/numeroAlumnos;
    JOptionPane.showMessageDialog(null, "The age average of the group is: " + edadPromedio);
  }
}
