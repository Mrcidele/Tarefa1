public class InstagramAdapter implements ConectorMidiaSocial {
    private InstagramAPI instagramApi;

    public InstagramAdapter(InstagramAPI instagramApi) {
        this.instagramApi = instagramApi;
    }

    @Override
    public void publicar(Postagem postagem) {
        instagramApi.publicarFoto(postagem.getUrlMidia(), postagem.getTexto());
        System.out.println("Publicação enviada para o Instagram.");
    }
}