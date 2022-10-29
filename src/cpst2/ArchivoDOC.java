package cpst2;

import cpst.*;

public class ArchivoDOC extends ArchivoComponent{

    public ArchivoDOC(String nombre, int peso) {
        this.nombre=nombre;
        this.peso=peso;
    }
    
    
    
    @Override
    public void generar() {
        System.out.println("Crear archivo"+nombre);
    }

    @Override
    public int getPeso() {
        return peso;
    }
    
}
