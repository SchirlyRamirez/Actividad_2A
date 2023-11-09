import java.util.Scanner;
import java.io.PrintStream;

public class Ejer23 {
   static PrintStream screen = System.out;
    static Scanner keyboard = new Scanner(System.in); 
    public static void main(String[]args ) {
          int cantidaddellanta = 0;
          int valordelallanta;
          screen.println("Cantidad de llantas");
          cantidaddellanta=keyboard.nextInt();
          if(cantidaddellanta<4){valordelallanta=cantidaddellanta*120000;}
          else{valordelallanta=cantidaddellanta*108000;}
          screen.println("el costo de las llantas es:"+valordelallanta);}
}