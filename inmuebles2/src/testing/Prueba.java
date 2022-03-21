/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

import datos.Inmueble;
import datos.ListarInmuebles;



/**
 *
 * @author Administrador
 */
public class Prueba {
    public static void main(String[] args) {
        ListarInmuebles listinm = new ListarInmuebles();
        listinm.addInmueble(new Inmueble(40000000, "Casa", "Calle Mateos, 082, 2º E"+"\n"));
        listinm.addInmueble(new Inmueble(9000000, "Apartamento", "Paseo Palomino, 381, 31º E"+"\n"));
        listinm.addInmueble(new Inmueble(21000000, "Casa-Estudio", "Calle Cristina, 1, 65º C"+"\n"));
        listinm.addInmueble(new Inmueble(37000000, "Casa", "Avinguda Guillem, 39, Entre suelo 5º"+"\n"));
        listinm.addInmueble(new Inmueble(7000000, "Apartamento", "Paseo Rivera, 71, Bajos"+"\n"));
        listinm.addInmueble(new Inmueble(35000000, "Casa", "Ronda Herrero, 11, 1º F"+"\n"));
        listinm.addInmueble(new Inmueble(15000000, "Casa-Estudio", "Avinguda Sergio, 53, 96º D"+"\n"));
        
        
         //Listado normal
        System.out.println(" "+listinm.listado());
        System.out.println("\n");
        
        //Listado por tipos
        listinm.bubbleSort();
        System.out.println(" "+listinm.listado());
        System.out.println("\n");
        
        
        //Borrar un inmueble
        
                
                
        
        
        //Listado solo casas
        System.out.println(" "+listinm.listadoPorCasas());
        System.out.println("\n");
        
        
        
        //Inmuebles del más barato al más caro
        listinm.ordenarPorPrecio();
        System.out.println(" "+listinm.listado());
        System.out.println("\n");
        
        
        //Inmuebles por direccion
        listinm.ordenarPorDireccion();
        System.out.println(" "+listinm.listado());
        System.out.println("\n");
        
        
        //Dado una direccion hallar el inmueble
        
        
        //Borrar los inmuebles tipo casa
        listinm.borrarTipoCasa();
    }
    
}
