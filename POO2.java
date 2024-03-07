package ClasesyObjetos;
public class Computador {
    //Atributos de la torre
    String marca;
    String color;
    String tamaño;
    //Atributos del monitor
    String resolucion;
    int hz;
    //Atributos del teclado
    String tipo;
    //Atributos del ratón
    int dpi;
    int botones;
    //Atributos de la cámara
    int pixeles;
    //Atributos de la torre2
    //Métodos
    public static void main(String[] args) {
    Computador torre = new Computador();
    torre.color="Negra";
    torre.marca="Dell";
    torre.tamaño="Mediano";
    
    System.out.println("El color de la torre es: "+torre.color);
    System.out.println("La marca de la torre es: "+torre.marca);
    System.out.println("EL tamaño de la torre es: "+torre.tamaño);
    
    
    Computador montor = new Computador();
    torre.color="blanco";
    torre.marca="Asus";
    torre.tamaño="grande";
    torre.resolucion=" 2560 x 1080 píxeles";
    torre.hz =  240;
    
    
    System.out.println("El color de la monitor es: "+torre.color);
    System.out.println("La marca de la monitor es: "+torre.marca);
    System.out.println("EL tamaño de la monitor es: "+torre.tamaño);
    System.out.println("La resolucion de la monitor es: "+torre.resolucion);
    System.out.println("EL hz de la monitor es: "+torre.hz);
    
    Computador teclado = new Computador();
    torre.color="universal";
    torre.marca="Loditech";
    torre.tamaño="Pequeño";
    torre.tipo =  "Mecanico";
    
    
    System.out.println("El color de la teclado es: "+torre.color);
    System.out.println("La marca de la teclado es: "+torre.marca);
    System.out.println("EL tamaño de la teclado es: "+torre.tamaño);
    System.out.println("El tipo de la teclado es: "+torre.tipo);
    
     Computador raton = new Computador();
    torre.color="Azul";
    torre.marca="Loditech";
    torre.tamaño="Pequeño";
    torre.dpi =  800;
    torre.botones =  6 ;
    
    
    System.out.println("El color de la raton es: "+torre.color);
    System.out.println("La marca de la raton es: "+torre.marca);
    System.out.println("EL tamaño de la raton es: "+torre.tamaño);
    System.out.println("El dpi del raton es: "+torre.dpi);
    System.out.println("Los botones del raton es: "+torre.botones);
    
    
    
    
    }    
}
