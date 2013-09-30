package br.com.ocorrenciasbr.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import br.com.ocorrenciasbr.model.Ocorrencia;
import br.com.ocorrenciasbr.util.ConnectionFactory;
import br.com.ocorrenciasbr.util.ConnectionUtil;

public class OcorrenciasDAO {
	
	private Connection connection;
    private Statement statement;
 
    public OcorrenciasDAO() { 
    	connection = (Connection) ConnectionFactory.getConnection();
    }
 
    public Ocorrencia getEmployee(int employeeId) throws SQLException {
        String query = "SELECT * FROM employee WHERE emp_id=" + employeeId;
        ResultSet rs = null;
        Ocorrencia ocorrencia = null;
        try {
           
            statement = (Statement) connection.createStatement();
            rs = statement.executeQuery(query);
            if (rs.next()) {
              
            }
        } finally {
        	ConnectionUtil.close(rs);
        	ConnectionUtil.close(statement);
        	ConnectionUtil.close(connection);
        }
        return ocorrencia;
    }
}
