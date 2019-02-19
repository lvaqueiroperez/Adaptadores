package adaptadores;

//Interfaz que incluye un método para reproducir cualquier tipo de fichero
//(SERÁ EL ADAPTADOR QUIEN HAGA QUE SE REPRODUZCAN TODOS DE LA MISMA MANERA)
public interface MediaPackage {
    void playFile(String filename);
}
