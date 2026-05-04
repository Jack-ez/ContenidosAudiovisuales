/**
 * Class SerieDeTV
 */
package uni1a;

import java.util.ArrayList;
// Subclase SerieDeTV que extiende de ContenidoAudiovisual
public class SerieDeTV extends ContenidoAudiovisual {
	private int numeroTemporadas;
	
	private ArrayList<Temporada> temporadas = new ArrayList<>();

	public SerieDeTV(String titulo, int duracionEnMinutos, String genero, int numeroTemporadas) {
	    super(titulo, duracionEnMinutos, genero);
	    this.numeroTemporadas = numeroTemporadas;
	}

	public int getNumeroTemporadas() {
	    return numeroTemporadas;
	}

	public void setNumeroTemporadas(int numeroTemporadas) {
	    this.numeroTemporadas = numeroTemporadas;
	}
    
    public void agregarTemporada(Temporada temporada) {
        temporadas.add(temporada);
    }
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la Serie de TV:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        
        System.out.println("Temporadas:");
        for (Temporada t : temporadas) {
            t.mostrarTemporada();
        }
        
        System.out.println();
    }
}