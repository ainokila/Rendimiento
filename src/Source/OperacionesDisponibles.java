/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Source;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author ainokila
 */
public class OperacionesDisponibles implements Serializable {
   
    private ArrayList<TipoOperacion> operaciones;
    private ArrayList<TipoOperacion> operacionesEliminadas;
    
    protected OperacionesDisponibles(){
        operaciones = new ArrayList();
        operacionesEliminadas = new ArrayList();
        System.out.print(operacionesEliminadas.size());
        System.out.print(operaciones.size());
    }
    
    
    public void aniadeOperacion(TipoOperacion op){
        if(!operaciones.contains(op) && !operacionesEliminadas.contains(op)){
            operaciones.add(op);
        }else if(!operaciones.contains(op) && operacionesEliminadas.contains(op)){
            operacionesEliminadas.remove(op);
            operaciones.add(op);
        }
    }
    
    public void eliminaOperacion(String id){
        //String aux = id.replace("[", "");
        //aux = aux.replace("]", "");
        
        TipoOperacion auxiliarOperacion = this.operacion(id);
        operacionesEliminadas.add(auxiliarOperacion);
        operaciones.remove(auxiliarOperacion);
    }
    
    public void modificarTiempoOperacion(String id , double tiempo){
        for(int i = 0 ; i < operaciones.size() ; i++){
            if(operaciones.get(i).toString().equals(id)){
                operaciones.get(i).setTiempo(tiempo);
            }
        }
    }
    
    public TipoOperacion operacion(String id){
        TipoOperacion sol = new TipoOperacion("", 0);
        for(int i = 0 ; i < operaciones.size() ; i++){
            if(operaciones.get(i).toString().equals(id)){
                sol = operaciones.get(i);
                break;
            }
        }
        
        return sol;
    }
    
    public ArrayList<TipoOperacion> getArrayDis(){
        return operaciones;
    }
   
}
