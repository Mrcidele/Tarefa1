public class TiktokAdapter implements ConectorMidiaSocial {
    private TikTokAPI tikTokApi;

    public TiktokAdapter(TikTokAPI tikTokApi) {
        this.tikTokApi = tikTokApi;
    }

    @Override
    public void publicar(Postagem postagem) {
        tikTokApi.postarVideo(postagem.getUrlMidia());
        System.out.println("Publicação enviada para o TikTok.");
    }
}