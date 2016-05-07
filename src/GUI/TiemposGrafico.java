/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Source.Empresa;
import Source.Operario;

/**
 *
 * @author ainokila
 */
public class TiemposGrafico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EmpresaView em = new EmpresaView();
        Empresa prueba = new Empresa();
        
        //prueba.setOperario(new Operario("Pepe bichuela"));
        try{
            prueba.cargar();
        }catch(Exception e){
        }
        em.setEmpresa(prueba);
        em.setVisible(true);
                
    }
    
}
