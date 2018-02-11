/*********************************************************************************************************************************
*****************        Angel Guillermo Martínez Cruz                                           *********************************
*****************        PrintNumbers.java                                                              *********************************
*****************        This program prints the even numbers between zero and one hundred       *********************************
*********************************************************************************************************************************/
public class PrintNumbers {
  public static void main (String[] args) {
    int numerosPares = 2;
    while (numerosPares<=100)
    {
      System.out.println(numerosPares);
      numerosPares += 2;
    }
  }
}
