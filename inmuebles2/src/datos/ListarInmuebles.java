/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Administrador
 */
public class ListarInmuebles {
    private ArrayList<Inmueble> col=new ArrayList<>();
    
     public void addInmueble(Inmueble x){
        col.add(x);
    }
  
     public void bubbleSort(){
        for (int i = 0; i < col.size(); i++) {
            for (int j = 0; j < col.size()-1; j++) {
                if(col.get(j).getTipo().compareTo(col.get(j+1).getTipo())>0){
                    Inmueble t = col.get(j);
                    col.set(j, col.get(j+1));
                    col.set(j+1, t);
                    
                    //compareTo = Solo para Strings
                }
                
            }
            
        }
    }
     
     public String listado(){
        String lis="";
        for (int i = 0; i < col.size(); i++) {
            Inmueble ob = col.get(i);
            lis=lis+" "+ob.toString();
            
        }
        return lis;
    }
     
   public String listadoPorCasas(){
       String lis="";
       for (int i = 0; i < col.size(); i++) {
           Inmueble ob = col.get(i);
           if(ob.getTipo().equals("Casa"))
           lis=lis+" "+ob.toString();
       }
       return lis;
   }

    public void ordenarPorPrecio() {
       Collections.sort(col, new PrecioComparator());
    }

    public void ordenarPorDireccion() {
       Collections.sort(col, new DireccionComparator());
    }

    public String borrarTipoCasa(){
        String lis="";
       for (int i = 0; i < col.size(); i++) {
           Inmueble ob = col.get(i);
           if(ob.getTipo().equals("Casa"))
           lis=lis+" "+ob.toString();
       }
       return lis;
    }
    
}
