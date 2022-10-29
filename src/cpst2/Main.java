package cpst2;

public class Main {

    public static void main(String[] args) {
        
        composite();

    }
    
    public static void composite(){
        System.out.println("Composite");
        
        ArchivoComponent archivo1 = new ArchivoPDF("DOCumento.pdf", 100);
        ArchivoComponent archivo2 = new ArchivoXLS("DOCumento.xls", 200);
        ArchivoComponent archivo3 = new ArchivoDOC("DOCumento.doc", 300);
        Directorio carpeta1 = new Directorio("Carpeta 1");
        Directorio carpeta2 = new Directorio("Carpeta 2");
        Directorio carpeta3 = new Directorio("Carpeta 3");
                
        carpeta1.add(archivo1);
        carpeta2.add(carpeta1);
        carpeta2.add(archivo2);
        carpeta3.add(carpeta2);
        carpeta3.add(archivo3);

        System.out.println(carpeta3.getPeso());
         
    }   
    
}
