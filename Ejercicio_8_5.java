package ejercicio_8_5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author maylenhaagrosbaco
 */
public class Ejercicio_8_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos usaremos un conjunto. El programa pedirá un país en un bucle,
    se guardará el país en el conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir, si decide salir, se mostrará todos
    los países guardados en el conjunto.
        Después deberemos mostrar el conjunto ordenado alfabéticamente para esto recordar como se ordena un conjunto.
        Y por ultimo, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se buscará el país en el conjunto y si está en el conjunto se
    eliminará el país que ingresó el usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará al usuario.
         */

        Scanner leer = new Scanner(System.in);

        //El programa pedirá un país en un bucle, se guardará el país en el conjunto y después se le preguntará al usuario si quiere guardar otro país 
        //o si quiere salir, si decide salir, se mostrará todos los países guardados en el conjunto.
        HashSet<String> paises = new HashSet();

        int aux = 0;

        do {

            System.out.println("Ingrese el país a guardar");
            paises.add(leer.next());
            System.out.println("");

            System.out.println("¿Desea ingresar otro país Presione s (si) o n (no)");
            String resp = leer.next();
            System.out.println("");

            if (resp.equals("s")) {
                aux = 0;
            } else if (resp.equals("n")) {
                aux = 1;
            }

        } while (aux == 0);

        System.out.println("La lista de paises guardados es:");
        for (String pais : paises) {
            System.out.println(pais);
        }

        //Después deberemos mostrar el conjunto ordenado alfabéticamente para esto recordar como se ordena un conjunto.
        System.out.println("");
        System.out.println("La lista de paises guardados ordenada alfabéticamente es:");

        TreeSet<String> paisesOrdenados = new TreeSet();
        for (String pais : paises) {
            paisesOrdenados.add(pais);
        }

        for (String pais : paisesOrdenados) {
            System.out.println(pais);
        }

        //Y por ultimo, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se buscará el país en el conjunto y si está en el conjunto se
        //eliminará el país que ingresó el usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará al usuario.
        System.out.println("");
        System.out.println("Ingrese un país");
        System.out.println("");

        String eliminar = leer.next();

        Iterator<String> it = paisesOrdenados.iterator();

        int aux2 = 0;

        while (it.hasNext()) {

            if (it.next().equals(eliminar)) {

                it.remove();

                aux2++;

            }

        }

        if (aux2 >= 1) {

            for (String pais : paisesOrdenados) {
                System.out.println(pais);
            }

        } else if (aux2 == 0) {
            System.out.println("El país no se encuentra en la lista.");

        }

    }
}
