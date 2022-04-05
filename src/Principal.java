
import java.util.ArrayList;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author gustavotorti
 */
public class Principal {

     /**
      * @param args the command line arguments
      */
     public static void main(String args[]) {
          
          Cliente cli1 = new Cliente("Damian Dries", 32174563);
          Alquiler transaccion1 = new Alquiler(cli1, new ArrayList(), new ArrayList(),new Date(), new Date(Date.UTC(2022, 1, 10, 0, 0, 0)));
          System.out.println(String.format("el precio por día de alquiler para su embarcación es de: $%s",transaccion1.precioSegunBarco()));
     }
}
