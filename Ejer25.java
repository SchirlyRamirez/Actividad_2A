import java.io.PrintStream;
import java.util.Scanner;

public class Ejer25{
    static PrintStream screen = System.out;
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        int per1 = 0;
        int per2 = 0;
        int per3 = 0;
        int per4 = 0;
        int aux = 0;
    
        screen.println("Ingrese la estatura en centimetro de la primera estatura en cm");
        per1 = keyboard.nextInt();
        screen.println("Ingrese la estatura en centimetros de la segunda estatura en cm");
        per2 = keyboard.nextInt();
        screen.println("Ingrese la estatura en centimetro de la primera estatura en cm");
        per3 = keyboard.nextInt();
        screen.println("Ingrese la estaura en centimetro de la cuarta estatura en cm");
        per4 = keyboard.nextInt();

        if(per1>per2){
            aux=per1;
            per1=per2;
            per2=aux;
        }
        if(per2>per3){
            aux=per2;
            per2=per3;
            per3=aux;
        }
        if(per3>per4){
            aux=per3;
            per3=per4;
            per4=aux;
        }
        if(per1>per2){
            aux=per1;
            per1=per2;
            per2=aux;
        }
        if(per2>per3){
            aux=per2;
            per2=per3;
            per3=aux;
        }
        if(per1>per2){
            aux=per1;
            per1=per2;
            per2=aux;
        }
        screen.println("El orden ascendente es primero:"+" "+per1+" "+ "segundo:"+" "+per2+" "+"Tercero:"+" "+per3+" "+"Cuarto:"+" "+per4);}

    
}