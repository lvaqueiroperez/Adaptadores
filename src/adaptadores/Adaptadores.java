package adaptadores;
//PASAR A JAVADOC
public class Adaptadores {

    public static void main(String[] args) {
        //creamos un objeto MP3 de tipo MediaPlayer
        //INSTANCIANDO OBJETOS DE UN TIPO
        //DE OTRA CLASE/INTEFAZ PODEMOS ACCEDER A LOS MÉTODOS DE LA INTERFAZ
        //A TRAVÉS DE ESE OBJETO
        MediaPlayer player = new MP3();
        //ejemplo reproduciendo un mp3 (no hace falta usar el adaptador ya que este
        //ya reproduce en mp3
        player.play("file.mp3");
        player = new FormatAdapter(new MP4());
        player.play("file.mp4");
        player = new FormatAdapter(new VLC());
        player.play("file.avi");
    }
//el format adapter se a implementado aquí, en vez de en una clase a parte
//MÉTODO PARA ADAPTAR LOS FORMATOS DE LOS FICHEROS AL FORMATO PREFERIDO
//(MP3 EN ESTE CASO)
    private static class FormatAdapter implements MediaPlayer {

        private MediaPackage media;

        public FormatAdapter(MediaPackage m) {
            media = m;
        }

        @Override
        public void play(String filename) {
            System.out.print("Using Adapter --> ");
            media.playFile(filename);
        }
    }
}
