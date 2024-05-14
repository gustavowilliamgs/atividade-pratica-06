import java.sql.Date;

// Classe para representar os livros
public class Livro {
    private int idLivro;
    private String titulo;
    private String autor;
    private String editora;
    private Date anoLancamento;
    
    public Livro(int idLivro, String titulo, String autor, String editora, Date anoLancamento) {
        this.idLivro = idLivro;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.anoLancamento = anoLancamento;
    }

    public int getIdLivro() {
        return idLivro;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditora() {
        return editora;
    }

    public Date getAnoLancamento() {
        return anoLancamento;
    }
}
