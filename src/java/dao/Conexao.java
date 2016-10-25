package dao;

import java.sql.Connection;
import java.sql.DriverManager;



public class Conexao {
            // Banco caminho
            static public String serverName = "localhost"; // endereço
            static public String mydatabase = "mydb"; // banco
            static String url = "jdbc:mysql://" + serverName + "/" + mydatabase; // a JDBC url
            //Login e senha do banco
            static public String username = "root"; // usuario banco
            static public String password = "familiamenores0"; // senha banco
            static public String driverName = "com.mysql.jdbc.Driver"; // driver do banco
            
            static Connection con; // instancia de Connection
            
            /**
             * Metodo de conexão com o banco MySql
             * @return 
             */
            public static Connection getConnection(){
                try {
                    con = DriverManager.getConnection(url, username, password);
                    System.out.println("Conectado");
                } catch (Exception e) {
                    System.out.println("Não pode conectar"+ e.getMessage());
                }
                return con;   
            }
            
            
    
    

}
