
package Pilas;


public class Archivo {
    private boolean clasificado;
    private int cantidadPaginas;
    private int numeroArchivo;
    private static int contadorNumeroArchivo = 1;

    public Archivo(boolean clasificado, int cantidadPaginas) {
        this.clasificado = clasificado;
        this.cantidadPaginas = cantidadPaginas;
        this.numeroArchivo = contadorNumeroArchivo;
        contadorNumeroArchivo++;
    }

    public boolean isClasificado() {
        return clasificado;
    }

    public void setClasificado(boolean clasificado) {
        this.clasificado = clasificado;
    }

    public int getCantidadPaginas() {
        return cantidadPaginas;
    }

    public void setCantidadPaginas(int cantidadPaginas) {
        this.cantidadPaginas = cantidadPaginas;
    }

    public int getNumeroArchivo() {
        return numeroArchivo;
    }

    public void setNumeroArchivo(int numeroArchivo) {
        this.numeroArchivo = numeroArchivo;
    }
}
