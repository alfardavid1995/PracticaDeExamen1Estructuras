
package practicaexamen1estructuras;

public class Dispositivo {
    private int numeroSerie;
    private int puntuacion;

    public Dispositivo(int numeroSerie, int puntuacion) {
        this.numeroSerie = numeroSerie;
        this.puntuacion = puntuacion;
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    @Override
    public String toString() {
        return "Dispositivo{" + "numeroSerie=" + numeroSerie + ", puntuacion=" 
                + puntuacion + '}';
    }
    
    
    
}
