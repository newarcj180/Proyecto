package tiendaproyecto;
import java.io.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;
import tiendaproyecto.*;
public class Mantclientes extends javax.swing.JFrame {

    static Connection conn=null;
    static Statement st=null;
    static ResultSet rs=null;

    DefaultTableModel dtm=new DefaultTableModel();
/*creamos el codigo constructor para el formulario de clientes*/
    public Mantclientes() {
        initComponents();
        activaBotones(true,false,false,false);
        String titulos[]={"Codigo","Nombres","Apellidos","Razon Social","Direccion","Telefono","RUC"};
        dtm.setColumnIdentifiers(titulos);
        TablaCliente.setModel(dtm);
        setSize(700,570);
        setLocation(180,100);
        this.setResizable(false);
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
    txtNombre.setText("");
    txtApellidos.setText("");
    txtCodigo.setText("");
    txtRuc.setText("");
    txtTelef.setText("");
    txtRS.setText("");
    txtDireccion.setText("");
    }
    public void llenartabla()
    {
try
            {
            setSize(700,600);
            int f, i;
            conn=Main.Enlace(conn);
            rs=Main.EnlCliente(rs);
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

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtRuc = new javax.swing.JTextField();
        txtTelef = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtRS = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnGrabar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnVer = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaCliente = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 194, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CLIENTE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 18))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Nombres:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel3.setText("Apellidos");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel5.setText("CODIGO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel6.setText("RUC:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel8.setText("Telefono:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 270, -1));
        jPanel1.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 270, -1));
        jPanel1.add(txtRuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 170, -1));
        jPanel1.add(txtTelef, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 140, -1));
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 130, -1));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.gif"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 120, -1));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar.gif"))); // NOI18N
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 100, -1));

        jLabel1.setText("Razon Social");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));
        jPanel1.add(txtRS, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 270, -1));

        jLabel4.setText("Direccion");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 270, -1));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 470, 250));

        jPanel2.setBackground(new java.awt.Color(153, 192, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo.GIF"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel2.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar.gif"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel2.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.gif"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        btnGrabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/grabar.gif"))); // NOI18N
        btnGrabar.setText("Grabar");
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });
        jPanel2.add(btnGrabar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar.gif"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        btnVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/VER.gif"))); // NOI18N
        btnVer.setText("Ver Lista");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });
        jPanel2.add(btnVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 150, 260));

        TablaCliente.setBackground(new java.awt.Color(153, 202, 255));
        TablaCliente.setForeground(new java.awt.Color(255, 255, 51));
        TablaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombres", "Apellidos", "Razon Social", "Direccion", "Telefono", "RUC"
            }
        ));
        jScrollPane2.setViewportView(TablaCliente);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 670, 100));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 570));

        getAccessibleContext().setAccessibleName("Mantenimiento de cliente ===== Christian");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
     
        int resp;
        resp=JOptionPane.showConfirmDialog(null, "¿Desea Eliminar el Registro?","Pregunta",0);
        if(resp==0)
            {
            try
                {
                conn=Main.Enlace(conn);
                st=Main.sta(st);
                rs=Main.EnlCliente(rs);
                int cod;
                cod=Integer.parseInt(txtCodigo.getText());
                PreparedStatement pstmt=conn.prepareStatement("{call sp_eliminaCliente(?)}");
                pstmt.setInt(1, cod);
                pstmt.executeUpdate();
                this.llenartabla();
                conn.close();
                activaBotones(true,false,false,false);
                limpiarObjetos();
                }
            catch(SQLException e)
                {
                JOptionPane.showMessageDialog(null, "Error"+e.toString());
                }
            }
}//GEN-LAST:event_btnEliminarActionPerformed

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        // TODO add your handling code here:
        try
            {
            setSize(700,600);
            int f, i;
            conn=Main.Enlace(conn);
            rs=Main.EnlCliente(rs);
            String datos[]=new String[7];
            f=dtm.getRowCount();
            if(f>0)
                for(i=0;i<f;i++)
                    dtm.removeRow(0);
            while(rs.next())
                    {
                    datos[0]=(String)rs.getString(1);
                    datos[1]=(String)rs.getString(2);
                    datos[2]=(String)rs.getString(4);
                    datos[3]=(String)rs.getString(3);
                    datos[4]=(String)rs.getString(5);
                    datos[5]=(String)rs.getString(6);
                    datos[6]=(String)rs.getString(7);
                    dtm.addRow(datos);
                    }}
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error en BD"+e.toString());
        }
    }//GEN-LAST:event_btnVerActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String b, f;
        if(btnNuevo.isEnabled())
            {try{
                        conn=Main.Enlace(conn);
                        rs=Main.EnlCliente(rs);
                        b=txtCodigo.getText();
                        boolean encuentra=false;
                        while(rs.next())
                            {if(b.equals(rs.getString(1)))
                                    {
                                    txtNombre.setText((String)rs.getString(2));
                                    txtApellidos.setText((String)rs.getString(3));
                                    txtRS.setText((String)rs.getString(4));
                                    txtDireccion.setText((String)rs.getString(5));
                                    txtTelef.setText((String)rs.getString(6));
                                    txtRuc.setText((String)rs.getString(7));                                    
                                    this.activaBotones(true, true, true, false);
                                        encuentra=true;
                                        break;
                                    }}
                        if(encuentra==false)
                            {   txtCodigo.setText("No existe");
                                txtCodigo.requestFocus();
                            }}
                catch(SQLException e)
                    {
                       JOptionPane.showMessageDialog(null, "Error BD"+e.getMessage());
                    }}
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed

        limpiarObjetos();
        txtCodigo.setEnabled(false);
        txtNombre.requestFocus();
        activaBotones(false,false,false,true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        int resp;
        resp=JOptionPane.showConfirmDialog(null, "¿Desea Grabar el Registro?","Pregunta",0);
        if(resp==0){try{
                conn=Main.Enlace(conn);
                st=Main.sta(st);
                rs=Main.EnlCliente(rs);
                String nom,ap,cod,ruc,telf,RS,dir;
                nom=txtNombre.getText();
                ap=txtApellidos.getText();
                cod=txtCodigo.getText();
                ruc=txtRuc.getText();
                telf=txtTelef.getText();
                RS=txtRS.getText();
                dir=txtDireccion.getText();
                PreparedStatement pstmt=conn.prepareStatement("{CALL sp_grabaCliente(?,?,?,?,?,?)}");
               
                pstmt.setString(1, nom);
                pstmt.setString(2, ap);
                pstmt.setString(3, RS);
                pstmt.setString(4, dir);
                pstmt.setString(5, telf);
                pstmt.setString(6, ruc);
                pstmt.executeUpdate();
                this.llenartabla();
                conn.close();
                activaBotones(true,false,false,false);
                limpiarObjetos();
                txtCodigo.setEnabled(true);
                }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Error"+e.toString()); }}
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        int resp;
        resp=JOptionPane.showConfirmDialog(null, "¿Desea Modidicar el Registro?","Pregunta",0);
        if(resp==0){try{
                conn=Main.Enlace(conn);
                st=Main.sta(st);
                rs=Main.EnlCliente(rs);
                String nom,ap,ruc,telf,RS,dir;
                int cod;
                cod=Integer.parseInt(txtCodigo.getText());
                ruc=txtRuc.getText();
                nom=txtNombre.getText();
                ap=txtApellidos.getText();
                telf=txtTelef.getText();
                RS=txtRS.getText();
                dir=txtDireccion.getText();
                PreparedStatement pstmt=conn.prepareStatement("{CALL sp_modificaCliente(?,?,?,?,?,?,?)}");
                pstmt.setInt(1, cod);
                pstmt.setString(2, nom);
                pstmt.setString(3,ap);
                pstmt.setString(4,RS);
                pstmt.setString(5,dir);
                pstmt.setString(6, telf);
                pstmt.setString(7, ruc);
                
                pstmt.executeUpdate();
                this.llenartabla();
                conn.close();
                activaBotones(true,false,false,false);
                limpiarObjetos();
                txtCodigo.setEnabled(true);
                } catch(SQLException e) {JOptionPane.showMessageDialog(null, "Error"+e.toString());}}
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        int resp;
        resp=JOptionPane.showConfirmDialog(null, "¿Desea Cancelar el Proceso?","Pregunta",0);
        if(resp==0)
            {
                limpiarObjetos();
                txtCodigo.setEnabled(true);
                activaBotones(true,false,false,false);
            }
    }//GEN-LAST:event_btnCancelarActionPerformed
    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        MenuPrincipal mn=new MenuPrincipal();
        mn.show();
        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

     public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mantclientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaCliente;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnVer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRS;
    private javax.swing.JTextField txtRuc;
    private javax.swing.JTextField txtTelef;
    // End of variables declaration//GEN-END:variables

}
