import java.util.Scanner;
public class Actividad_2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double[] vCalif = new double[5];

        CalificacionesParticipantes cal = new CalificacionesParticipantes();
        System.out.print("Ingrese el nombre del participante: ");
        cal.setNombreParticipante(leer.nextLine());
        System.out.println("Ingrese las calificaciones: ");
        for(int y = 0; y < 5; y++){
            System.out.print("Calificacion " + (y+1) + ": ");
            vCalif[y] = leer.nextInt();
        }
        cal.setCalificaciones(vCalif);
        cal.ImprimeInfo(cal.getNombreParticipante(),cal.getCalificaciones());
    }
}
