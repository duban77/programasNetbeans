package ClasesyObjetos;
public class Coche {
    //Atributos
    String color;
    String marca;
    String combustible;
    int año;
    int puertas;
    int km;
    int potencia;
    //Métodos
    public static void main(String[] args) {
        Coche coche1 = new Coche();
        coche1.color="Blanco";
        coche1.marca="Audi";
        coche1.puertas=4;
        coche1.km=0;   
        
        System.out.println("El color del coche1 es: "+coche1.color);
        System.out.println("La marca del coche1 es: "+coche1.marca);
        System.out.println("El numero de puertas del coche1 es: "+coche1.puertas);
        System.out.println("El kilometraje del coche1 es: "+coche1.km);
        
        Coche coche2 = new Coche();
        coche2.color="Azul";
        coche2.marca="Ferrari";
        coche2.año=2023;
        coche2.puertas=2;
        coche2.km=100;
        
        System.out.println("El color del coche2 es: "+coche2.color);
        System.out.println("La marca del coche2 es: "+coche2.marca);
        System.out.println("El año del coche2 es: "+coche2.año);
        System.out.println("El numero de puertas del coche2 es: "+coche2.puertas);
        System.out.println("El kilometraje del coche2 es: "+coche2.km);
        
        Coche coche3 = new Coche();
        coche3.color="Negro";
        coche3.marca="Toyota";
        coche3.combustible="Extra";
        coche3.año=2024;
        coche3.puertas=4;
        coche3.km=250;
        
        System.out.println("El color del coche3 es: "+coche3.color);
        System.out.println("La marca del coche3 es: "+coche3.marca);
        System.out.println("El combustible del coche3 es: "+coche3.combustible);
        System.out.println("El año del coche3 es: "+coche3.año);
        System.out.println("El numero de puertas del coche3 es: "+coche3.puertas);
        System.out.println("El kilometraje del coche3 es: "+coche3.km);
        
        Coche coche4 = new Coche();
        coche4.color="Blanco";
        coche4.marca="Subaru";
        coche4.combustible="Corriente";
        coche4.año=2022;
        coche4.puertas=4;
        coche4.km=0;
        coche4.potencia=4500;
        
        System.out.println("El color del coche4 es: "+coche4.color);
        System.out.println("La marca del coche4 es: "+coche4.marca);
        System.out.println("El combustible del coche4 es: "+coche4.combustible);
        System.out.println("El año del coche4 es: "+coche4.año);
        System.out.println("El numero de puertas del coche4 es: "+coche4.puertas);
        System.out.println("El kilometraje del coche4 es: "+coche4.km);
        System.out.println("La potencia del coche4 es: "+coche4.potencia);
    }
}
