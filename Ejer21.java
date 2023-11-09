import java.io.PrintStream;
import java.util.Scanner;

public class Ejer21 {
    static PrintStream screen = System.out;
    static Scanner keyboard = new Scanner(System.in);
    public static void main (String[]args){
        int  num = 0;
        String mensaje = "";
        screen.println("Ingresar un numero entero");
        num = keyboard.nextInt();
        if(num>0){mensaje="El numero es positivo";}
        else if(num<0){mensaje="El numero es negativo";}
        else{mensaje="El numero es 0";}
        screen.println(mensaje);


    }
}
