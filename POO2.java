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
    
    //Métodos
    public static void main(String[] args) {
    Computador torre = new Computador();
    torre.color="Negra";
    torre.marca="Dell";
    torre.tamaño="Mediano";
    
    System.out.println("El color de la torre es: "+torre.color);
    System.out.println("La marca de la torre es: "+torre.marca);
    System.out.println("EL tamaño de la torre es: "+torre.tamaño);
    
    
    Computador monitor = new Computador();
    monitor.color="blanco";
    monitor.marca="Asus";
    monitor.tamaño="grande";
    monitor.resolucion=" 2560 x 1080 píxeles";
    monitor.hz =  240;
    
    
    System.out.println("El color de la monitor es: "+monitor.color);
    System.out.println("La marca de la monitor es: "+monitor.marca);
    System.out.println("EL tamaño de la monitor es: "+monitor.tamaño);
    System.out.println("La resolucion de la monitor es: "+monitor.resolucion);
    System.out.println("EL hz de la monitor es: "+monitor.hz);
    
    Computador teclado = new Computador();
    teclado.color="universal";
    teclado.marca="Loditech";
    teclado.tamaño="Pequeño";
    teclado.tipo =  "Mecanico";
    
    
    System.out.println("El color de la teclado es: "+teclado.color);
    System.out.println("La marca de la teclado es: "+teclado.marca);
    System.out.println("EL tamaño de la teclado es: "+teclado.tamaño);
    System.out.println("El tipo de la teclado es: "+teclado.tipo);
    
     Computador raton = new Computador();
    raton.color="Azul";
    raton.marca="razer";
    raton.tamaño="Pequeño";
    raton.dpi =  800;
    raton.botones =  6 ;
    
    
    System.out.println("El color de la raton es: "+raton.color);
    System.out.println("La marca de la raton es: "+raton.marca);
    System.out.println("EL tamaño de la raton es: "+raton.tamaño);
    System.out.println("El dpi del raton es: "+raton.dpi);
    System.out.println("Los botones del raton es: "+raton.botones);
    
    Computador camara = new Computador();
    camara.color="Gris";
    camara.marca="Logitech Brio, Ultra Hd Pro Webcam 4k ";
    camara.tamaño="Mediana";
    camara.resolucion=" 4096px x 2160px.";
    camara.pixeles =  13 ;
    
    
    System.out.println("El color de la camara es: "+camara.color);
    System.out.println("La marca de la camara es: "+camara.marca);
    System.out.println("EL tamaño de la camara es: "+camara.tamaño);
    System.out.println("La resolucion de la camara es: "+camara.resolucion);
    System.out.println("Los pixeles de la camara es: "+camara.pixeles);
    
    
    
    }    
}
