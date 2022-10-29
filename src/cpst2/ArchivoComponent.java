package cpst2;

import cpst.*;

public abstract class ArchivoComponent {
    
    protected String nombre;
    protected int peso;
    
    public abstract void generar();
    public abstract int getPeso();
    
}
