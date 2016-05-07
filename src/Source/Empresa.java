/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Source;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ainokila
 */
public class Empresa implements Serializable{
       
    //private static Empresa instance = null;
    private Map<String,Operario> operarios;
    private OperacionesDisponibles operacionesDis;



    public Empresa() {
        operarios  = new HashMap();  
        operacionesDis = new OperacionesDisponibles();
    }
   
    public void copy(Empresa cp){
        operarios = cp.operarios;
        operacionesDis = cp.operacionesDis;
    }
    /*public static Empresa getInstance(){
        if(instance == null){
            instance = new Empresa();
        }
        return instance;
    }
    
    private Object readResolve() throws ObjectStreamException{
        return instance;
    }*/
    
    public Operario getOperario(String nombre){
        Operario op = new Operario("Operario inexistente");
        
        if(operarios.containsKey(nombre)){
            op = operarios.get(nombre);
        }
        
        return op;
    }
    
    public void setOperario(Operario op){
        this.operarios.put(op.getNombre().toUpperCase(), op);
    }
    
    public void mostrarOperarios(){
      //Iterator<Integer> it = operarios.keySet().iterator();
        
      for(Map.Entry<String,Operario> aux : operarios.entrySet()){
            System.out.println(aux.getValue().getNombre()+"\t" + aux.getValue().getPorcentajeHistorico()+"\n");
      }
        System.out.println(operarios.size());
      
      
    }
    
    public Map<String,Operario> getOperariosMap(){
        return operarios;
    }
    
    public boolean guardar(){
        boolean estado = true;
        try{
            FileOutputStream fos = new FileOutputStream("//tmp//serial.ser");
            ObjectOutputStream out = new ObjectOutputStream(fos);
            out.writeObject(this);
            out.close();
            fos.close();
        }catch(IOException e){
            e.printStackTrace();
            estado = false;
        }
        return estado;
    }
    
    public boolean cargar(){
        boolean estado = true;
        try{
            FileInputStream fin = new FileInputStream("//tmp//serial.ser");
            ObjectInputStream in = new ObjectInputStream(fin);
            this.copy((Empresa) in.readObject());
            in.close();
            fin.close();
        }catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
            estado = false;
        }
        return estado;
        
    }
    
    public void aniadirOperacionDiaria(TipoOperacion op){
        operacionesDis.aniadeOperacion(op);
    }
    
    public OperacionesDisponibles getOperacionesDisponibles(){
        return operacionesDis;
    }
    
    public void eliminaOperario(String eliminado){
        this.operarios.remove(eliminado);
    }
    
    
    
    
    
}
