package adaptadores;
/**
 * 
 * @author lvaqueiroperez
 */
//Clase para recibir ficheros .MP4 que serán reproducidos según el formato
//indicado en el adaptador
//Se implementa MediaPackage para usar el método que incluye
//MEdiaPackage es una Interfaz, el método que incluye aún no tiene función
//PERO YA SABEMOS QUE RECIBE UN STRING CON EL FICHERO (SU NOMBRE EN ESTE CASO)
//EN ESTA CLASE LE DAMOS FUNCIONALIDAD EL MÉTODO, RECIBE EL NOMBRE DEL FICHERO
//Y LO EJECUTA (CON UN SYSTEM... QUE LO INDICA)
//EL FICHERO RECIBIDO, EN ESTE CASO, ES DE UN MP4
//EN EL ADAPTADOR HAREMOS QUE EN VEZ DE REPRODUCIRLO COMO MP4 LO HAGA EN MP3

public class MP4 implements MediaPackage {

    @Override
    public void playFile(String filename) {
        System.out.println("Playing MP4 File " + filename);
    }
    
}
