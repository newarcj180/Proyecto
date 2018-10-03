/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package reportes;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import tiendaproyecto.Main;

/**
 *
 * @author Bill Gate
 */
public class AdminReportes {
    
    private static Connection conn=null;
    private static Statement st=null;
    private static ResultSet rs=null;
    
    public static void startReporte(String ruta, String parametro)
    {
        
        try
        {
            conn=(Connection) Main.Enlace(conn);
            conn.setAutoCommit(false);
        }
        catch (SQLException ex)
        {
            //Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

        try
        {
            Map parametros = new HashMap();
            parametros.put(" ",parametro);
            //JasperReport reporte = (JasperReport) JRLoader.loadObject(pathReporte);
            JasperPrint muestra = JasperFillManager.fillReport(ruta, null, conn);
            JasperViewer.viewReport(muestra,false);
        }
        catch(Exception e)
        {
            e.printStackTrace();
            //System.out.println("****"+e.getMessage());
        }
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(AdminReportes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
