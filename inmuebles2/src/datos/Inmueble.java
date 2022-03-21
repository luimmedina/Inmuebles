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
public class Inmueble {
    private int precio;
    private String tipo;
    private String direccion;

    public Inmueble(int precio, String tipo, String direccion) {
        this.precio = precio;
        this.tipo = tipo;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Inmueble{" + "precio=" + precio + ", tipo=" + tipo + ", direccion=" + direccion + '}';
    }

    /**
     * @return the precio
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
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
}
