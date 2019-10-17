import java.util.Arrays;

public class Exercise3 {

    /**
     * El exito indiscutible de tu algoritmo ha creado un monstruo! Tu jefe tiene a Jeff Bezos y
     * Sundar Pichai de choferes y el poder de su negocio de venta de informacion puede derrocar
     * gobiernos y la investigacion que lo vinculaba con la reeleccion ilegal de dictadores ha desaparecido.
     *
     * Solo tu lo puedes detener. Implementa un algoritmo que, tras encontrar el numero de "a"s, reemplaza las
     * primeras letras del nombre con "X". Siendo el numero de X's el mismo que el numero de "a".
     *
     * Si el numero de "a" encontrado no es mayor a 3. el nombre debera quedar al revez para prevenir futuras ventas.
     */

    /**
     * Bonus. Define el tiempo de ejecucion de tu algoritmo y demuestra el numero de iteraciones y busca una solucion mas optima
     */


    public static void main(String[] args) {

        String[] names = NameListService.getAllNames();

        int totalIterations = 0;

        for (String name : names){

            totalIterations++;

            String arrayName[] = NameListService.asArray(name);
            int count = 0;
            for (String character : arrayName){
                totalIterations++;
                if (character.toLowerCase().equals("a"))
                    count ++;
                }
            if (count >= 3){
                name = censor(arrayName, count, totalIterations);
            }else {
                name = reverseName(arrayName, totalIterations);
            }
            System.out.println(name);
            System.out.println("Completed after "+totalIterations+" iterations");
        }

    }

    public static String reverseName(String[] args, int totalIterations){
        for (int i=0; i< args.length; i++){
            if (i >= args.length-1-i)
                break;
            totalIterations++;
            String temp = args[i];
            args[i] = args[args.length-1-i];
            args[args.length-1-i] = temp;
        }

        return Arrays.toString(args);
    }

    public static String censor(String[] args, int count, int totalIterations){
        for (int i=0; i<= count && i< args.length; i++){
            totalIterations++;
            args[i] = "X";
        }
        return Arrays.toString(args);
    }

}
