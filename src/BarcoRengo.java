public class BarcoRengo extends Barco {

    private Integer camarotes;

    private Integer potenciaCV;

     public BarcoRengo(Integer camarotes, Integer potenciaCV, String matricula, Double eslora, String anio) {
          super(matricula, eslora, anio);
          this.camarotes = camarotes;
          this.potenciaCV = potenciaCV;
     }
    
    @Override
    public double getModulo(){
         return super.getModulo()+potenciaCV+camarotes;
    }
}
