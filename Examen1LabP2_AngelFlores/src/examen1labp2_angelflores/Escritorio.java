/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1labp2_angelflores;

/**
 *
 * @author Angel G
 */
public class Escritorio extends Pc {
    int capacidadRam;
    double capacidadAlmacenamiento;
    String tipoAlmacenamiento;
    String grafica;

    public Escritorio(int capacidadRam, double capacidadAlmacenamiento, String tipoAlmacenamiento, String grafica, String direccionIp, String mascaraDered, String hostName) {
        super(direccionIp, mascaraDered, hostName);
        this.capacidadRam = capacidadRam;
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
        this.tipoAlmacenamiento = tipoAlmacenamiento;
        this.grafica = grafica;
    }

    public int getCapacidadRam() {
        return capacidadRam;
    }

    public void setCapacidadRam(int capacidadRam) {
        this.capacidadRam = capacidadRam;
    }

    public double getCapacidadAlmacenamiento() {
        return capacidadAlmacenamiento;
    }

    public void setCapacidadAlmacenamiento(double capacidadAlmacenamiento) {
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
    }

    public String getTipoAlmacenamiento() {
        return tipoAlmacenamiento;
    }

    public void setTipoAlmacenamiento(String tipoAlmacenamiento) {
        this.tipoAlmacenamiento = tipoAlmacenamiento;
    }

    public String getGrafica() {
        return grafica;
    }

    public void setGrafica(String grafica) {
        this.grafica = grafica;
    }

    @Override
    public String toString() {
        return super.toString()+"Escritorio{" + "capacidadRam=" + capacidadRam + ", capacidadAlmacenamiento=" + capacidadAlmacenamiento + ", tipoAlmacenamiento=" + tipoAlmacenamiento + ", grafica=" + grafica + '}';
    }
    
}
