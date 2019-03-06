package adaptadores;

/**
 * Clase de ficheros MP4 que utiliza el método de la interfaz problemática para
 * reproducirlos (implementa la interfaz MediaPackage)
 *
 * @author luis-
 */
public class MP4 implements MediaPackage {

    @Override
    public void playFile(String filename) {
        System.out.println("Playing MP4 File " + filename);
    }

    /*
    EL FICHERO RECIBIDO, EN ESTE CASO, ES DE UN MP4/EN EL ADAPTADOR HAREMOS QUE
    EN VEZ DE REPRODUCIRLO COMO MP4 LO HAGA EN MP3
     */
}
