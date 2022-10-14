package Recursividad;

public class Main {

    public static void main(String[] args) {
        
        Ejercicios e=new Ejercicios();
        
        System.out.println(e.calcCos(10, 7));
        System.out.println(e.calcCosRecursivo(10, 7, 0));
        System.out.println(e.factorial(8));
        System.out.println(e.factorialR(8));
    }
    
}
