package com.mycompany.peluqueriacanina.igu;

import com.mycompany.peluqueriacanina.logica.Controladora;
import com.mycompany.peluqueriacanina.logica.Mascota;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VerDatos extends javax.swing.JFrame {
    
    //Creamos uns instancia de Controladora
    Controladora control = null;

    public VerDatos() {
        control = new Controladora();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMascotas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setText("Visualización de Datos");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tablaMascotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaMascotas);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Datos de mascota:");

        btnEditar.setIcon(new javax.swing.ImageIcon("C:\\Java\\Recursos\\editar.png")); // NOI18N
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon("C:\\Java\\Recursos\\eliminar.png")); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 823, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(845, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(21, 21, 21)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(53, 53, 53)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(436, Short.MAX_VALUE)))
        );

        btnVolver.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVolver.setIcon(new javax.swing.ImageIcon("C:\\Java\\Recursos\\volver.png")); // NOI18N
        btnVolver.setText(" Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //Verificamos que la tabla no este vacia
        if(tablaMascotas.getRowCount() > 0) {
            //Verificamos que el usuario haya seleccionado una fila
            if(tablaMascotas.getSelectedRow() != -1) {
                //Obtenemos el id de la mascota a eliminar
                int num_cliente = Integer.parseInt(String.valueOf(tablaMascotas.getValueAt(tablaMascotas.getSelectedRow(), 0)));
                //Llamamos al metodo borrar
                control.borrarMascota(num_cliente);
                //Mostramos un mensaje que se borro correctamente
                mostrarMensaje("Mascota eliminada correctamente", "Info", "Borrado de mascota");
                //Cargamos nuevamente la tabla
                cargarTabla();
            } else {
                mostrarMensaje("No selecciono ninguna mascota", "Error", "Error al eliminar");
            }
        } else {
            mostrarMensaje("No hay nada para eliminar en la tabla", "Error", "Error al eliminar");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        //Controlo que la tabla no este vacia
        if(tablaMascotas.getRowCount() > 0) {
            //Controlo que se haya seleccionado a una mascota
            if(tablaMascotas.getSelectedRow() != -1) {
                //Obtengo id de la mascota a editar
                int num_cliente = Integer.parseInt(String.valueOf(tablaMascotas.getValueAt(tablaMascotas.getSelectedRow(), 0)));
                
                //Creamos una instancia de ModificarDatos
                ModificarDatos pantallaModif = new ModificarDatos(num_cliente);
                //Muestra la interfaz de Principal
                pantallaModif.setVisible(true);
                //Muestra la interfaz centrada
                pantallaModif.setLocationRelativeTo(null);
                
                //Al dar clic en el boton, cerramos la ventana!!!
                this.dispose();
            } else {
                mostrarMensaje("No selecciono ninguna mascota", "Error", "Error al eliminar");
            }
        } else {
            mostrarMensaje("No hay nada para eliminar en la tabla", "Error", "Error al eliminar");
        } 
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        //Creamos una instancia de Principal
        Principal princ = new Principal();
        //Muestra la interfaz de Principal
        princ.setVisible(true);
        //Muestra la interfaz centrada
        princ.setLocationRelativeTo(null);
        
        //Cerramos la ventana
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    //Metodo para mostrar mensaje
    public void mostrarMensaje(String mensaje, String tipo, String titulo) {
        JOptionPane optionPane = new JOptionPane(mensaje); //Mensaje
        if(tipo.equals("Info")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE); //Tipo de mensaje
        }else if(tipo.equals("Error")) {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE); //Tipo de mensaje
        }
        JDialog dialog = optionPane.createDialog(titulo); //Lo que aparece en la barra
        dialog.setAlwaysOnTop(true); //Posicion arriba
        dialog.setVisible(true); //Visible
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaMascotas;
    // End of variables declaration//GEN-END:variables

    public void cargarTabla() {
        //Definimos el modelo que queremos que tenga la tabla
        DefaultTableModel modeloTabla = new DefaultTableModel(){
            
            //Metodo para que filas y columnas no sean editables
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        //Establecemos los nombres de las columnas
        String titulos[] = {"Num", "Nombre", "Color", "Raza", "Alergico", "At. Esp.", "Dueño", "Cel"};
        modeloTabla.setColumnIdentifiers(titulos); //Colocamos los identificadores de las columnas
        
        //Carga de los datos desde la base de datos
        List <Mascota> listaMascota = control.traerMascotas();
        
        //Recorrer la lista y mostrar cada uno de los elementos en la tabla
        if(listaMascota != null) {
            for(Mascota masco : listaMascota) {
                Object[] objeto = {masco.getNum_cliente(), masco.getNombre(), masco.getColor(), masco.getRaza(), masco.getAlergico(), 
                    masco.getAtencion_especial(), masco.getUnDuenio().getNombre(), masco.getUnDuenio().getCelDuenio()};
                
                modeloTabla.addRow(objeto); //Agregamos los elemetos en la fila de la tabla
            }
        }
        
        //Asignamos el modelo a la tablaMascotas!!!
        tablaMascotas.setModel(modeloTabla);
    }
}