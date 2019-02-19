package adaptadores;
/**
 * 
 * @author lvaqueiroperez
 */
//Interfaz con el reproductor que tendrá nuestro adaptador
//ES EL REPRODUCTOR DEL ADAPTADOR, EL QUE, EN ESTE CASO, REPRODUCE TODO EN MP3
public interface MediaPlayer {
    
    void play(String filename);
    
}
