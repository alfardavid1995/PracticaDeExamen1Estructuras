package Recursividad;

public class Ejercicios {
    
    public double calcCos(int x, int n){
        double result=0;
        for(int i=0; i<n; i++){
            result+=(Math.pow(-1,n)/factorial(2*n))*Math.pow(x,2*n);
        }
        return result;
    }
    
    public double calcCosRecursivo(int n, int x, int i, double result){
        if(i<n){
            result=result+(Math.pow(-1,n)/factorial(2*n))*Math.pow(x,2*n);
            result=calcCosRecursivo(n, x, i+1, result);
        }
        return result;
    }
    
    public double factorial(int num){
        double result=1.0;
        for(int i = 1; i<=num; i++){
            result=result*i;
        }
        return result;
    }
    
    public double factorialRecursivo(int num, int i, double result){
        if(i<1 || result<1){
            i=1;
            result=1;
            System.out.println("Iniciando en 1");
            result=factorialRecursivo(num, i, result);
        }
        if(i<=num){
            result = result * i;
            result = factorialRecursivo(num, i+1, result);
        }
        return result;
    }
}
