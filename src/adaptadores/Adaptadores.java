package adaptadores;

public class Adaptadores {

    /**
     * Main class donde se reproducirán todos archivos, adaptándolos o no
     *
     * @param args
     */
    public static void main(String[] args) {
        //SE CREA OBJETO DE TIPO MediaPlayer SIEMPRE, ES NUESTRO MEDIO PRINCIPAL
        //OBJETO MP3 PORQUE NO NECESITA SER ADAPTADO
        MediaPlayer player = new MP3();
        player.play("file.mp3");
        //AL SER ELEMENTOS DISTINTOS DE MP3, HAY QUE ADAPTARLOS PERO SIEMPRE
        //DEL TIPO DE NUESTRO MEDIO PRINCIPAL (MediaPlayer)
        player = new FormatAdapter(new MP4());
        player.play("file.mp4 to .mp3");
        player = new FormatAdapter(new VLC());
        player.play("file.avi to .mp3");
    }

    /**
     * el ADAPTADOR se a implementado aquí con "private static class" también se
     * puede poner en una clase a parte "public class", MÉTODO PARA ADAPTAR LOS
     * FORMATOS DE LOS FICHEROS AL FORMATO PREFERIDO (MP3 EN ESTE CASO)
     */
    private static class FormatAdapter implements MediaPlayer {

        //variable ATRIBUTO del tipo de la Interfaz MediaPackage
        //(la que implementan las clases que tienen que ser adaptadas)
        private MediaPackage media;

        /**
         * CONSTRUCTOR que recibe como parámetros atributos de la Clase
         *
         * @param media
         */
        public FormatAdapter(MediaPackage media) {
            this.media = media;
        }

        /**
         * Método "play" implementado de la Interfaz "MediaPlayer" que
         * reproducirá cualquier formato en .mp3 INDICANDO que se está usando el
         * adapter
         *
         * @param filename
         */
        @Override
        public void play(String filename) {
            System.out.print("Using Adapter --> ");
            media.playFile(filename);
        }
    }

}
