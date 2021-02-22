public class CalificacionesParticipantes {
    //Propiedades privadas
    private String  nombreParticipante;
    private double[] calificaciones;

    //Constructor
    public CalificacionesParticipantes(){
        nombreParticipante = "";
        calificaciones = new double [5];
    }

    //Propiedades publicas
    public void setNombreParticipante (String NombreParticipante) {
        nombreParticipante = NombreParticipante;
    }
    public String getNombreParticipante () { return nombreParticipante; }

    public void setCalificaciones (double[] Calificaciones) {
        calificaciones = Calificaciones;
    }
    public double[] getCalificaciones () { return calificaciones; }

    //Metodos

    //Calcula Promedio, Recibe arreglo de calificaciones
    public double calPromedio(double[] pCalificaciones){
        double vPromedio = 0;
        for(int y = 0; y < pCalificaciones.length; y++){
            vPromedio += pCalificaciones[y];
        }
        vPromedio = (vPromedio / pCalificaciones.length);
        return vPromedio;
    }

    //Determina calificacion, Recibe como parametro el promedio
    public String obtCalificacion(double pPromedio){
        String vCalificacion = "";

        //Se deja 51 para que se consideren los decimales
        if (pPromedio<51) {
            vCalificacion = "F";
        }
        //Se deja 61 para que se consideren los decimales
        else if (pPromedio >= 51 && pPromedio < 61) {
            vCalificacion = "E";
        }
        //Se deja 71 para que se consideren los decimales
        else if (pPromedio >= 61 && pPromedio< 71) {
            vCalificacion = "D";
        }
        //Se deja 81 para que se consideren los decimales
        else if (pPromedio >= 71 && pPromedio < 81) {
            vCalificacion = "C";
        }
        //Se deja 91 para que se consideren los decimales
        else if(pPromedio >= 81 && pPromedio < 91) {
            vCalificacion = "B";
        }
        else if (pPromedio >= 91 && pPromedio<= 100) {
            vCalificacion = "A";
        }
        return vCalificacion;
    }

    //Recibe como parametro Nombre y Arreglo de calificaciones,dentro se usaran los metodos para obtener Promedio y Calificacion
    public void ImprimeInfo (String pNombre, double[] pCalificaciones){
        double vPromedio = 0;
        System.out.println("Nombre del estudiante: " + pNombre);
        for(int y = 0; y< pCalificaciones.length; y++ ){
            System.out.println("Calificación " + (y+1) + ": " + pCalificaciones[y]);
        }
        vPromedio = calPromedio(pCalificaciones);
        System.out.println("Promedio: " + vPromedio);
        System.out.println("Calificación: " + obtCalificacion(vPromedio));
    }


}
