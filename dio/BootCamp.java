package dio;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class BootCamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = this.dataInicial.plusDays(45);
    private Set<Conteudo> conteudos = new LinkedHashSet<>();
    private Set<Devs> devs = new HashSet<>();
    
    protected static final DateTimeFormatter FORMATADOR_DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy");


    public BootCamp(String nome) {
        this.nome = nome;
        this.descricao = "Descrição do Bootcamp " + nome;
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

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    public Set<Devs> getDevs() {
        return devs;
    }

    public void setDevs(Set<Devs> devs) {
        this.devs = devs;
    }

    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
        result = prime * result + ((dataInicial == null) ? 0 : dataInicial.hashCode());
        result = prime * result + ((dataFinal == null) ? 0 : dataFinal.hashCode());
        result = prime * result + ((conteudos == null) ? 0 : conteudos.hashCode());
        result = prime * result + ((devs == null) ? 0 : devs.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        BootCamp other = (BootCamp) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (descricao == null) {
            if (other.descricao != null)
                return false;
        } else if (!descricao.equals(other.descricao))
            return false;
        if (dataInicial == null) {
            if (other.dataInicial != null)
                return false;
        } else if (!dataInicial.equals(other.dataInicial))
            return false;
        if (dataFinal == null) {
            if (other.dataFinal != null)
                return false;
        } else if (!dataFinal.equals(other.dataFinal))
            return false;
        if (conteudos == null) {
            if (other.conteudos != null)
                return false;
        } else if (!conteudos.equals(other.conteudos))
            return false;
        if (devs == null) {
            if (other.devs != null)
                return false;
        } else if (!devs.equals(other.devs))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "BootCamp [nome =" + nome + ", descricao =" + descricao + ", dataInicial =" + dataInicial.format(FORMATADOR_DATA) + ", dataFinal ="
                + dataFinal.format(FORMATADOR_DATA) + "]";
    }
}
