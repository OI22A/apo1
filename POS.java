import java.util.*;

public class POS {

    public static void main(String[] args) {
        String nombreProducto;
        float vlrUnitario,vlrCobrar;
        final float IVA=0.19f;
        Scanner lector=new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto");
        nombreProducto=lector.next();
        System.out.println("Ingrese el valor unitario del producto");
        vlrUnitario=lector.nextFloat();
        vlrCobrar=vlrUnitario+(vlrUnitario*IVA);
        System.out.println("El valor del IVA actualmente es de "+IVA+"Lo que en tu producto es de "+(vlrUnitario*IVA));
        System.out.println("El valor de su producto es de " + vlrCobrar);
        }
    
}
