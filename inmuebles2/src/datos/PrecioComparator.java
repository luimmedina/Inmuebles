/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.Comparator;

/**
 *
 * @author Administrador
 */
public class PrecioComparator implements Comparator<Inmueble>{

    @Override
    public int compare(Inmueble o1, Inmueble o2) {
        if(o1.getPrecio()>o2.getPrecio()){
            return 1;
        } else if(o1.getPrecio()<o2.getPrecio()){
            return -1;
        } else {
            return 0;
        }
    }
    
}
