package uni1a;

public class TransmisionEnVivo extends ContenidoAudiovisual {

    private Plataforma plataforma;
    private boolean enVivo;

    public TransmisionEnVivo(String titulo, int duracionEnMinutos, String genero, Plataforma plataforma, boolean enVivo) {
        super(titulo, duracionEnMinutos, genero);
        this.plataforma = plataforma;
        this.enVivo = enVivo;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la Transmision:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());

        System.out.println("Estado: " + (enVivo ? "EN VIVO" : "FINALIZADO"));

        plataforma.mostrarPlataforma();

        System.out.println();
    }
}
