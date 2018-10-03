
package tiendaproyecto;

import java.io.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;
import tiendaproyecto.*;

public class Venta extends javax.swing.JFrame {

    static Connection conn=null;
    static Statement st=null;
    static ResultSet rs=null;
    static ResultSet rs1=null;
    static ResultSet rs2=null;
 
    DefaultTableModel dtm1=new DefaultTableModel();
   
    DefaultComboBoxModel dcbm1=new DefaultComboBoxModel ();
    DefaultComboBoxModel dcbm2=new DefaultComboBoxModel ();
  
    /** Creates new form Venta */
    public Venta() {
        initComponents();
       setSize(1050,600);
       setLocation(50,100);    
     String titulos[]={"IDventa","Cliente","Fecha","Total","Empleado"};
        dtm1.setColumnIdentifiers(titulos);
       
        tablaventa.setModel(dtm1);
     
        cbocliente.setModel(dcbm1);
        cbEmpleados.setModel(dcbm2);

        try
        {
        conn=Main.Enlace(conn);
        rs=Main.VerCliente(rs);
        while(rs.next())
            {
                dcbm1.addElement((String)rs.getString(1));

            }
        rs=Main.VerEmpleado(rs);
        while(rs.next())
            {
                dcbm2.addElement((String)rs.getString(1));    }
        }
     catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error"+e.getMessage());
        }
    }
    
    public void limpiarlistas()
    {
      txtidventa.setText("");
    cbocliente.setSelectedIndex(0);
    txtFecha.setText("");
    txttotal.setText("");
    cbEmpleados.setSelectedIndex(0);
    }
    

      public void activaBotones(boolean n, boolean e)
    {
          btneliminar.setEnabled(e);

    }
      public void llenartabla()
    {
 try
            {
            int f, i;
            conn=Main.Enlace(conn);
            rs=Main.EnlVenta(rs);
            String datos[]=new String[5];
            f=dtm1.getRowCount();
            if(f>0)
                for(i=0;i<f;i++)
                    dtm1.removeRow(0);
            while(rs.next())
                    {
                    datos[0]=(String)rs.getString(1);
                    datos[1]=(String)rs.getString(2);
                    datos[2]=(String)rs.getString(3);
                    datos[3]=(String)rs.getString(4);
                    datos[4]=(String)rs.getString(5);

                    dtm1.addRow(datos);
                   }}
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error en BD"+e.toString());
        }

      }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        cbEmpleados = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        btnCliente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtidventa = new javax.swing.JTextField();
        cbocliente = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        btnCerrar = new javax.swing.JButton();
        btnbusqueda = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnver = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaventa = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(19, 118, 237));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ventas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 11))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Empleado:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, -1, -1));

        jLabel7.setText("Cliente:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));
        jPanel1.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, 170, -1));

        cbEmpleados.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccinar:" }));
        jPanel1.add(cbEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 170, -1));

        jLabel18.setText("Fecha de Venta:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, -1, -1));

        btnCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo.GIF"))); // NOI18N
        btnCliente.setText("Ver los clientes");
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, -1, -1));

        jLabel1.setText("IDVENTA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));
        jPanel1.add(txtidventa, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 130, -1));

        cbocliente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cbocliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 170, -1));

        jLabel3.setText("TOTAL");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, -1, -1));
        jPanel1.add(txttotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 90, -1));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar.gif"))); // NOI18N
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, -1, -1));

        btnbusqueda.setText("Busqueda");
        btnbusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbusquedaActionPerformed(evt);
            }
        });
        jPanel1.add(btnbusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));

        jPanel5.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 710, 190));

        jPanel4.setBackground(new java.awt.Color(29, 86, 242));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar.gif"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel4.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, -1, -1));

        btnver.setText("Ver Lista");
        btnver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnverActionPerformed(evt);
            }
        });
        jPanel4.add(btnver, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        jPanel4.add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        jPanel5.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 710, 50));

        tablaventa.setBackground(new java.awt.Color(0, 159, 255));
        tablaventa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "IDventa", "Cliente", "Fecha", "Total", "Empleado"
            }
        ));
        jScrollPane1.setViewportView(tablaventa);

        jScrollPane2.setViewportView(jScrollPane1);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 680, 190));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
int resp;
        resp=JOptionPane.showConfirmDialog(null, "¿Desea Cancelar el Proceso?","Pregunta",0);
        if(resp==0) {
            limpiarlistas();
            txtidventa.setEnabled(true);
            activaBotones(true,false);
        }
      
            
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        
        new Mantclientes().setVisible(true);
    }//GEN-LAST:event_btnClienteActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        MenuPrincipal mn=new MenuPrincipal();
        mn.show();
        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnverActionPerformed
    try
            {
            setSize(810,600);
            int f, i;
            conn=Main.Enlace(conn);
            rs=Main.EnlVenta(rs);
            String datos[]=new String[5];
            f=dtm1.getRowCount();
            if(f>0)
                for(i=0;i<f;i++)
                    dtm1.removeRow(0);
            while(rs.next())
                    {
                    datos[0]=(String)rs.getString(1);
                    datos[1]=(String)rs.getString(2);
                    datos[2]=(String)rs.getString(3);
                    datos[3]=(String)rs.getString(4);
                    datos[4]=(String)rs.getString(5);
                    dtm1.addRow(datos);
                    }  }
        catch(SQLException e)
        { JOptionPane.showMessageDialog(null, "Error en BD"+e.toString());        }

    }//GEN-LAST:event_btnverActionPerformed

    private void btnbusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbusquedaActionPerformed
       String b, ca, m;
        if(btnver.isEnabled())
            {
                try
                    {
                        conn=Main.Enlace(conn);
                        rs=Main.EnlVenta(rs);/*en la variable rs se almacenará los datos provenientes de la
                                                tabla venta*/
                        b=txtidventa.getText();/*En la variable b se coloca el valor ingresado en el cuadro de texto
                                                txtidventa*/
                        ca=(String)cbocliente.getSelectedItem();
                        m=(String)cbEmpleados.getSelectedItem();
                        boolean encuentra=false;
                        while(rs.next())          /*con el método next se logra desplazar a través de los
                                            registros de datos para ir llenando los objetos de Jlist*/
                            {
                                if(b.equals(rs.getString(1)))
                                    {
                                    ca=(String)rs.getString(2);
                                    cbocliente.setSelectedItem(ca);
                                    txtFecha.setText((String)rs.getString(3));
                                    txttotal.setText((String)rs.getString(4));
                                    m=(String)rs.getString(5);
                                    cbEmpleados.setSelectedItem(m);
                                    
                                   
                                                                      
                                    this.activaBotones(true, true);
                                        encuentra=true;
                                        break;
                                    }
                            }
                        if(encuentra==false)
                            {
                            limpiarlistas();
                                txtidventa.setText("No existe");                                
                                txtidventa.requestFocus();
                            }
                    }
                catch(SQLException e)
                    {
                       JOptionPane.showMessageDialog(null, "Error BD"+e.getMessage());
                    }
            }
    }//GEN-LAST:event_btnbusquedaActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
int resp;
        resp=JOptionPane.showConfirmDialog(null, "¿Desea Eliminar el Registro?","Pregunta",0);
        if(resp==0) {
            try {
                conn=Main.Enlace(conn);
                st=Main.sta(st);
                rs=Main.EnlProducto(rs);
                String cod;
                cod=txtidventa.getText();
                PreparedStatement pstmt=conn.prepareStatement("{call sp_eliminaVenta(?)}");/**----observacion***--//sesion08*/
                pstmt.setString(1, cod);
                pstmt.executeUpdate();
                this.llenartabla();
                conn.close();
                activaBotones(true,false);
                limpiarlistas();
            } catch(SQLException e) {
                JOptionPane.showMessageDialog(null, "Error"+e.toString());
            }
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Venta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnbusqueda;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnver;
    private javax.swing.JComboBox cbEmpleados;
    private javax.swing.JComboBox cbocliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaventa;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtidventa;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables

}
