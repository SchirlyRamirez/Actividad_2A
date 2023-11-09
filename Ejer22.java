import java.io.PrintStream;
import java.util.Scanner;
public class Ejer22 {
    static PrintStream screen = System.out;
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[]args){
        int num = 0;
        String mensaje ="";
        String mensaje2 ="";
        screen.println("Ingrese un numero entero");
        num = keyboard.nextInt();
        if(num>0){mensaje="El numero es positvo";}
        else if(num<0){mensaje="El numero es negativo";}
        else{mensaje="El numero es 0";}
        if (num%2==0) {
            mensaje2 = "El numero es par";
        }
        else{
            mensaje2 = "El numero es impar";
        }
        screen.println(mensaje+mensaje2);

    }
}