public class Main {
    public static void main(String[] args) {
    TwitterAPI twitterAPI = new TwitterAPI();
    InstagramAPI instagramAPI = new InstagramAPI();
    LinkedInAPI linkedInAPI = new LinkedInAPI();
    TikTokAPI tikTokAPI = new TikTokAPI();

    ConectorMidiaSocial servicoTwitter = new TwitterAdapter(twitterAPI);
    ConectorMidiaSocial servicoInstagram = new InstagramAdapter(instagramAPI);
    ConectorMidiaSocial servicoLinkedIn = new LinkedInAdapter(linkedInAPI);
    ConectorMidiaSocial servicoTikTok = new TiktokAdapter(tikTokAPI);

    Postagem postagemTexto = new Postagem("Olá mundo! Este é meu post unificado.", null);
    Postagem postagemComImagem = new Postagem("Que paisagem incrível!", "http://imagem.com/paisagem.jpg");
    Postagem postagemVideo = new Postagem("Meu novo vídeo de dança!", "http://video.com/dancinha.mp4");

    System.out.println("### INICIANDO PUBLICAÇÕES ###\n");

    servicoTwitter.publicar(postagemTexto);
    servicoInstagram.publicar(postagemComImagem);
    servicoLinkedIn.publicar(postagemTexto);
    servicoTikTok.publicar(postagemVideo);

    System.out.println("\n### PUBLICAÇÕES FINALIZADAS ###");
    }
}