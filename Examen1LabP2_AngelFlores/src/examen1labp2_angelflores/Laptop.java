/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1labp2_angelflores;

/**
 *
 * @author Angel G
 */
public class Laptop extends Pc{
    String marca;
    String definicionPantalla;
    String Rgb;

    public Laptop(String marca, String definicionPantalla, String Rgb, String direccionIp, String mascaraDered, String hostName) {
        super(direccionIp, mascaraDered, hostName);
        this.marca = marca;
        this.definicionPantalla = definicionPantalla;
        this.Rgb = Rgb;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDefinicionPantalla() {
        return definicionPantalla;
    }

    public void setDefinicionPantalla(String definicionPantalla) {
        this.definicionPantalla = definicionPantalla;
    }

    public String getRgb() {
        return Rgb;
    }

    public void setRgb(String Rgb) {
        this.Rgb = Rgb;
    }

    @Override
    public String toString() {
        return super.toString()+"Laptop{" + "marca=" + marca + ", definicionPantalla=" + definicionPantalla + ", Rgb=" + Rgb + '}';
    }
    
}
