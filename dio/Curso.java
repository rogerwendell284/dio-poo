package dio;

public class Curso extends Conteudo{

    private int cargaHoraria;

    public Curso() {
    
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    @Override
    public double calcularXp() {
        return cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso [titulo =" + getTitulo() + ", descricao =" + getDescricao() + ", cargaHoraria =" + cargaHoraria + "]";
    }


}
