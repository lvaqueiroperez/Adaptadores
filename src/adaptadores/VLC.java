package adaptadores;

/**
 * Clase para recibir ficheros VLC (.AVI) que serán reproducidos según el
 * formato indicado en el adaptador Se implementa MediaPackage para usar el
 * método que incluye (Medio Secundario)
 *
 * EL FICHERO RECIBIDO, EN ESTE CASO, ES DE UN VLC (AVI) EN EL ADAPTADOR HAREMOS
 * QUE EN VEZ DE REPRODUCIRLO COMO VLC LO HAGA EN MP3
 *
 * @author luis-
 */
public class VLC implements MediaPackage {

    @Override
    public void playFile(String filename) {
        System.out.println("Playing VLC File " + filename);
    }

}
