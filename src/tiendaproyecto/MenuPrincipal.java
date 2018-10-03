
package tiendaproyecto;
import javax.swing.*;
public class MenuPrincipal extends javax.swing.JFrame {
    public MenuPrincipal() {
        initComponents();
        this.setSize(400,310);
        this.setLocation(500,5);
        this.setResizable(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        sto = new javax.swing.JMenu();
        Salir = new javax.swing.JMenuItem();
        Mantenimiento = new javax.swing.JMenu();
        Empleados = new javax.swing.JMenuItem();
        Categoria = new javax.swing.JMenuItem();
        Marcas = new javax.swing.JMenuItem();
        Productos = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        Clientes = new javax.swing.JMenuItem();
        Venta = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jmnDs = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(new javax.swing.border.MatteBorder(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tienda.jpg")))); // NOI18N
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 360));

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));

        sto.setText("Archivo");
        sto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stoActionPerformed(evt);
            }
        });

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        sto.add(Salir);

        jMenuBar1.add(sto);

        Mantenimiento.setText("Mantenimiento");

        Empleados.setText("Empleado");
        Empleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpleadosActionPerformed(evt);
            }
        });
        Mantenimiento.add(Empleados);

        Categoria.setText("Categoria");
        Categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriaActionPerformed(evt);
            }
        });
        Mantenimiento.add(Categoria);

        Marcas.setText("Marcas");
        Marcas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarcasActionPerformed(evt);
            }
        });
        Mantenimiento.add(Marcas);

        Productos.setText("Productos");
        Productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductosActionPerformed(evt);
            }
        });
        Mantenimiento.add(Productos);

        jMenuBar1.add(Mantenimiento);

        jMenu2.setText("Procesos");

        Clientes.setText("Nuevo Cliente");
        Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientesActionPerformed(evt);
            }
        });
        jMenu2.add(Clientes);

        Venta.setText("Venta");
        Venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentaActionPerformed(evt);
            }
        });
        jMenu2.add(Venta);

        jMenuBar1.add(jMenu2);

        jmnDs.setText("Desarrollado por..");
        jmnDs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnDsActionPerformed(evt);
            }
        });
        jMenu1.add(jmnDs);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientesActionPerformed
      
        new Mantclientes().setVisible(true);
        dispose();
}//GEN-LAST:event_ClientesActionPerformed

    private void VentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VentaActionPerformed
        // TODO add your handling code here:
        new Venta().setVisible(true);
        dispose();
}//GEN-LAST:event_VentaActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
         dispose();
}//GEN-LAST:event_SalirActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
      
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jmnDsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnDsActionPerformed
  
    }//GEN-LAST:event_jmnDsActionPerformed

    private void stoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stoActionPerformed
        
    }//GEN-LAST:event_stoActionPerformed

    private void ProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductosActionPerformed
        // TODO add your handling code here:
        new MantProducto().setVisible(true);
        dispose();
}//GEN-LAST:event_ProductosActionPerformed

    private void MarcasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarcasActionPerformed
        // TODO add your handling code here
        new MantMarcas().setVisible(true);
        dispose();
}//GEN-LAST:event_MarcasActionPerformed

    private void CategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoriaActionPerformed
        
        new MantCategoria().setVisible(true);
        dispose();
}//GEN-LAST:event_CategoriaActionPerformed

    private void EmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpleadosActionPerformed
        
        new MantEmpleados().setVisible(true);
        dispose();
}//GEN-LAST:event_EmpleadosActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Categoria;
    private javax.swing.JMenuItem Clientes;
    private javax.swing.JMenuItem Empleados;
    private javax.swing.JMenu Mantenimiento;
    private javax.swing.JMenuItem Marcas;
    private javax.swing.JMenuItem Productos;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JMenuItem Venta;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem jmnDs;
    private javax.swing.JMenu sto;
    // End of variables declaration//GEN-END:variables

}
