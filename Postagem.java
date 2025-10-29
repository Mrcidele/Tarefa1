public class Postagem {
    private String texto;
    private String urlMidia; // Nome genérico para imagem ou vídeo

    public Postagem(String texto, String urlMidia) {
        this.texto = texto;
        this.urlMidia = urlMidia;
    }

    public String getTexto() {
        return texto;
    }

    public String getUrlMidia() {
        return urlMidia;
    }
}