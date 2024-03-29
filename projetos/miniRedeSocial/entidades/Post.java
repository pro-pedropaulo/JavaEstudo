package miniRedeSocial.entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class Post {
    private static SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); {

    }

    private Date momento;
    private String titulo;
    private String conteudo;
    private Integer curtidas;

    List<Comment> comentarios = new ArrayList<>();

    public Post() {
    }

    public Post(Date momento, String titulo, String conteudo, Integer curtidas) {
        this.momento = momento;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.curtidas = curtidas;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Integer getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(Integer curtidas) {
        this.curtidas = curtidas;
    }

    public List<Comment> getComentarios() {
        return comentarios;
    }

    public void addComentario(Comment comentario) {
        comentarios.add(comentario);
    }

    public void removeComentario(Comment comentario) {
        comentarios.remove(comentario);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(titulo + "\n");
        sb.append(curtidas);
        sb.append(" Curtidas - ");
        sb.append(dataFormatada.format(momento) + "\n");
        sb.append(conteudo + "\n");
        sb.append("Comentarios: \n");
        for (Comment c : comentarios) {
            sb.append(c.getText() + " \n");
        }
        return sb.toString();
    }
}