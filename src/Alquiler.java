
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Alquiler {
     
    private Cliente cliente;

    private ArrayList<Barco> barcos;

    private ArrayList<Integer> posicionAmarre;

    private Double precioFinal;
    
    private Date  fechaAlquiler;
    
    private Date fechaDevolucion;
    
    Scanner scn = new Scanner(System.in).useDelimiter("\n");

     public Alquiler(Cliente cliente, ArrayList<Barco> barcos, ArrayList<Integer> posicionAmarre, Date fechaAlquiler, Date fechaDevolucion) {
          this.cliente = cliente;
          this.barcos = barcos;
          this.posicionAmarre = posicionAmarre;
          this.fechaAlquiler = fechaAlquiler;
          this.fechaDevolucion = fechaDevolucion;
          
     }
     public double precioFinal(){
          double salida = 0;
          for (Barco barco : barcos) {
               salida += barco.getModulo()*(fechaDevolucion.getTime() - fechaAlquiler.getTime());
          }
          
          return salida;
     }
     public double precioSegunBarco(){
          String opcion = "";
          double precioAlquiler = 0;
          do {
          System.out.println("""
                             Elija el tipo de barco
                             "barco"
                             "velero"
                             "barco con motor"
                             "yate de lujo"
                             """);
          opcion = scn.next();
               switch (opcion){
                    case "barco":
                         System.out.println("cuantos metros de eslora tiene su barco?");
                         precioAlquiler = scn.nextDouble();
                         precioAlquiler *= 10;
                         break;
                    case "velero":
                         System.out.println("cuantos metros de eslora tiene su barco?");
                         precioAlquiler = scn.nextDouble();
                         precioAlquiler *= 10;
                         System.out.println("Cuantos mástiles tiene?");
                         precioAlquiler += scn.nextDouble();
                         break;
                    case "barco con motor":
                         System.out.println("cuantos metros de eslora tiene su barco?");
                         precioAlquiler = scn.nextDouble();
                         precioAlquiler *= 10;
                         System.out.println("Qué potencia en CV posee?");
                         precioAlquiler += scn.nextDouble();
                         break;
                    case "yate de lujo":
                         System.out.println("cuantos metros de eslora tiene su barco?");
                         precioAlquiler = scn.nextDouble();
                         precioAlquiler *= 10;
                         System.out.println("Qué potencia en CV posee?");
                         precioAlquiler += scn.nextDouble();
                         System.out.println("... y cuantos camarotes?");
                         precioAlquiler += scn.nextDouble();
                         break;
                    default:
                         System.out.println("no se conoce la opción");
               }
               
          } while ((opcion.equalsIgnoreCase("barco")
                    &&opcion.equalsIgnoreCase("velero")
                    &&opcion.equalsIgnoreCase("barco con motor")
                    &&opcion.equalsIgnoreCase("yate de lujo")));
          return precioAlquiler;
     }
    
}
