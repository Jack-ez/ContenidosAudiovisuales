package poo;
import uni1a.*;

public class PruebaAudioVisual {
    public static void main(String[] args) {
        System.out.println("Hello from Eclipse!");

        // Crear investigador
        Investigador inv = new Investigador("Carl Sagan", "Astronomía");
        
     // Crear Plataforma
        Plataforma yt = new Plataforma("YouTube", "Streaming");

        // Crear instancias de las subclases
        
        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[5];

        contenidos[0] = new Pelicula("Avatar", 125, "Accion", "20th Century Studios");
        Pelicula peli = (Pelicula) contenidos[0];
        peli.agregarActor(new Actor("Sam Worthington", 45));
        peli.agregarActor(new Actor("Zoe Saldana", 44));
        
        contenidos[1] = new SerieDeTV("Game of Thrones", 60, "Fantasy", 8);
        SerieDeTV serie = (SerieDeTV) contenidos[1];
        serie.agregarTemporada(new Temporada(1, 10));
        serie.agregarTemporada(new Temporada(2, 10));
        
        contenidos[2] = new Documental("Cosmos", 45, "Science", "Astronomía", inv);

        contenidos[3] = new Podcast("Aprendiendo Java", 30, "Educativo", "Jack Zuquilanda");
        
        contenidos[4] = new TransmisionEnVivo("Evento en vivo Java",120,"Educativo",yt,true);
        
        // Mostrar los detalles
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
        }
        
        
    }
}