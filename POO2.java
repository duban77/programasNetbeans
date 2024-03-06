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
    
    
    }    
}
