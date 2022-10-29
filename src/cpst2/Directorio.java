package cpst2;

import cpst.*;
import java.util.ArrayList;
import java.util.List;

public class Directorio extends ArchivoComponent {

    public Directorio(String nombre) {
        this.nombre=nombre;
    }
    
    private List<ArchivoComponent> archivos = new ArrayList<ArchivoComponent>();

    @Override
    public void generar() {
        for (ArchivoComponent hijo : this.archivos) {
            hijo.generar();
        }
    }
    int retorno = 0;

    @Override
    public int getPeso() {
        //int retorno=0;
        for (ArchivoComponent arch : this.archivos) {
            retorno += arch.getPeso();
        }
        return retorno;
    }

    public void add(ArchivoComponent archivo) {
        this.archivos.add(archivo);
    }

    public void delete(ArchivoComponent archivo) {
        this.archivos.remove(archivo);
    }

}
