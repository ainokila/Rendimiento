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
public class Operacion implements Serializable{

    private TipoOperacion op;
    private int repeticiones;

    public Operacion(TipoOperacion tip ,int repeticiones) {
        this.op = tip;
        this.repeticiones = repeticiones;
    }

    public int getRepeticiones() {
        return repeticiones;
    }

    public void setRepeticiones(int repeticiones) {
        this.repeticiones = repeticiones;
    }

    public TipoOperacion getTipoOperacion() {
        return op;
    }

    public void setTipoOperacion(TipoOperacion op) {
        this.op = op;
    }

    
    
}
