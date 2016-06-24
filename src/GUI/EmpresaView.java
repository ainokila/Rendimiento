/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Source.Empresa;
import Source.Operario;
import java.awt.Color;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ainokila
 */
public class EmpresaView extends javax.swing.JFrame {

    private Empresa empresa = new Empresa();
    
    public void setEmpresa(Empresa em){
        this.empresa = em;
        actualizaOperarios(operario);
        repaint();
        revalidate();
        
        
    }
    
    /**
     * Creates new form EmpresaView
     */
    public EmpresaView() {
        
        initComponents();
        this.getContentPane().setBackground(new Color(171,202,212));
        operarioView.setBackground(new Color(235,235,235));
        setTitle("[Tiempos y rendimiento]");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
        setIconImage(new ImageIcon(getClass().getResource("/GUI/ico.png")).getImage());
        repaint();
        
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {
                dialogoGuardar();               
            }
        });
        operarioView.setVisible(false);

        //eliminarOperacionBtn.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buscarBtn = new javax.swing.JButton();
        operario = new javax.swing.JComboBox<>();
        guardarBtn = new javax.swing.JButton();
        cargarBtn = new javax.swing.JButton();
        aniadirOperacionBtn = new javax.swing.JButton();
        eliminarOperarioBtn = new javax.swing.JButton();
        aniadirOperarioBtn = new javax.swing.JButton();
        fecha = new datechooser.beans.DateChooserCombo();
        operarioView = new GUI.OperarioView();
        estadisticasBtn = new javax.swing.JButton();
        eliminarOperacionView = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Operario:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Fecha:");

        buscarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buscarBtn.setText("Buscar");
        buscarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBtnActionPerformed(evt);
            }
        });

        operario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        operario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operarioActionPerformed(evt);
            }
        });

        guardarBtn.setText("Guardar");
        guardarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBtnActionPerformed(evt);
            }
        });

        cargarBtn.setText("Cargar");
        cargarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarBtnActionPerformed(evt);
            }
        });

        aniadirOperacionBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        aniadirOperacionBtn.setText("Añadir Operacion");
        aniadirOperacionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aniadirOperacionBtnActionPerformed(evt);
            }
        });

        eliminarOperarioBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eliminarOperarioBtn.setText("Eliminar Operario");
        eliminarOperarioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarOperarioBtnActionPerformed(evt);
            }
        });

        aniadirOperarioBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        aniadirOperarioBtn.setText("Añadir Operario");
        aniadirOperarioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aniadirOperarioBtnActionPerformed(evt);
            }
        });

        estadisticasBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icono.png"))); // NOI18N
        estadisticasBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        estadisticasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadisticasBtnActionPerformed(evt);
            }
        });

        eliminarOperacionView.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eliminarOperacionView.setText("Eliminar Operacion");
        eliminarOperacionView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarOperacionViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 984, Short.MAX_VALUE)
                        .addComponent(cargarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(guardarBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(operario, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buscarBtn)
                            .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(aniadirOperarioBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(aniadirOperacionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(estadisticasBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(eliminarOperacionView, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(eliminarOperarioBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(operarioView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4)))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarBtn)
                    .addComponent(jLabel1)
                    .addComponent(cargarBtn))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(operarioView, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(operario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buscarBtn)
                                .addGap(79, 79, 79)
                                .addComponent(aniadirOperarioBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(aniadirOperacionBtn)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(eliminarOperarioBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(eliminarOperacionView)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(estadisticasBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void actualizaOperarios(javax.swing.JComboBox<String> operarios){
      operarios.removeAllItems();
      for(Map.Entry<String,Operario> aux : empresa.getOperariosMap().entrySet()){
            operarios.addItem(aux.getValue().toString());
      }
    }
    
    private void operarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operarioActionPerformed

       
    }//GEN-LAST:event_operarioActionPerformed

    private void guardarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBtnActionPerformed
        ConfirmacionGuardarView confirma = new ConfirmacionGuardarView(this, true, empresa);
        this.setEmpresa(empresa);
        repaint();
    }//GEN-LAST:event_guardarBtnActionPerformed

    private void cargarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarBtnActionPerformed
        ConfirmacionCargarView confirma = new ConfirmacionCargarView(this, true, empresa);
        this.setEmpresa(empresa);
        repaint();
    }//GEN-LAST:event_cargarBtnActionPerformed

    private void aniadirOperacionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aniadirOperacionBtnActionPerformed
        AniadirOperacionDisponibleView operacion = new AniadirOperacionDisponibleView(this, true);
        empresa.aniadirOperacionDiaria(operacion.getTipoOperacionNueva());
        this.setEmpresa(empresa);
        operarioView.setVisible(false);

        repaint();
        
    }//GEN-LAST:event_aniadirOperacionBtnActionPerformed

    private void eliminarOperarioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarOperarioBtnActionPerformed
        EliminarOperarioView eliminar = new EliminarOperarioView(this, true ,empresa);
        this.setEmpresa(empresa);
        operarioView.setVisible(false);

        repaint();
    }//GEN-LAST:event_eliminarOperarioBtnActionPerformed

    private void aniadirOperarioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aniadirOperarioBtnActionPerformed
        aniadirOperarioView nameCapture = new aniadirOperarioView(this,true);
        String nombreNuevo = nameCapture.getNombreNuevo().toUpperCase();
        String auxiliar = nombreNuevo.replace(" ", "");
        
        
        if((nombreNuevo).equals(empresa.getOperario(nombreNuevo).toString())){
                JOptionPane.showMessageDialog(null, "El operario ya existe");
                    
        }else if(auxiliar.equals("")){
                JOptionPane.showMessageDialog(null, "Nombre no valido");
            
        }else{

                    empresa.setOperario(new Operario(nombreNuevo));
                    this.setEmpresa(empresa);
                    operarioView.setVisible(false);

                    repaint();

        }

        
    }//GEN-LAST:event_aniadirOperarioBtnActionPerformed

    private void dialogoGuardar(){
        ConfirmacionGuardarView confirma = new ConfirmacionGuardarView(this, true, empresa);
        this.setEmpresa(empresa);
        repaint();
    }
    private void buscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBtnActionPerformed
        String fechaS;
        String nombre;
        Operario nuevoBuscado;

        
        if (fecha.getText()!=null){
            fechaS =  fecha.getText();
            nombre = (String) operario.getSelectedItem();
            
            nuevoBuscado = empresa.getOperario(nombre);
            operarioView.setOpererario(nuevoBuscado, fechaS,empresa);
            operarioView.setVisible(true);
            
            repaint();
            revalidate();
           
            
            
        }else{
           JOptionPane.showMessageDialog(null, "Error en la busqueda"); 
        }
        
        
        
        
    }//GEN-LAST:event_buscarBtnActionPerformed

    private void estadisticasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadisticasBtnActionPerformed
        EstadisticasSelecView select = new EstadisticasSelecView(this, true, empresa);
        
    }//GEN-LAST:event_estadisticasBtnActionPerformed

    private void eliminarOperacionViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarOperacionViewActionPerformed
        EliminarOperacionView operacion = new EliminarOperacionView(this, true, empresa);
        this.setEmpresa(empresa);
        this.buscarBtnActionPerformed(evt);
        operarioView.setVisible(false);
        repaint();
        revalidate();
    }//GEN-LAST:event_eliminarOperacionViewActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aniadirOperacionBtn;
    private javax.swing.JButton aniadirOperarioBtn;
    private javax.swing.JButton buscarBtn;
    private javax.swing.JButton cargarBtn;
    private javax.swing.JButton eliminarOperacionView;
    private javax.swing.JButton eliminarOperarioBtn;
    private javax.swing.JButton estadisticasBtn;
    private datechooser.beans.DateChooserCombo fecha;
    private javax.swing.JButton guardarBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox<String> operario;
    private GUI.OperarioView operarioView;
    // End of variables declaration//GEN-END:variables
}
