public class TwitterAdapter implements ConectorMidiaSocial {
    private TwitterAPI twitterApi;

    public TwitterAdapter(TwitterAPI twitterApi) {
        this.twitterApi = twitterApi;
    }

    @Override
    public void publicar(Postagem postagem) {
        twitterApi.tweetar(postagem.getTexto());
        System.out.println("Publicação enviada para o Twitter.");
    }
}