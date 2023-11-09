import java.io.PrintStream;
import java.util.Scanner;
public class Ejer27{
      static PrintStream screen = System.out;
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[]args) {
    String fecha = "";
    String cadena = "";
    int num = 0;
    String signo = "";
    screen.println("Ingrese una fecha en formato AAAA-MM-DD");
    fecha = keyboard.nextLine();

    cadena = fecha.substring(5,7) + fecha.substring(8,10);

    num = Integer.parseInt(cadena);
    if (num>= 120 && num<= 131 || (num>= 201 && num<= 218))
        signo = "Acuario";
    else if((num>=219 && num<=229) || (num>=301 && num<=320))
        signo = "Piscis";
    else if((num>=321 && num<=331 || num>=401 && num<=419))
        signo = "Aries";
    else if((num>=420 && num<=430 || num>=501 && num<=520))
        signo = "Tauro";
    else if((num>=521 && num<=531 || num>=601 && num<=620))
        signo = "Geminis";
    else if((num>=621 && num<=630 || num>=701 && num<=722))
        signo = "Cancer";
    else if((num>=723 && num<731 || num>=801 && num<=822))
        signo = "Leo";
    else if((num>=823 && num<=831 || num>=901 && num<=922))
        signo = "Virgo";
    else if((num>=923 && num<=930 || num>=1001 && num<=1022))
        signo = "Libra";
    else if((num>=1023 && num<=1031 || num>=1101 && num<=1121))
        signo = "Escorpio";
    else if((num>=1122 && num<=1130 || num>=1201 && num<=2121))
        signo = "Sagitario";
    else if((num>=1212 && num<=1231 || num>=101 && num<=131))
        signo = "Capricornio";
    if(!signo.isEmpty())
        screen.println("su signo zodiacal es "+signo);
    else
        screen.println("no se pudo determinar su signo del zodiaco");


}
    }