package Componentes;

import java.sql.*;
import javax.swing.JOptionPane;


public class Conexion {

    private java.sql.Connection conn;
    private Statement stm;
    private ResultSet rst;
    int valor = 0;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public java.sql.Connection getConn() {
        return conn;
    }

    public void setConn(java.sql.Connection conn) {
        this.conn = conn;
    }

    public Statement getStm() {
        return stm;
    }

    public void setStm(Statement stm) {
        this.stm = stm;
    }

    public ResultSet getRst() {
        return rst;
    }

    public void setRst(ResultSet rst) {
        this.rst = rst;
    }

      public void conectarPrueba(){
          try {
            // We register the MySQL (MariaDB) driver
            // Registramos el driver de MySQL (MariaDB)
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                System.out.println("Error al registrar el driver de MySQL: " + ex);
            }
            Connection connection = null;
            // Database connect
            // Conectamos con la base de datos
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bd_reloj_provex", "user_reloj", "bd_reloj");
            boolean valid = connection.isValid(50000);
            System.out.println(valid ? "CONEXION OK" : "TEST FAIL");
        } catch (java.sql.SQLException sqle) {
           valor =1;
        }
        
    }

    public void conectar()throws SQLException, ClassNotFoundException {
        
          

            Class.forName("com.mysql.jdbc.Driver");
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_reloj_provex", "user_reloj", "bd_reloj");

        
    }
      
     public ResultSet BuscarTimbradas(String nombreEmpleado,String fechaInicio,String fechaFinal) throws ClassNotFoundException, SQLException {

        this.conectar();

        Statement stmt = conn.createStatement();
        ResultSet rslt = stmt.executeQuery("select  empleado.id,empleado.nombre,timbradas.hora,timbradas.minutos,timbradas.fecha from  empleado,timbradas where empleado.nombre='"+nombreEmpleado+"' and timbradas.fecha>='"+fechaInicio+"' and timbradas.fecha<='"+fechaFinal+"' and timbradas.id=empleado.id  ");

        return rslt;

    }
      public ResultSet BuscarTimbradasTodos(String fechaInicio,String fechaFinal) throws ClassNotFoundException, SQLException {

        this.conectar();

        Statement stmt = conn.createStatement();
        ResultSet rslt = stmt.executeQuery("SELECT empleado.id,empleado.nombre,timbradas.hora,timbradas.minutos,timbradas.fecha FROM empleado,timbradas where empleado.id>='0000000000' and timbradas.fecha>='"+fechaInicio+"' and timbradas.fecha<='"+fechaFinal+"' and timbradas.id=empleado.id  ");//order by timbradas.fecha asc ,timbradas.hora asc

        return rslt;

    }
        public ResultSet Todos_las_Fechas(String fechaInicio,String fechaFinal) throws ClassNotFoundException, SQLException {

        this.conectar();

        Statement stmt = conn.createStatement();
        ResultSet rslt = stmt.executeQuery("select * from dias where fecha>='"+fechaInicio+"' and fecha<='"+fechaFinal+"' ");//order by timbradas.fecha asc ,timbradas.hora asc

        return rslt;

    }
          public ResultSet BuscadiasLaborables(String fechainicial,String fechafinal) throws ClassNotFoundException, SQLException {

        this.conectar();

        Statement stmt = conn.createStatement();
        ResultSet rslt = stmt.executeQuery("select * from dias where fecha between '"+fechainicial+"' and '"+fechafinal+"' and dia<>'sáb' and dia<>'dom'");//order by timbradas.fecha asc ,timbradas.hora asc

        return rslt;

    }
          public ResultSet BuscaEmpleadoReporte() throws ClassNotFoundException, SQLException {

        this.conectar();

        Statement stmt = conn.createStatement();
        ResultSet rslt = stmt.executeQuery("select id_empleado from tabla_emp_todos  group by id_empleado");//order by timbradas.fecha asc ,timbradas.hora asc

        return rslt;

    }
          public ResultSet BuscaTimbradasXID(String id) throws ClassNotFoundException, SQLException {

        this.conectar();

        Statement stmt = conn.createStatement();
        ResultSet rslt = stmt.executeQuery("select * from tabla_emp_todos where id_empleado='"+id+"'");//order by timbradas.fecha asc ,timbradas.hora asc

        return rslt;

    }
     
     
       public ResultSet  TodoslosEmpleados() throws ClassNotFoundException, SQLException {

        this.conectar();

        Statement stmt = conn.createStatement();
        ResultSet rslt = stmt.executeQuery("select * from empleado");
        return rslt;

    }
     
     public void  BorrarBase() throws ClassNotFoundException, SQLException {

        this.conectar();

        Statement stmt = conn.createStatement();
        stmt.execute("DELETE from timbradas where id");

    }
      public void  BorrarTabla_Emp_Todos() throws ClassNotFoundException, SQLException {

        this.conectar();

        Statement stmt = conn.createStatement();
        stmt.execute("DELETE from tabla_emp_todos where id");

    }
      
         public void  CrarEmpleado(String id,String cedula,String nombre,String cargo) throws ClassNotFoundException, SQLException {

        this.conectar();

        Statement stmt = conn.createStatement();
        stmt.execute("insert into empleado (id,cedula,nombre,cargo)  values ('"+id+"','"+cedula+"','"+nombre+"','"+cargo+"')");

    }

    public void desconectar() throws SQLException {

        conn.close();

    }

}