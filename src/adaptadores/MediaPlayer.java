package adaptadores;

/**
 * Interfaz principal con el reproductor que usará nuestro adaptador
 *
 * @author luis-
 */
public interface MediaPlayer {

    void play(String filename);

    /*
    
     ES EL REPRODUCTOR DEL
     ADAPTADOR EL QUE, EN ESTE CASO, REPRODUCE TODO EN MP3 
     TAMBIÉN LO USAN LAS
     CLASES O ELEMENTOS QUE YA NO NECESITEN SER ADAPTADOS, ES EL MEDIO PRINCIPAL,
     EL REPRODUCTOR PRINCIPAL
     */
}
