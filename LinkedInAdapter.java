public class LinkedInAdapter implements ConectorMidiaSocial {
    private LinkedInAPI linkedInApi;

    public LinkedInAdapter(LinkedInAPI linkedInApi) {
        this.linkedInApi = linkedInApi;
    }

    @Override
    public void publicar(Postagem postagem) {
        String titulo = "Postagem Profissional";
        String corpo = postagem.getTexto();
        
        linkedInApi.submeterPost(titulo, corpo);
        System.out.println("Publicação enviada para o LinkedIn.");
    }
}