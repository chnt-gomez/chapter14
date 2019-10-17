public class Exercise2 {

    /**
     * El Exito rotundo de tu implementacion ha causado una gran impresion. Como la empresa tambien vende los datos personales
     * de sus empleados a empresas de telemarketing, se te ha conferido una nueva tarea
     *
     * Tras contar el numero de veces que aparece la letra "a" en el nombre, se puede asegurar si el nombre de la persona
     * es de hombre o de mujer. El jefe quiere imprimir la lista de nombres y una M despues, si el nombre tiene 3 o mas "a".
     */

    /**
     * Bonus: Utilice for each in en lugar de un for regular
     */


    public static void main(String[] args) {

        String[] names = NameListService.getAllNames();

        for (String name : names){

            String arrayName[] = NameListService.asArray(name);
            int count = 0;


            for (String letra : arrayName){
                if (letra.toLowerCase().equals("a"))
                    count ++;
            }

            System.out.print(name);

            if (count >= 3){
                System.out.println(" M");
            }else{
                System.out.println("");
            }


        }

    }
}
