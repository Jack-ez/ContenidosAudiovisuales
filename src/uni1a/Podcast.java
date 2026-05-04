package uni1a;

public class Podcast extends ContenidoAudiovisual {

    private String anfitrion;

    public Podcast(String titulo, int duracionEnMinutos, String genero, String anfitrion) {
        super(titulo, duracionEnMinutos, genero);
        this.anfitrion = anfitrion;
    }

    public String getAnfitrion() {
        return anfitrion;
    }

    public void setAnfitrion(String anfitrion) {
        this.anfitrion = anfitrion;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del Podcast:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Anfitrión: " + anfitrion);
        System.out.println();
    }
}
