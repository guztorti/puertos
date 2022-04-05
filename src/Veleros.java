public class Veleros extends Barco {

    private Integer mastiles;

     public Veleros(String matricula, Double eslora, String anio, int mastiles) {
          super(matricula, eslora, anio);
          this.mastiles = mastiles;
     }
     
     @Override
     public double getModulo(){
          
          return super.getModulo()+mastiles;
     }
    
}
