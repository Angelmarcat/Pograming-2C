/*********************************************************************************************************************************************************************************************************
Angel Guillermo Martinez Cruz
1._ Haz una aplicacion que calcule el area de un circulo (pi*R²). El radio se pedira por teclado (recuerda pasar de String a double con Double.paserDouble) usa la constante PI y el metodo pow de Math.
**********************************************************************************************************************************************************************************************************/
import java.util.Scanner;
public class Examen {

    public static void main(String[] args){
        Scanner t = new Scanner(System.in);
        double r = 0;
        double A = 0;

        System.out.println("Dame el radio");
        r = t.nextInt();

        A = Math.PI * Math.pow(r,2);

        System.out.printf("El area del ciculo es: %f",A);
    }
}
