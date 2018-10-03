
package tiendaproyecto;
import java.io.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;
import tiendaproyecto.*;

public class MantProducto extends javax.swing.JFrame {

    static Connection conn=null;
    static Statement st=null;
    static ResultSet rs=null;
     static ResultSet rs1=null;
     static ResultSet rs2=null;
    
    DefaultTableModel dtm=new DefaultTableModel();
    DefaultComboBoxModel dcbm1=new DefaultComboBoxModel ();
    DefaultComboBoxModel dcbm2=new DefaultComboBoxModel ();
    public MantProducto() {
        initComponents();
   
        String titulos[]={"Código","Artefacto","Cantidad","Modelo","Marca"};
        dtm.setColumnIdentifiers(titulos);
        TablaProductos.setModel(dtm);
        cboCategoria.setModel(dcbm1);
        cboMarca.setModel(dcbm2);

        setSize(800,540);
        setLocation(180,100);
        this.setResizable(false);
            try
        {
        conn=Main.Enlace(conn);
        rs=Main.VerCategoria(rs);
        while(rs.next())
            {
                dcbm1.addElement((String)rs.getString(1));

            }
        rs=Main.VerMarca(rs);
        while(rs.next())
            {
                dcbm2.addElement((String)rs.getString(1));    }      
        }
     catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error"+e.getMessage());
        }
    }


     public void activaBotones(boolean n, boolean e, boolean m, boolean g)
    {
       btnNuevo.setEnabled(n);
       btnEliminar.setEnabled(e);
       btnModificar.setEnabled(m);
       btnGrabar.setEnabled(g);
    }

    public void limpiarObjetos()
    {
    txtCodigo.setText("");
    cboCategoria.setSelectedIndex(0);
    txtCantidad.setText("");
    txtModelo.setText("");
    cboMarca.setSelectedIndex(0);
     }

    public void llenartabla()
    {
 try
            {
            int f, i;
            conn=Main.Enlace(conn);
            rs=Main.EnlProducto(rs);
            String datos[]=new String[5];
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
                                    
                    dtm.addRow(datos);
                   }}
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error en BD"+e.toString());
        }}
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        cboCategoria = new javax.swing.JComboBox();
        cboMarca = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnGrabar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnVer = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaProductos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PRODUCTO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 18), new java.awt.Color(153, 0, 153))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Codigo de Producto:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel3.setText("Cantidad:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel7.setText("Categoria:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel8.setText("Marca:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, -1, -1));
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 150, -1));
        jPanel1.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 140, -1));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.gif"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, -1));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar.gif"))); // NOI18N
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, -1, 20));

        cboCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar" }));
        jPanel1.add(cboCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 140, -1));

        cboMarca.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar" }));
        jPanel1.add(cboMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 140, -1));

        jLabel4.setText("Modelo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));
        jPanel1.add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 80, -1));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 550, 270));

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGrabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/grabar.gif"))); // NOI18N
        btnGrabar.setText("Grabar");
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });
        jPanel2.add(btnGrabar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 100, -1));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar.gif"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 110, -1));

        btnVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/VER.gif"))); // NOI18N
        btnVer.setText("Ver Lista");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });
        jPanel2.add(btnVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 110, -1));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.gif"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 90, -1));

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar.gif"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel2.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 100, -1));

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo.GIF"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel2.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 90, -1));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 140, 280));

        TablaProductos.setBackground(new java.awt.Color(0, 153, 153));
        TablaProductos.setForeground(new java.awt.Color(255, 255, 0));
        TablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Artefacto", "Marca", "Modelo", "Cantidad"
            }
        ));
        TablaProductos.setGridColor(new java.awt.Color(0, 204, 255));
        jScrollPane2.setViewportView(TablaProductos);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 670, 100));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
 String b, ca, u, m, pro;
        if(btnNuevo.isEnabled())
            {
                try
                    {
                        conn=Main.Enlace(conn);
                        rs=Main.EnlProducto(rs);/*en la variable rs se almacenará los datos provenientes de la
                                                tabla producto*/
                        b=txtCodigo.getText();/*En la variable b se coloca el valor ingresado en el cuadro de texto
                                                txtCodigo*/
                        ca=(String)cboCategoria.getSelectedItem();
                        m=(String)cboMarca.getSelectedItem();
                        boolean encuentra=false;
                        while(rs.next())          /*con el método next se logra desplazar a través de los
                                            registros de datos para ir llenando los objetos de Jlist*/
                            {
                                if(b.equals(rs.getString(1)))
                                    {
                                    ca=(String)rs.getString(2);
                                    cboCategoria.setSelectedItem(ca);
                                    m=(String)rs.getString(5);
                                    cboMarca.setSelectedItem(m);
                                    txtModelo.setText((String)rs.getString(4));
                                    txtCantidad.setText((String)rs.getString(3));
                                                                      
                                    this.activaBotones(true, true, true, false);
                                        encuentra=true;
                                        break;
                                    }
                            }
                        if(encuentra==false)
                            {
                                txtCodigo.setText("No existe");
                                txtCodigo.requestFocus();
                            }
                    }
                catch(SQLException e)
                    {
                       JOptionPane.showMessageDialog(null, "Error BD"+e.getMessage());
                    }
            }
}//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
     
        MenuPrincipal mn=new MenuPrincipal();
        mn.show();
        dispose();
}//GEN-LAST:event_btnCerrarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
      
        limpiarObjetos();
        txtCodigo.setEnabled(false);
        txtCodigo.requestFocus();
        activaBotones(false,false,false,true);
}//GEN-LAST:event_btnNuevoActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        
       int r;
        r=JOptionPane.showConfirmDialog(null, "¿Desea Modificar el Registro?","Pregunta",0);
        if(r==0) {
            try {
                conn=Main.Enlace(conn);
                st=Main.sta(st);
                rs=Main.EnlProducto(rs);
                String cod,nomcat,codcat="",nommar,codmar="",model;
                int cant;
                
                cod=txtCodigo.getText();
                
                cant=Integer.parseInt(txtCantidad.getText());
                model=txtModelo.getText();
                
                nomcat=(String)cboCategoria.getSelectedItem();
                rs1=Main.ObtenerCodCategoria(rs1, nomcat);
                 if(rs1.next())
                  codcat=rs1.getString(1);

                nommar=(String)cboMarca.getSelectedItem();
                rs2=Main.ObtenerCodMarca(rs2, nommar);
                 if(rs2.next())
                   codmar=rs2.getString(1);
                /*PreparedStatement permitirá hacer uso de los procedimientos almacenados*/
                PreparedStatement pstmt=conn.prepareStatement("{CALL sp_modificarProducto(?,?,?,?,?)}");
                pstmt.setString(1, cod);
                pstmt.setString(2, codcat); 
                pstmt.setString(3, codmar);
                pstmt.setString(4,model);
                pstmt.setInt(5, cant);         
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

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       
        int resp;
        resp=JOptionPane.showConfirmDialog(null, "¿Desea Eliminar el Registro?","Pregunta",0);
        if(resp==0) {
            try {
                conn=Main.Enlace(conn);
                st=Main.sta(st);
                rs=Main.EnlProducto(rs);
                String cod;
                cod=txtCodigo.getText();
                PreparedStatement pstmt=conn.prepareStatement("{call sp_eliminaProducto(?)}");
                pstmt.setString(1, cod);
                pstmt.executeUpdate();
                this.llenartabla();
                conn.close();
                activaBotones(true,false,false,false);
                limpiarObjetos();
            } catch(SQLException e) {
                JOptionPane.showMessageDialog(null, "Error"+e.toString());
            }
        }
}//GEN-LAST:event_btnEliminarActionPerformed

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
 
    int resp;
        resp=JOptionPane.showConfirmDialog(null, "¿Desea Grabar el Registro?","Pregunta",0);
        if(resp==0) {
            try {
                conn=Main.Enlace(conn);
                st=Main.sta(st);
                rs=Main.EnlProducto(rs);
                String Model,cod,nomc,codcat="",nommar,codmar="";
                int cant;
                Double precio;
                cod=txtCodigo.getText();
                cant=Integer.parseInt(txtCantidad.getText());
                Model=txtModelo.getText();

                nomc=(String)cboCategoria.getSelectedItem();
                rs1=Main.ObtenerCodCategoria(rs1, nomc);
                 if(rs1.next())
                  codcat=rs1.getString(1);
                nommar=(String)cboMarca.getSelectedItem();
                rs2=Main.ObtenerCodMarca(rs2, nommar);
                 if(rs2.next())
                   codmar=rs2.getString(1);
                /*PreparedStatement 
Este componente permitirá hacer uso de los procedimientos almacenados*/
                PreparedStatement pstmt=conn.prepareStatement("{CALL sp_grabaProducto(?,?,?,?)}");
                pstmt.setString(1, codcat);
                pstmt.setString(2, codmar);
                pstmt.setString(3, Model);
                pstmt.setInt(4, cant);
                
                
                pstmt.executeUpdate();
                this.llenartabla();
                conn.close();   /*se procede a cerrar la conexión con el método close del objeto connection
                                conn*/
                activaBotones(true,false,false,false);
                limpiarObjetos();
                txtCodigo.setEnabled(true);
            } catch(SQLException e) {
                JOptionPane.showMessageDialog(null, "Error"+e.toString());  }  }
}//GEN-LAST:event_btnGrabarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
       
          int resp;
        resp=JOptionPane.showConfirmDialog(null, "¿Desea Cancelar el Proceso?","Pregunta",0);
        if(resp==0) {
            limpiarObjetos();
            txtCodigo.setEnabled(true);
            activaBotones(true,false,false,false);
        }
}//GEN-LAST:event_btnCancelarActionPerformed

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
       
        try
            {
             setSize(800,540);
            int f, i;
            conn=Main.Enlace(conn);
            rs=Main.EnlProducto(rs);
            String datos[]=new String[5];
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
                    dtm.addRow(datos);
                    }  }
        catch(SQLException e)
        { JOptionPane.showMessageDialog(null, "Error en BD"+e.toString());        }        
}//GEN-LAST:event_btnVerActionPerformed

   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MantProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaProductos;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnVer;
    private javax.swing.JComboBox cboCategoria;
    private javax.swing.JComboBox cboMarca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtModelo;
    // End of variables declaration//GEN-END:variables

}
