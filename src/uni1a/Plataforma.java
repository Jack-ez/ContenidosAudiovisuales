package uni1a;

public class Plataforma {
    private String nombre;
    private String tipo; 

    public Plataforma(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void mostrarPlataforma() {
        System.out.println("Plataforma: " + nombre + " | Tipo: " + tipo);
    }
}
