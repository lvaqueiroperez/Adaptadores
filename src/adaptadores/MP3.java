package adaptadores;

/**
 * Clase con de un elemento que NO necesita ser adaptado, Implementa el método
 * de la Interfaz Principal para reproducirlo (implementa MediaPlayer)
 *
 * @author luis-
 */
public class MP3 implements MediaPlayer {

    @Override
    public void play(String filename) {
        System.out.println("Playing MP3 File " + filename);
    }

}
