/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Source;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

/**
 *
 * @author ainokila
 */
public class OperacionesDiarias implements Serializable ,Comparator<OperacionesDiarias>, Comparable<OperacionesDiarias>{
    
    private ArrayList<Operacion> operaciones;
    private double porcentaje;
    private double tiempoRealizado;
    private String fecha;
    

    public ArrayList<Operacion> getListaOperaciones(){
        return operaciones;
    }
    public OperacionesDiarias(String fecha) {
        operaciones = new ArrayList();
        porcentaje = 0;
        tiempoRealizado = 0;
        this.fecha = fecha;
    }

    public String getFecha() {
        return fecha;
    }

    public double getTiempoRealizado() {
        return tiempoRealizado;
    }

    public void setTiempoRealizado(double tiempoRealizado) {
        this.tiempoRealizado = tiempoRealizado;
        actualizaPorcentajeDiario();
    }
    
    public void insertar(Operacion operacion){
        
        if(operacion != null){
            boolean estaOp = false;

            for(int i=0; i<operaciones.size() ; i++){
                if(operaciones.get(i).getTipoOperacion().toString().equals(operacion.getTipoOperacion().toString()) ){
                    operaciones.get(i).setRepeticiones(operaciones.get(i).getRepeticiones() + operacion.getRepeticiones());
                    if(operaciones.get(i).getRepeticiones()==0){
                        operaciones.remove(i);
                    }
                    estaOp = true;
                }
            }

            if(!estaOp){
                operaciones.add(operacion);
            }
            actualizaPorcentajeDiario();
        }else{
            System.out.print("Valor nulo");
        }
        
    }
    
    public void eliminar(Operacion operacion){
        operaciones.remove(operacion);
        actualizaPorcentajeDiario();
    }

    public double getPorcentaje() {
        return porcentaje;
    }
    
    public void actualizaPorcentajeDiario(){
        //TIEMPO ESPERADO / TIEMPO REALIZADO * 100
        double esperado = 0;
        for(int i=0; i<operaciones.size() ; i++){
            esperado += operaciones.get(i).getTipoOperacion().getTiempo() * operaciones.get(i).getRepeticiones();
        }
        
        if(tiempoRealizado!=0){
           porcentaje = esperado/tiempoRealizado * 100;
        }else{
            porcentaje = 0;
        }

    }
    
    public int totalOperaciones(){
        return operaciones.size();
    }

    @Override
    public int compare(OperacionesDiarias op1, OperacionesDiarias op2) {
        String fecha1 = ((OperacionesDiarias)op1).getFecha();
            String fecha2 = ((OperacionesDiarias)op2).getFecha();
            
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
	
            try {

                    Date date1 = formatter.parse(fecha1);
                    Date date2 = formatter.parse(fecha2);
                    
                    return date1.compareTo(date2);

            } catch (ParseException e) {
                    e.printStackTrace();
            }
        
            return 0;
    }

    @Override
    public int compareTo(OperacionesDiarias op2) {
            String fecha1 = getFecha();
            String fecha2 = ((OperacionesDiarias)op2).getFecha();
            
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
	
            try {

                    Date date1 = formatter.parse(fecha1);
                    Date date2 = formatter.parse(fecha2);
                    
                    return date1.compareTo(date2);

            } catch (ParseException e) {
                    e.printStackTrace();
            }
        
            return 0;
    }
    
    
}


