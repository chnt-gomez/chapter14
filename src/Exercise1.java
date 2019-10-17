public class Exercise1 {


    /**
     * El primo del amigo de la persona que fue tu jefe cuando hiciste el sistema de estacionamiento
     * en galerias, se entero que eres un buenazo para eso de la programacion.
     * Tras enviarte un meme al estilo de "Mijo tu que eres programador, programame la videocasetera para grabar
     * mi novela" te ofrece un empleo nuevo para su sistema de recursos .
     *
     * Utilizando los recursos que ya ha concluido el sobrino "que le sabe a las compus", lleva a cabo el siguiente ejercicio.
     *
     * Se debe de imprimir la lista completa de nombres, pero cada (7) Septimo nombre, se debera de imprimir el nombre de la empresa
     * (OpenMarket!)
     */

    /**
     * Bonus: (Tu tambien Laura)
     * No uses un contador para saber si es el septimo nombre. (Si se tardan mas de 5 minutos ELMO)
     *
     */


    public static void main(String[] args) {

        String[] nombres = NameListService.getAllNames();

        for (int i=0; i<nombres.length; i++){
            if (i%7 == 0){ //Utilizando el MODULO de 7 podemos saber si el indice (i) es multiplo de 7
                System.out.println("OpenMarket!");
            }else{
                System.out.println(nombres[i]);
            }
        }
    }

}
