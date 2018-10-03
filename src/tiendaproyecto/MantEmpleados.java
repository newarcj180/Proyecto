
package tiendaproyecto;
import java.io.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;
import tiendaproyecto.*;

public class MantEmpleados extends javax.swing.JFrame {

    static Connection conn=null;
    static Statement st=null;
    static ResultSet rs=null;

    DefaultTableModel dtm=new DefaultTableModel();

    public MantEmpleados() {
        initComponents();
        activaBotones(true,false,false,false);
        String titulos[]={"Código","Apellidos","Nombres","F.Nacimiento","Direccion","Telefono","Sueldo"};
        dtm.setColumnIdentifiers(titulos);
        TablaEmpleados.setModel(dtm);
        setSize(800,620);
        setLocation(180,100);
        this.setResizable(false);
    }

    public void activaBotones(boolean n, boolean e, boolean m, boolean g)
    {  btnNuevo.setEnabled(n);
      
       btnModificar.setEnabled(m);
       btnGrabar.setEnabled(g);
    }
    public void limpiarObjetos()
    {
    txtCodigo.setText("");
    txtapellidos.setText(""); 
    txtNombre.setText("");   
    txtNacimineto.setText("");
    txtDirec.setText("");
    txtTelef.setText("");
    txtsueldo.setText("");
    
    }

     public void llenartabla()
    {try{   int f, i;
            conn=Main.Enlace(conn);
            rs=Main.EnlEmpleado(rs);
            String datos[]=new String[7];
            f=dtm.getRowCount();
            if(f>0)
                for(i=0;i<f;i++)
                    dtm.removeRow(0);
            while(rs.next())
                    {
                    datos[0]=(String)rs.getString(1);
                    datos[1]=(String)rs.getString(2);
                    datos[2]=(String)rs.getString(3);
                    datos[3]=(String)rs.getString(4);
                    datos[4]=(String)rs.getString(5);
                    datos[5]=(String)rs.getString(6);
                    datos[6]=(String)rs.getString(7);
                   
                    dtm.addRow(datos);
                    }} catch(SQLException e){JOptionPane.showMessageDialog(null, "Error en BD"+e.toString());}}

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        txtapellidos = new javax.swing.JTextField();
        txtDirec = new javax.swing.JTextField();
        txtTelef = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtNacimineto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtsueldo = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaEmpleados = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnGrabar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnVer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 225, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Empleados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 11))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Codigo de Empleado:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        jLabel2.setText("Nombres:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel3.setText("Apellidos:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel7.setText("Dirección:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel8.setText("Telefono:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 270, -1));
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 150, -1));
        jPanel1.add(txtapellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 170, -1));
        jPanel1.add(txtDirec, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 360, -1));
        jPanel1.add(txtTelef, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 190, -1));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.gif"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, -1, -1));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar.gif"))); // NOI18N
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, -1, -1));

        jLabel9.setText("Fecha de Nacimineto:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));
        jPanel1.add(txtNacimineto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 140, -1));

        jLabel4.setText("Sueldo:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));
        jPanel1.add(txtsueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 90, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 520, 320));

        TablaEmpleados.setBackground(new java.awt.Color(153, 218, 255));
        TablaEmpleados.setForeground(new java.awt.Color(255, 255, 0));
        TablaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Apellidos", "Nombre", "F. Nacimineto", "Direccion", "Telefono", "Sueldo"
            }
        ));
        jScrollPane2.setViewportView(TablaEmpleados);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 770, 180));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 205, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo.GIF"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel2.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, -1));

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar.gif"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel2.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 110, -1));

        btnGrabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/grabar.gif"))); // NOI18N
        btnGrabar.setText("Grabar");
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });
        jPanel2.add(btnGrabar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 100, -1));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar.gif"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 110, -1));

        btnVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/VER.gif"))); // NOI18N
        btnVer.setText("Ver Lista");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });
        jPanel2.add(btnVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 110, -1));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, 160, 310));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String b, sex,f;
        if(btnNuevo.isEnabled()) {
            try {conn=Main.Enlace(conn);
                rs=Main.EnlEmpleado(rs);
                b=txtCodigo.getText();
                boolean encuentra=false;
                while(rs.next()) {if(b.equals(rs.getString(1))) {
                        txtapellidos.setText((String)rs.getString(2));
                        txtNombre.setText((String)rs.getString(3));
                        f=(String)rs.getString(4).substring(0,10);
                        txtNacimineto.setText(f.substring(8,10)+"-"+f.substring(5,7)+"-"+f.substring(0,4));
                        txtDirec.setText((String)rs.getString(5));
                        txtTelef.setText((String)rs.getString(6));
                        txtsueldo.setText((String)rs.getString(7));
                        
                        this.activaBotones(true, true, true, false);
                        encuentra=true;
                        break;
                    }} if(encuentra==false) {
                    txtCodigo.setText("No existe");
                    txtCodigo.requestFocus();
                } } catch(SQLException e) { JOptionPane.showMessageDialog(null, "Error BD"+e.getMessage());}}
}//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        MenuPrincipal mn=new MenuPrincipal();
        mn.show();
        dispose();
}//GEN-LAST:event_btnCerrarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        limpiarObjetos();
        txtCodigo.setEnabled(false);
        txtNombre.requestFocus();
        activaBotones(false,false,false,true);
}//GEN-LAST:event_btnNuevoActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        int resp;
        resp=JOptionPane.showConfirmDialog(null, "¿Desea Modidicar el Registro?","Pregunta",0);
        if(resp==0) {
            try {
                conn=Main.Enlace(conn);
                st=Main.sta(st);
                rs=Main.EnlEmpleado(rs);
                String cod,nom,ap,dir,telf,f;
                int suel;
                Date fecha;
                cod=txtCodigo.getText();
                nom=txtNombre.getText();
                ap=txtapellidos.getText();      
                dir=txtDirec.getText();
                telf=txtTelef.getText();
                suel=Integer.parseInt(txtsueldo.getText());
                f=txtNacimineto.getText();
                fecha=Date.valueOf(f);
               
                PreparedStatement pstmt=conn.prepareStatement("{CALL sp_modificaEmpleado(?,?,?,?,?,?,?)}");
                pstmt.setString(1, cod);
                pstmt.setString(2, ap);
                pstmt.setString(3, nom);
                pstmt.setDate(4, fecha);
                pstmt.setString(5, dir);
                pstmt.setString(6, telf);
                pstmt.setInt(7,suel);               
                pstmt.executeUpdate();
                this.llenartabla();
                conn.close();
                activaBotones(true,false,false,false);
                limpiarObjetos();
                txtCodigo.setEnabled(true);
            } catch(SQLException e) {
                JOptionPane.showMessageDialog(null, "Error"+e.toString());
            }
        }
}//GEN-LAST:event_btnModificarActionPerformed

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed

        int resp;
        resp=JOptionPane.showConfirmDialog(null, "¿Desea Grabar el Registro?","Pregunta",0);
        if(resp==0) {
            try {
                conn=Main.Enlace(conn);
                st=Main.sta(st);
                rs=Main.EnlEmpleado(rs);
                String nom,ap,dir,telf,suel,f;
                Date fecha;
                nom=txtNombre.getText();
                ap=txtapellidos.getText();
                f=txtNacimineto.getText();
                fecha=Date.valueOf(f);
                dir=txtDirec.getText();
                telf=txtTelef.getText();
                suel=txtsueldo.getText();
                
                PreparedStatement pstmt=conn.prepareStatement("{CALL sp_grabaEmpleado(?,?,?,?,?,?)}");
                pstmt.setString(1, ap);
                pstmt.setString(2, nom);
                pstmt.setDate(3, fecha);
                pstmt.setString(4, dir);
                pstmt.setString(5, telf);
                pstmt.setString(6, telf);
                pstmt.executeUpdate();
                this.llenartabla();
                conn.close();
                activaBotones(true,false,false,false);
                limpiarObjetos();
                txtCodigo.setEnabled(true);
            } catch(SQLException e) {
                JOptionPane.showMessageDialog(null, "Error"+e.toString());
            }
        }
}//GEN-LAST:event_btnGrabarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        int resp;
        resp=JOptionPane.showConfirmDialog(null, "¿Desea Cancelar el Proceso?","Pregunta",0);
        if(resp==0) {
            limpiarObjetos();
            txtCodigo.setEnabled(true);
            activaBotones(true,false,false,false);
        }
}//GEN-LAST:event_btnCancelarActionPerformed

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
            try {
            setSize(900,600);
              int f, i;
            conn=Main.Enlace(conn);
            rs=Main.EnlEmpleado(rs);
            String datos[]=new String[7];
            f=dtm.getRowCount();
            if(f>0)
                for(i=0;i<f;i++)
                    dtm.removeRow(0);
            while(rs.next()){
                    datos[0]=(String)rs.getString(1);
                    datos[1]=(String)rs.getString(2);
                    datos[2]=(String)rs.getString(3);
                    datos[3]=(String)rs.getString(4);
                    datos[4]=(String)rs.getString(5);
                    datos[5]=(String)rs.getString(6);
                    datos[6]=(String)rs.getString(7);
                    
                    dtm.addRow(datos);
            }} catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en BD"+e.toString());
        }
}//GEN-LAST:event_btnVerActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MantEmpleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaEmpleados;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnVer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDirec;
    private javax.swing.JTextField txtNacimineto;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelef;
    private javax.swing.JTextField txtapellidos;
    private javax.swing.JTextField txtsueldo;
    // End of variables declaration//GEN-END:variables

}
