import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class ResultadosExamen {

    public static Map getCalificacionesOriginales() {
        Map calificaciones = new HashMap();
        calificaciones.put("Ana", 24);
        calificaciones.put("Daniel", 50);
        calificaciones.put("Alejandro", 79);
        calificaciones.put("Laura", 32);
        calificaciones.put("Kelly", 80);
        calificaciones.put("Ivan", 40);
        calificaciones.put("Maria", 59);
        calificaciones.put("Melanie", 55);
        calificaciones.put("Diego", 95);
        calificaciones.put("Miguel", 63);

        return calificaciones;

    }

    public static Map getCalificacionesRegularizacion() {

        Map calificaciones = new HashMap();
        calificaciones.put("Ana", 97);
        calificaciones.put("Daniel", 89);
        calificaciones.put("Alejandro", 79);
        calificaciones.put("Laura", 82);
        calificaciones.put("Kelly", 76);
        calificaciones.put("Ivan", 98);
        calificaciones.put("Maria", 80);
        calificaciones.put("Melanie", 95);
        calificaciones.put("Diego", 90);
        calificaciones.put("Miguel", 62);

        return calificaciones;
    }

    public static void main(String[] args) {
        System.out.println("Primera Evaluacion Resultados: " + getCalificacionesOriginales());
        System.out.println("Segunda Evaluacion Resultados:" + getCalificacionesRegularizacion());




        int[] calificaciones1 = new int[]{32, 59, 79, 24, 55, 95, 40, 50, 59, 63};
        int[] calificaciones2 = new int[]{97, 89, 79, 82, 76, 98, 80, 95, 90, 62};

         int mayor = calificaciones1 [0];
         for (int x =1; x< calificaciones1.length; x++){
             
             if (calificaciones1[x] > mayor){
                 mayor = calificaciones1[x];
             }
         }
           System.out.println("La calificacion Mayor es: " + mayor);

        if (Arrays.equals(calificaciones1, calificaciones2))
            System.out.println("LAS CALIFICACIONES SON IGUALES");
        else
            System.out.println("LAS CALIFICACIONES NO SON IGUALES");
    }






}













