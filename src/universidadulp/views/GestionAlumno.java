/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package universidadulp.views;

import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import universidadulp.Entidades.Alumno;
import universidadulp.accesoADatos.AlumnoData;

/**
 *
 * @author Kaniory
 */
public class GestionAlumno extends javax.swing.JInternalFrame {
    AlumnoData ad = new AlumnoData();
    int resp;
    /**
     * Creates new form GestionAlumno
     */
    public GestionAlumno() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtDni = new javax.swing.JTextField();
        jtApellido = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jrbEstado = new javax.swing.JRadioButton();
        jbBuscar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jdFecha = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jtId = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.lightGray);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(685, 538));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(51, 153, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Alumno");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Id del alumno:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        jLabel3.setBackground(new java.awt.Color(153, 255, 255));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellido: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        jLabel4.setBackground(new java.awt.Color(153, 153, 153));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Estado:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Fecha de Nacimiento:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, -1, -1));
        jPanel1.add(jtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 220, -1));
        jPanel1.add(jtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 290, -1));
        jPanel1.add(jtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 290, -1));
        jPanel1.add(jrbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, -1, -1));

        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar.jpg"))); // NOI18N
        jbBuscar.setMinimumSize(new java.awt.Dimension(30, 15));
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 40, 40));

        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir.jpg"))); // NOI18N
        jbSalir.setMinimumSize(new java.awt.Dimension(30, 15));
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        jPanel1.add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 430, 40, 40));

        jbEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Eliminar.jpg"))); // NOI18N
        jbEliminar.setMinimumSize(new java.awt.Dimension(30, 15));
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jbEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, 40, 40));

        jbGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar.jpg"))); // NOI18N
        jbGuardar.setMinimumSize(new java.awt.Dimension(30, 15));
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jbGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, 40, 40));

        jbNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Nuevo.jpg"))); // NOI18N
        jbNuevo.setMinimumSize(new java.awt.Dimension(30, 15));
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(jbNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 40, 40));

        jdFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jdFechaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jdFechaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jdFechaKeyTyped(evt);
            }
        });
        jPanel1.add(jdFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 220, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Nuevo");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Salir");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 470, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Guardar");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 470, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Buscar");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Eliminar");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 470, -1, -1));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Documento:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));
        jPanel1.add(jtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 220, -1));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 42, 530, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jdFechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jdFechaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jdFechaKeyTyped

    private void jdFechaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jdFechaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jdFechaKeyReleased

    private void jdFechaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jdFechaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jdFechaKeyPressed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        // TODO add your handling code here:
        try{
            if(!jtId.getText().isEmpty()){
                Alumno alu = new Alumno();
                alu = ad.buscarAlumnoPorId(Integer.parseInt(jtId.getText()));
                if(alu.getNombre()!=null){
                    jtDni.setText(alu.getDni()+"");
                    jtApellido.setText(alu.getApellido());
                    jtNombre.setText(alu.getNombre());
                    jrbEstado.setSelected(alu.isActivo());
                    jdFecha.setDate(Date.from(alu.getFechaNacimiento().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
                }
            }else if(!jtDni.getText().isEmpty()){
                Alumno alu = new Alumno();
                alu = ad.buscarAlumnoPorDni(Integer.parseInt(jtDni.getText()));
                if(alu.getNombre()!=null){
                    jtId.setText(alu.getIdAlumno()+"");
                    jtApellido.setText(alu.getApellido());
                    jtNombre.setText(alu.getNombre());
                    jrbEstado.setSelected(alu.isActivo());
                    jdFecha.setDate(Date.from(alu.getFechaNacimiento().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
                }
            }else{
                JOptionPane.showMessageDialog(this, "El campo dni y Id estan vacios, por favor llenar uno para buscar", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "El campo dni debe ser de formato numerico", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            jtDni.setText("");
        }catch(NullPointerException e){
            
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        // TODO add your handling code here:
        try{
            if(!jtId.getText().isEmpty()){
                Alumno alu = new Alumno();
                alu = ad.buscarAlumnoPorId(Integer.parseInt(jtId.getText()));
                if(alu.getNombre()!=null){
                    resp = JOptionPane.showConfirmDialog(this, "¿Estas seguro que deseas eliminar el alumno?", "", 
                         JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
                if(resp==0){
                    jrbEstado.setSelected(false);
                    ad.elimarAlumno(alu.getDni());
                }
                }
            }else{
                if(!jtDni.getText().isEmpty()){
                // Mensaje para confirmar 
                 resp = JOptionPane.showConfirmDialog(this, "¿Estas seguro que deseas eliminar el alumno?", "", 
                         JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
                if(resp==0){
                    jrbEstado.setSelected(false);
                    ad.elimarAlumno(Integer.parseInt(jtDni.getText()));
                }
            }else{
                JOptionPane.showConfirmDialog(this, "El campo dni/id esta vacio", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            }
            }
            
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "El campo dni debe ser de formato numerico", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        // TODO add your handling code here:
        boolean est;
        LocalDate fecha = null;
        try{
            if(jtId.getText().isEmpty()){
            if(!jtDni.getText().isEmpty() || !jtApellido.getText().isEmpty() || !jtNombre.getText().isEmpty() ||
                jdFecha.getDate()!=null && jtId.getText().isEmpty()){
                int dni = Integer.parseInt(jtDni.getText());
                String ape = jtApellido.getText();
                String nom = jtNombre.getText();
                if(jrbEstado.isSelected()){
                    est = true;
                }else{
                    est = false;
                }
                if(jdFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().isBefore(LocalDate.now())){
                    fecha = jdFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                }
                Alumno alu = new Alumno(dni, ape, nom, fecha, est);
                if(ad.buscarDni(dni)==null){
                    ad.guardarAlumno(alu);
                }else{
                    resp = JOptionPane.showConfirmDialog(this, "¿Estas seguro que deseas modificar el alumno?", "", 
                         JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
                    if(resp==0){
                    ad.modificarAlumno(alu);
                    }
                }
            }else{
                    JOptionPane.showMessageDialog(this, "Quedan campos vacios, llene todos excepto el Id", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                }
                
            }else{
                JOptionPane.showMessageDialog(this, "El id se genera automaticamente", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                    jtId.setText("");
            }
        }catch(NumberFormatException e){
            if(!jtDni.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "El campo dni debe ser de formato numerico y sin puntos", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                jtDni.setText("");
            }
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(this, "El campo fecha es incorrecto, elija una fecha desde el boton del calendario", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            jdFecha.setDate(null);
        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        // TODO add your handling code here:
        jtId.setText("");
        jtDni.setText("");
        jtApellido.setText("");
        jtNombre.setText("");
        jrbEstado.setSelected(false);
        jdFecha.setDate(null);
    }//GEN-LAST:event_jbNuevoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private com.toedter.calendar.JDateChooser jdFecha;
    private javax.swing.JRadioButton jrbEstado;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtDni;
    private javax.swing.JTextField jtId;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables
}
