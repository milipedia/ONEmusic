package modelos;

public class Musica extends Audio {
    protected String album;
    protected String artista;
    protected String genero;

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    @Override
    public double getClassificacao() {
        if(this.getTotalDeReproducoes()>=2000){
            return 10;
        }else{
            return 8;
        }
    }
}
