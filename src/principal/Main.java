import modelos.MinhasPreferidas;
import modelos.Musica;
import modelos.Podcast;

void main() {
    Musica musica = new Musica();
    musica.setTitulo("505");
    musica.setArtista("Arctic Monkeys");

    for (int i = 0; i < 5000; i++) {
        musica.reproduzir();
    }
    for (int i = 0; i < 50; i++) {
        musica.curtir();
    }

    Podcast podcast = new Podcast();
    podcast.setTitulo("Bolha dev");
    podcast.setApresentador("Marcus Mendes");

    for (int i = 0; i < 5000; i++) {
        podcast.reproduzir();
    }
    for (int i = 0; i < 1000; i++) {
        podcast.curtir();
    }

    MinhasPreferidas preferidas = new MinhasPreferidas();
    preferidas.inclui(musica);
    preferidas.inclui(podcast);
}