package adaptadores;

/**
 * Clase para recibir ficheros .MP4 que serán reproducidos según el formato
 * indicado en el adaptador Se implementa MediaPackage para usar el método que
 * incluye (Medio Secundario)
 *
 * EL FICHERO RECIBIDO, EN ESTE CASO, ES DE UN MP4/EN EL ADAPTADOR HAREMOS QUE
 * EN VEZ DE REPRODUCIRLO COMO MP4 LO HAGA EN MP3
 *
 * @author luis-
 */
public class MP4 implements MediaPackage {

    @Override
    public void playFile(String filename) {
        System.out.println("Playing MP4 File " + filename);
    }

}
