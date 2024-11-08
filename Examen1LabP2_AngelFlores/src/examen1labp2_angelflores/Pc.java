/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1labp2_angelflores;

/**
 *
 * @author Angel G
 */
public class Pc {
    String direccionIp;
    String mascaraDered;
    String hostName;

    public Pc(String direccionIp, String mascaraDered, String hostName) {
        this.direccionIp = direccionIp;
        this.mascaraDered = mascaraDered;
        this.hostName = hostName;
    }

    public String getDireccionIp() {
        return direccionIp;
    }

    public void setDireccionIp(String direccionIp) {
        this.direccionIp = direccionIp;
    }

    public String getMascaraDered() {
        return mascaraDered;
    }

    public void setMascaraDered(String mascaraDered) {
        this.mascaraDered = mascaraDered;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    @Override
    public String toString() {
        return "Pc{" + "direccionIp=" + direccionIp + ", mascaraDered=" + mascaraDered + ", hostName=" + hostName + '}';
    }
    
}
