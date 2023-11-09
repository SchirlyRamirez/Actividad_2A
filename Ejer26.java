import java.io.PrintStream;
import java.util.Scanner;

public class Ejer26{
    static PrintStream screen = System.out;
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[]args){
    long celular;

    screen.println("Ingrese un numero de celular");
    celular=keyboard.nextLong();
    celular=celular/10000000;
    if(celular>=300 && celular<=305){
        screen.println("Este operaror es tigo y un operador con red y su indicativo es:"+celular);
    }
    if(celular>=310 && celular<=314 || celular>=320 && celular<=323){
        screen.println("Este operador es claro y es un operador con red y su indicativo es:"+celular);
    }
    if(celular>=315 && celular<=319){
        screen.println("Este operador es movistar y es un operador con red y su indicativo es:"+celular);
    }

    }
    }

