package modelos;

public class Audio {
    private String titulo;
    private int totalDeReproducoes;
    private int curtidas;
    private int classificacao;
    private int duracao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public double getClassificacao() {
        return classificacao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void reproduzir(){
        this.totalDeReproducoes++;
    }

    public void curtir(){
        this.curtidas++;
    }

    public void exibeFichaTecnica(){
        System.out.println("Título: " + getTitulo());
        System.out.println("Duração em minutos: " + getDuracao());
    }

}
