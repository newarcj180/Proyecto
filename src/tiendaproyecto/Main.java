
package tiendaproyecto;
import java.sql.*;
import javax.swing.*;

public class Main {

    static Connection conn=null;
    static Statement st=null;
    static ResultSet rs=null;

    static String bd="tiendita";
    static String login="root";
    static String password="";
    static String url="jdbc:mysql://localhost/"+Main.bd;

    public static Connection Enlace(Connection conn)throws SQLException
    {
    try
    {
    Class.forName("com.mysql.jdbc.Driver");
    conn = DriverManager.getConnection(url,login,password);
    }
    catch(ClassNotFoundException e)
    {
    JOptionPane.showMessageDialog(null, e);
    }
    return conn;
    }

    public static Statement sta(Statement st)throws SQLException
    {
    conn=Enlace(conn);
    st=conn.createStatement();
    return st;
    }

      public static ResultSet EnlCliente(ResultSet rs)throws SQLException
    {
    st=sta(st);
    rs=st.executeQuery("select * from cliente");
    return rs;
    }

       public static ResultSet EnlEmpleado(ResultSet rs)throws SQLException
    {
    st=sta(st);
    rs=st.executeQuery("select * from empleado");
    return rs;
    }

       public static ResultSet EnlCategoria(ResultSet rs)throws SQLException
    {
    st=sta(st);
    rs=st.executeQuery("select * from categoria");
    return rs;
    }
       public static ResultSet EnlMarca(ResultSet rs)throws SQLException
    {
    st=sta(st);
    rs=st.executeQuery("select * from marca");
    return rs;
    }
   
    public static ResultSet EnlProducto(ResultSet rs)throws SQLException
    {
    st=sta(st);
    String cad;
    cad="SELECT producto.IDProducto,categoria.ARTEFACTO,producto.CANTIDAD,producto.MODELO,marca.MARCA FROM producto,categoria,marca where producto.CATEGORIA=categoria.CODIGO and producto.MARCA=marca.CODIGO;";
    rs=st.executeQuery(cad);
    return rs;
    }

       public static ResultSet VerCategoria(ResultSet rs)throws SQLException
    {
    st=sta(st);
    PreparedStatement pstmt= conn.prepareStatement("{call VerCategoria()}");
    pstmt.executeUpdate();
    rs=pstmt.getResultSet();
    return rs;
    }
       public static ResultSet VerMarca(ResultSet rs)throws SQLException
    {
    st=sta(st);
    PreparedStatement pstmt= conn.prepareStatement("{call VerMarca()}");
    pstmt.executeUpdate();
    rs=pstmt.getResultSet();
    return rs;
    }

       public static ResultSet ObtenerCodCategoria(ResultSet rs, String nomc)throws SQLException
    {
    st=sta(st);
    String cad;
    cad="select CODIGO from categoria where ARTEFACTO='"+nomc+"'";
    rs=st.executeQuery(cad);
    return rs;
    }

        public static ResultSet ObtenerCodMarca(ResultSet rs, String nommar)throws SQLException
      {
    st=sta(st);
    String cad;
    cad="select CODIGO from marca where MARCA='"+nommar+"'";
    rs=st.executeQuery(cad);
    return rs;
    }
       public static ResultSet VerProductos(ResultSet rs,String cat)throws SQLException
    {
    st=sta(st);
    String cad;
    cad="SELECT producto.IDProducto,marca.MARCA,producto.cantidad FROM producto p " +
            "INNER JOIN marca  ON producto.MARCA=marca.CODIGO " +
            "INNER JOIN categoria  ON producto.CATEGORIA=categoria.CODIGO where producto.CATEGORIA='"+cat+"'";
    rs=st.executeQuery(cad);
    return rs;
    }

     public static ResultSet VerEmpleado(ResultSet rs)throws SQLException
    {
    st=sta(st);
    PreparedStatement pstmt= conn.prepareStatement("{call VerEmpleado()}");
    pstmt.executeUpdate();
    rs=pstmt.getResultSet();
    return rs;
    }
    
      public static ResultSet ObtenerCodEple(ResultSet rs, String emp)throws SQLException
    {
    st=sta(st);
    String cad;
    cad="select * from empleado where paterno='"+emp+"'";
    rs=st.executeQuery(cad);
    return rs;
    }
      public static ResultSet obtenerVistaProducto(ResultSet rs)throws SQLException
      {
          st=sta(st);
          String sql;
          sql="select * from vistaproducto";
          rs=st.executeQuery(sql);
          return rs;
      }
      //////////  ****************///
public static ResultSet VerCliente(ResultSet rs)throws SQLException
    {
    st=sta(st);
    PreparedStatement pstmt= conn.prepareStatement("{call VerCliente()}");
    pstmt.executeUpdate();
    rs=pstmt.getResultSet();
    return rs;
    }

public static ResultSet EnlVenta(ResultSet rs)throws SQLException
    {
    st=sta(st);
    String cad;
    cad="SELECT venta.IDventa,cliente.NOMBRE,venta.FECHA,venta.TOTAL,empleado.apellidos from empleado,cliente,venta where venta.CLIENTE=cliente.CODIGO and venta.empleado=empleado.codigo;";
    rs=st.executeQuery(cad);
    return rs;
    }
  
}
