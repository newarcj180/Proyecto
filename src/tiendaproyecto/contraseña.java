
package tiendaproyecto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.ImageIcon;
public class contraseña extends javax.swing.JFrame {

    public contraseña() {
        initComponents();
        this.setSize(350,400);
        this.setLocation(360,5);
        jtxtUsuario.requestFocus();
        jpPassword.setEnabled(true);
    }
int a;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxtUsuario = new javax.swing.JTextField();
        jpPassword = new javax.swing.JPasswordField();
        jbtnIngreso = new javax.swing.JButton();
        jbtnSalir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBorder(new javax.swing.border.MatteBorder(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.jpg")))); // NOI18N
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("USUARIO:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 60, 90, 14);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("CONTRASEÑA");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 110, 100, 14);

        jtxtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtUsuario);
        jtxtUsuario.setBounds(100, 60, 130, 20);

        jpPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(jpPassword);
        jpPassword.setBounds(100, 110, 130, 20);

        jbtnIngreso.setText("INGRESO");
        jbtnIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnIngresoActionPerformed(evt);
            }
        });
        jbtnIngreso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtnIngresoKeyPressed(evt);
            }
        });
        jPanel1.add(jbtnIngreso);
        jbtnIngreso.setBounds(70, 260, 90, 23);

        jbtnSalir.setText("SALIR");
        jbtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnSalir);
        jbtnSalir.setBounds(200, 260, 70, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 40, 360, 300);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("ADMINISTRADORES");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(100, 10, 220, 22);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 360, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtUsuarioActionPerformed
        String usuario;
        usuario=jtxtUsuario.getText();
        JOptionPane.showMessageDialog(null,"Bienvenido ");
        if(usuario.equals("alumno")) {
           
            JOptionPane.showMessageDialog(null,"PorFavor Ingrese su Codigo de AuToriZacion");
            
            jpPassword.requestFocusInWindow();
            jpPassword.setEnabled(true);
            
        }  else {
            JOptionPane.showMessageDialog(null,"Usted no esta autorizado para usar este sistema");
            jtxtUsuario.setText("");
            jtxtUsuario.setEnabled(false);
            jbtnSalir.requestFocusInWindow();
        }
}//GEN-LAST:event_jtxtUsuarioActionPerformed

    private void jpPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpPasswordActionPerformed
        String contraseña;
        contraseña=String.valueOf(jpPassword.getPassword());
        String usuario;
        usuario=jtxtUsuario.getText();
        int cont=0;
       
            if(contraseña.equals("1234")) {
                jbtnIngreso.requestFocusInWindow();
                JOptionPane.showMessageDialog(null,"**BienVenido al sistema**");
                }
        else {
                JOptionPane.showMessageDialog(null,"Vuela a intentar");
                jpPassword.setText("");
                jpPassword.requestFocusInWindow();
             } 
        
}//GEN-LAST:event_jpPasswordActionPerformed

    private void jbtnIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnIngresoActionPerformed

         String contraseña;
        contraseña=String.valueOf(jpPassword.getPassword());
        String usuario;
        usuario=jtxtUsuario.getText();
        int cont=0;
        if(usuario.equals("alumno")&& contraseña.equals("1234")) {
            MenuPrincipal M =new MenuPrincipal();
        JOptionPane.showMessageDialog(null,"**Bienvenido al Sistema**");
        JOptionPane.showMessageDialog(null,"Esta accediendo al Menu Principal");
        M.setVisible(true);
        dispose();
             }
             
        
           else {
                JOptionPane.showMessageDialog(null,"Vuela a intentar");
                jpPassword.setText("");
                jpPassword.requestFocusInWindow();
            }      
              

        
}//GEN-LAST:event_jbtnIngresoActionPerformed

    private void jbtnIngresoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnIngresoKeyPressed
        MenuPrincipal M=new MenuPrincipal();
        JOptionPane.showMessageDialog(null,"**Bienvenido al Sistema**");
        JOptionPane.showMessageDialog(null,"Esta accediendo al Menu Principal");
        M.setVisible(true);
        dispose();
}//GEN-LAST:event_jbtnIngresoKeyPressed

    private void jbtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalirActionPerformed
        a=JOptionPane.showConfirmDialog(null,"Desea continuar con la salida","***Aviso***",JOptionPane.YES_NO_OPTION);
        if(a==JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null,"Gracias");
            dispose();
        }
}//GEN-LAST:event_jbtnSalirActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new contraseña().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbtnIngreso;
    private javax.swing.JButton jbtnSalir;
    private javax.swing.JPasswordField jpPassword;
    private javax.swing.JTextField jtxtUsuario;
    // End of variables declaration//GEN-END:variables

}
