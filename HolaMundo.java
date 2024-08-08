import java.util.Scanner;

public class HolaMundo {
    static String nombre="Whup";
    static int edad=92;
    public static void main(String[] args) {
       
        System.out.println("Hola Mundo");
        Scanner lectorConsol=new  Scanner(System.in);
        nombre=lectorConsol.next();
        System.out.println(nombre);
    }

    
}