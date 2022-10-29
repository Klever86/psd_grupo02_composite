package cpst2;

import cpst.*;

public class ArchivoXLS extends ArchivoComponent{

    public ArchivoXLS(String nombre, int peso) {
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
