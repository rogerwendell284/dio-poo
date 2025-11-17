package dio;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class BootCamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial;
    private final LocalDate dataFinal;
     private Mentoria mentoria;
    private Devs devs;
    private Curso curso;
    private List<Mentoria> listaMentoria;
    private List<Curso> listaCurso;
    protected static final DateTimeFormatter FORMATADOR_DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy");


    public BootCamp(String nome) {
        this.nome = nome;
        this.descricao = "Descrição do Bootcamp " + nome;
        this.dataInicial = LocalDate.now();
        this.dataFinal = this.dataInicial.plusDays(45);
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public String getDescricao() {
        return descricao;
    }

    public Mentoria getMentoria() {
        return mentoria;
    }

    public Curso getCurso() {
        return curso;
    }

    public Devs getDevs() {
        return devs;
    }

    public List<Mentoria> getListaMentoria() {
        return listaMentoria;
    }
    public List<Curso> getListaCurso() {
        return listaCurso;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "BootCamp [nome =" + nome + ", descricao =" + descricao + ", dataInicial =" + dataInicial.format(FORMATADOR_DATA) + ", dataFinal ="
                + dataFinal.format(FORMATADOR_DATA) + "]";
    }
}
