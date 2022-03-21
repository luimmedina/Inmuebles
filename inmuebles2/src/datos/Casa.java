/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author Administrador
 */
public class Casa {
    private String direccion;
    private String barrio;
    private int numcasa;

    public Casa(String direccion, String barrio, int numcasa) {
        this.direccion = direccion;
        this.barrio = barrio;
        this.numcasa = numcasa;
    }

    @Override
    public String toString() {
        return "Casa{" + "direccion=" + direccion + ", barrio=" + barrio + ", numcasa=" + numcasa + '}';
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the barrio
     */
    public String getBarrio() {
        return barrio;
    }

    /**
     * @param barrio the barrio to set
     */
    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    /**
     * @return the numcasa
     */
    public int getNumcasa() {
        return numcasa;
    }

    /**
     * @param numcasa the numcasa to set
     */
    public void setNumcasa(int numcasa) {
        this.numcasa = numcasa;
    }
}
