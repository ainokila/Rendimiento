/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Source;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author ainokila
 */
public class Operario implements Serializable {
    
    private Map<String,OperacionesDiarias> diario;
    private String nombre;
    private double porcentajeHistorico = 0;

    public Operario(String nombre) {
        
        this.diario = new HashMap();
        this.nombre = nombre;
        
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public double getPorcentajeDia(String dia){
        if(diario.containsKey(dia)){
            return diario.get(dia).getPorcentaje();
        }else{
            return getOperacionesDiarias(dia).getPorcentaje();
        }
        
    }

    public double getPorcentajeHistorico() {
        return porcentajeHistorico;
    }
    
    public OperacionesDiarias getOperacionesDiarias(String fecha){
        OperacionesDiarias resultado;
        
        if(diario.containsKey(fecha)){
            resultado = diario.get(fecha);
        }else{
               resultado = new OperacionesDiarias(fecha);
               setOperacionesDiarias(fecha, resultado);
        }
        return resultado;
    }
    
    public void setOperacionesDiarias(String fecha, OperacionesDiarias op){
        diario.put(fecha, op);
        calculaPorcHist();
    }
    
    public void calculaPorcHist(){
        //String fecha;
        int contador = 0;
        double sumParcial = 0;
        
        Iterator<String> it = diario.keySet().iterator();
        
      for(Entry<String,OperacionesDiarias> aux : diario.entrySet()){
          if(aux.getValue().totalOperaciones() != 0 && aux.getValue()!=null){
            contador++;
          }
          sumParcial += aux.getValue().getPorcentaje();
      }
        
        if(contador != 0){
            porcentajeHistorico = sumParcial / (contador * 1.0);
        }
        
    }
    
    @Override 
    public String toString(){
        return getNombre();
    }
    
    public ArrayList<OperacionesDiarias> getArrayOperacionesDiarias(){
        return new ArrayList<>(diario.values());
    }
   
}
