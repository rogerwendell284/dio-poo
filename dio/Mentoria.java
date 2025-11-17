package dio;
import java.time.LocalDate;
public class Mentoria extends Conteudo{

    private LocalDate data = LocalDate.now();

    public Mentoria() {
        
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

   @Override
   public double calcularXp() {
       return XP_PADRAO + 20d;
   }

   @Override
    public String toString() {
        return "Mentoria [nome =" + getTitulo() + ", descricao =" +getDescricao() + ", data =" + data.format(BootCamp.FORMATADOR_DATA) + "]";
    }
}
