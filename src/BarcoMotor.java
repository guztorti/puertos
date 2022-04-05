public class BarcoMotor extends Barco {

    private Integer potenciaCV;

     public BarcoMotor(Integer potenciaCV, String matricula, Double eslora, String anio) {
          super(matricula, eslora, anio);
          this.potenciaCV = potenciaCV;
     }
    
    @Override
    public double getModulo(){
         return super.getModulo()+potenciaCV;
    }
}
