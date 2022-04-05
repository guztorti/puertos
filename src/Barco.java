
import java.util.Date;

public class Barco {

    protected String matricula;

    protected Double eslora;

    protected String anio;
    
    protected Double modulo;

     public Barco(String matricula, Double eslora, String anio) {
          this.matricula = matricula;
          this.eslora = eslora;
          this.anio = anio;
     }

     public String getMatricula() {
          return matricula;
     }

     public void setMatricula(String matricula) {
          this.matricula = matricula;
     }

     public Double getEslora() {
          return eslora;
     }

     public void setEslora(Double eslora) {
          this.eslora = eslora;
     }

     public String getAnio() {
          return anio;
     }

     public void setAnio(String anio) {
          this.anio = anio;
     }

    public double getModulo(){
         return eslora*10;
    }
    
}
