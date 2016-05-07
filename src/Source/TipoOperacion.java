/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Source;

import java.io.Serializable;

/**
 *
 * @author ainokila
 */
public class TipoOperacion implements Serializable{
    
    private String nombre;
    private double tiempo;

    public TipoOperacion(String nombre , double tiempo) {
        this.nombre = nombre;
        this.tiempo = tiempo;
    }   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }
    
    @Override
    public String toString(){
        String sol = this.nombre + " - " + this.tiempo;
        return sol;
    }

}
