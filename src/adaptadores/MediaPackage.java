package adaptadores;

/**
 * INTERFAZ QUE IMPLEMENTAN LAS CLASES O ELEMENTOS QUE TIENEN QUE SER ADAPTADOS
 * Interfaz que incluye un método para reproducir los ficheros a adaptar (SERÁ
 * EL ADAPTADOR QUIEN HAGA QUE SE REPRODUZCAN TODOS DE LA MISMA MANERA)
 *
 * @author luis-
 */
public interface MediaPackage {

    void playFile(String filename);
}
