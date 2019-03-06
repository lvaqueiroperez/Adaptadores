package adaptadores;

/**
 * Clase de ficheros VLC que utiliza el método de la interfaz problemática para
 * reproducirlos (implementa la interfaz MediaPackage)
 *
 * @author luis-
 */
public class VLC implements MediaPackage {

    @Override
    public void playFile(String filename) {
        System.out.println("Playing VLC File " + filename);
    }

    /*
    EL FICHERO RECIBIDO, EN ESTE CASO, ES DE UN VLC (AVI) 
    EN EL ADAPTADOR HAREMOS
    QUE EN VEZ DE REPRODUCIRLO COMO VLC LO HAGA EN MP3
     */
}
