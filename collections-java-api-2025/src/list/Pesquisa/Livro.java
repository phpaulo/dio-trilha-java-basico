package list.Pesquisa;

public class Livro {

    //atributos
    private String titulo;
    private String autor;
    private int anopPublicacao;

    public Livro(String titulo, String autor, int anopPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anopPublicacao = anopPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnopPublicacao() {
        return anopPublicacao;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anopPublicacao=" + anopPublicacao +
                '}';
    }
}
