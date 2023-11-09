import java.io.PrintStream;
import java.util.Scanner;
public class Ejer24 {
    static PrintStream screen = System.out;
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[]args) {
    
    int est1 = 0;
    int est2 = 0;
    int est3 = 0;
    int aux = 0;

    screen.println("Ingrese la estatura en centimetro de la primera estatura en cm");
    est1 = keyboard.nextInt();
    screen.println("Ingrese la estatura en centimetros de la segunda estatura en cm");
    est2 = keyboard.nextInt();
    screen.println("Ingrese la estatura en centimetro de la primera estatura en cm");
    est3 = keyboard.nextInt();

    if(est1>est2) {
        aux=est1;
        est1=est2;
        est2=aux;
    }
    if(est2>est3) {
        aux=est2;
        est2=est3;
        est3=aux;
    }
    if(est1>est3) {
        aux=est1;
        est1=est2;
        est2=aux;
    }
    screen.println("El orden ascendente es primero:"+" "+est1+" "+ "segundo:"+" "+est2+" "+"Tercero:"+" "+est3);}
}
