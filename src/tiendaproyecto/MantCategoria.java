
package tiendaproyecto;
import java.io.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;
import tiendaproyecto.*;

public class MantCategoria extends javax.swing.JFrame {

    static Connection conn=null;
    static Statement st=null;
    static ResultSet rs=null;
    
    DefaultTableModel dtm=new DefaultTableModel();
    /** Creates new form MantCategoria */
    public MantCategoria() {
        initComponents();
        activaBotones(true,false,false,false);
        String titulos[]={"Código","Nombre de Categoria"};
        dtm.setColumnIdentifiers(titulos);
        TablaCategoria.setModel(dtm);
        setSize(880,582);
        setLocation(180,100);
        this.setResizable(false);
    }
    
    public void activaBotones(boolean n, boolean e, boolean m, boolean g)
    {
       btnNuevo.setEnabled(n);
       
       btnModificar.setEnabled(m);
       btnGrabar.setEnabled(g);
    }
    
     public void limpiarObjetos()
    {
    txtCodigo.setText("");
    txtDescripcion.setText("");
    }

    public void llenartabla()
    {
 try
            {
            int f, i;
            conn=Main.Enlace(conn);
            rs=Main.EnlCategoria(rs);
            String datos[]=new String[2];
            f=dtm.getRowCount();
            if(f>0)
                for(i=0;i<f;i++)
                    dtm.removeRow(0);
            while(rs.next())
                    {
                    datos[0]=(String)rs.getString(1);
                    datos[1]=(String)rs.getString(2);
                    dtm.addRow(datos);

                    }
            }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error en BD"+e.toString());
        }
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        btnVer = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaCategoria = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnGrabar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CATEGORIA");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 189));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Categoria", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 11))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Codigo de Categoria:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        jLabel2.setText("Descripcion:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));
        jPanel1.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 270, -1));
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 150, -1));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.gif"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 160, -1));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar.gif"))); // NOI18N
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 160, -1));

        btnVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/VER.gif"))); // NOI18N
        btnVer.setText("Ver Lista");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });
        jPanel1.add(btnVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 160, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 550, 190));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablaCategoria.setBackground(new java.awt.Color(255, 153, 192));
        TablaCategoria.setForeground(new java.awt.Color(255, 255, 0));
        TablaCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "                              Codigo", "Nombre Categoria"
            }
        ));
        jScrollPane2.setViewportView(TablaCategoria);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 480, 170));

        jPanel2.setBackground(new java.awt.Color(255, 153, 192));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo.GIF"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel2.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, -1));

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar.gif"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel2.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 110, -1));

        btnGrabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/grabar.gif"))); // NOI18N
        btnGrabar.setText("Grabar");
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });
        jPanel2.add(btnGrabar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 110, -1));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar.gif"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 110, -1));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, 140, 180));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        String b, f;
        if(btnNuevo.isEnabled()) {
            try {
                conn=Main.Enlace(conn);
                rs=Main.EnlCategoria(rs);
                b=txtCodigo.getText();
                boolean encuentra=false;
                while(rs.next()) {
                    if(b.equals(rs.getString(1))) {
                        txtDescripcion.setText((String)rs.getString(2));
                        this.activaBotones(true, true, true, false);
                        encuentra=true;
                        break;
                    }
                }
                if(encuentra==false) {
                    txtCodigo.setText("No existe");
                    txtCodigo.requestFocus();
                }
            } catch(SQLException e) {
                JOptionPane.showMessageDialog(null, "Error BD"+e.getMessage());
            }
        }
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
        txtCodigo.setEnabled(true);
        txtDescripcion.requestFocus();
        activaBotones(false,false,false,true);
}//GEN-LAST:event_btnNuevoActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        int resp;
        resp=JOptionPane.showConfirmDialog(null, "¿Desea Modidicar el Registro?","Pregunta",0);
        if(resp==0) {
            try {
                conn=Main.Enlace(conn);
                st=Main.sta(st);
                rs=Main.EnlCategoria(rs);
                String cod,des;
                cod=txtCodigo.getText();
                des=txtDescripcion.getText();
                PreparedStatement pstmt=conn.prepareStatement("{CALL sp_modificaCategoria(?,?)}");
                pstmt.setString(1, cod);
                pstmt.setString(2, des);
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
                rs=Main.EnlCategoria(rs);
                String cod,des;
                cod=txtCodigo.getText();
                des=txtDescripcion.getText();
                PreparedStatement pstmt=conn.prepareStatement("{CALL sp_grabaCategoria(?,?)}");
                pstmt.setString(1,cod);
                pstmt.setString(2, des);
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
        // TODO add your handling code here:
        try {
           setSize(880,582);
            int f, i;
            conn=Main.Enlace(conn);
            rs=Main.EnlCategoria(rs);
            String datos[]=new String[2];
            f=dtm.getRowCount();
            if(f>0)
                for(i=0;i<f;i++)
                    dtm.removeRow(0);
            while(rs.next()) {
                datos[0]=(String)rs.getString(1);
                datos[1]=(String)rs.getString(2);
                dtm.addRow(datos);

            }
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en BD"+e.toString());
        }
}//GEN-LAST:event_btnVerActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MantCategoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaCategoria;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnVer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescripcion;
    // End of variables declaration//GEN-END:variables

}
