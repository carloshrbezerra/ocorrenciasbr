package br.com.ocorrenciasbr.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import br.com.ocorrenciasbr.util.ConnectionFactory;
import br.com.ocorrenciasbr.util.ConnectionUtil;
import br.com.ocorrenciasbr.vo.OcorrenciaTotalAlcoolizadaVO;
import br.com.ocorrenciasbr.vo.OcorrenciaTotalEstadoVO;
import br.com.ocorrenciasbr.vo.OcorrenciaTotalSemCapaceteVO;
import br.com.ocorrenciasbr.vo.OcorrenciaTotalSemCintoVO;

public class OcorrenciasDAO {
	
	private Connection connection;
    private Statement statement;
 
    public OcorrenciasDAO() { 
    	connection = (Connection) ConnectionFactory.getConnection();
    }
 
    
    /**
     * 
     * Retorna o Total de ocorrencias por Estado
     * 
     * @return List<OcorrenciaTotalEstadoVO>
     * @throws SQLException
     * 
     * @author Carlos Bezerra
     */
    public List<OcorrenciaTotalEstadoVO> getTotalOcorrenciaEstado() throws SQLException {
        
    	String query = "select m.tmuuf,tmudenominacao, count(o.ocoid) as total_ocorrencia "
    		 	        + " from ocorrencia o inner join municipio m on m.tmucodigo = o.ocomunicipio "
    		 	        + " group by m.tmuuf "
    		 	        + " order by m.tmuuf"; 
      
        ResultSet rs = null;
        List<OcorrenciaTotalEstadoVO> totalEstadoVO = new ArrayList<OcorrenciaTotalEstadoVO>();
        OcorrenciaTotalEstadoVO OcorrenciaTotalEstadoVO;
        
        try {
           
            statement = (Statement) connection.createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
            	
            	OcorrenciaTotalEstadoVO = new OcorrenciaTotalEstadoVO();
            	
            	OcorrenciaTotalEstadoVO.setMunicipio(rs.getString("tmuuf"));
            	OcorrenciaTotalEstadoVO.setTotalOcorrencia(rs.getInt("total_ocorrencia"));
            	totalEstadoVO.add(OcorrenciaTotalEstadoVO);
            	
            }
        } finally {
        	ConnectionUtil.close(rs);
        	ConnectionUtil.close(statement);
        	ConnectionUtil.close(connection);
        }
        return totalEstadoVO;
    }
    
   
    /**
     * 
     * Retorna o Total de Ocorrencias com pessoas alcoolizadas por estado
     * 
     * @return List<OcorrenciaTotalAlcoolizadaVO>
     * @throws SQLException
     * 
     * @author Carlos Bezerra
     */
    public List<OcorrenciaTotalAlcoolizadaVO> getTotalOcorrenciaPessoasAlcoolizadas() throws SQLException {
        
    	String query = "select  p.pescapacete,m.tmuuf,count(o.ocoid) as total_ocorrencias from ocorrencia o "
    					+ " inner join ocorrenciapessoa op on o.ocoid = op.opeocoid "
    					+ " inner join pessoa p on p.pesid = op.opepesid "
    					+ " inner join municipio m on o.ocomunicipio = m.tmucodigo "
    		 	        + " where p.pesalcool = 'S' "
    		 	        + " group by m.tmuuf"; 
        
        ResultSet rs = null;
        List<OcorrenciaTotalAlcoolizadaVO> totalOcorrenciaAlcoolVO = new ArrayList<OcorrenciaTotalAlcoolizadaVO>();
        OcorrenciaTotalAlcoolizadaVO ocorrenciaTotalAlcoolizadaVO;
        
        try {
           
            statement = (Statement) connection.createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
            	
            	ocorrenciaTotalAlcoolizadaVO = new OcorrenciaTotalAlcoolizadaVO();
            	
            	ocorrenciaTotalAlcoolizadaVO.setMunicipio(rs.getString("tmuuf"));
            	ocorrenciaTotalAlcoolizadaVO.setTotalPessoa(rs.getInt("totalPessoa"));
            	totalOcorrenciaAlcoolVO.add(ocorrenciaTotalAlcoolizadaVO);
            	
            }
        } finally {
        	ConnectionUtil.close(rs);
        	ConnectionUtil.close(statement);
        	ConnectionUtil.close(connection);
        }
        return totalOcorrenciaAlcoolVO;
    }
    
    
    /**
     * 
     * Retorna o Total de ocorrencias com pessoas sem cinto de seguran�a
     * 
     * @return List<PessoaTotalAlcoolizadaVO>
     * @throws SQLException
     * 
     * @author Carlos Bezerra
     */
    public List<OcorrenciaTotalSemCintoVO> getTotalOcorrenciaPessoasSemCinto() throws SQLException {
        
    	String query = "select  p.pesalcool,m.tmuuf,count(p.pesid) as total_pessoas from pessoa p "
    					+ " inner join ocorrenciapessoa op on p.pesid = op.opepesid "
    					+ " inner join ocorrencia o on o.ocoid = op.opeocoid "
    					+ " inner join municipio m on o.ocomunicipio = m.tmucodigo "
    		 	        + " where p.pescinto = 'N' "
    		 	        + " group by m.tmuuf"; 
        
        ResultSet rs = null;
        List<OcorrenciaTotalSemCintoVO> totalOcorrenciaSemCintoVO = new ArrayList<OcorrenciaTotalSemCintoVO>();
        OcorrenciaTotalSemCintoVO ocorrenciaSemCintoVO;
        
        try {
           
            statement = (Statement) connection.createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
            	
            	ocorrenciaSemCintoVO = new OcorrenciaTotalSemCintoVO();
            	
            	ocorrenciaSemCintoVO.setMunicipio(rs.getString("tmuuf"));
            	ocorrenciaSemCintoVO.setTotalPessoa(rs.getInt("totalPessoa"));
            	totalOcorrenciaSemCintoVO.add(ocorrenciaSemCintoVO);
            	
            }
        } finally {
        	ConnectionUtil.close(rs);
        	ConnectionUtil.close(statement);
        	ConnectionUtil.close(connection);
        }
        return totalOcorrenciaSemCintoVO;
    }
    
    
    /**
     * 
     * Retorna o Total de ocorrencias com pessoas sem capacete
     * 
     * @return List<PessoaTotalAlcoolizadaVO>
     * @throws SQLException
     * 
     * @author Carlos Bezerra
     */
    public List<OcorrenciaTotalSemCapaceteVO> getTotalOcorrenciaPessoasSemCapacete() throws SQLException {
        
    	String query = "select  p.pesalcool,m.tmuuf,count(p.pesid) as total_pessoas from pessoa p "
    					+ " inner join ocorrenciapessoa op on p.pesid = op.opepesid "
    					+ " inner join ocorrencia o on o.ocoid = op.opeocoid "
    					+ " inner join municipio m on o.ocomunicipio = m.tmucodigo "
    		 	        + " where p.pescinto = 'N' "
    		 	        + " group by m.tmuuf"; 
        
        ResultSet rs = null;
        List<OcorrenciaTotalSemCapaceteVO> totalOcorrenciaSemCapaceteVO = new ArrayList<OcorrenciaTotalSemCapaceteVO>();
        OcorrenciaTotalSemCapaceteVO ocorrenciaSemCapaceteVO;
        
        try {
           
            statement = (Statement) connection.createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
            	
            	ocorrenciaSemCapaceteVO = new OcorrenciaTotalSemCapaceteVO();
            	
            	ocorrenciaSemCapaceteVO.setMunicipio(rs.getString("tmuuf"));
            	ocorrenciaSemCapaceteVO.setTotalPessoa(rs.getInt("totalPessoa"));
            	totalOcorrenciaSemCapaceteVO.add(ocorrenciaSemCapaceteVO);
            	
            }
        } finally {
        	ConnectionUtil.close(rs);
        	ConnectionUtil.close(statement);
        	ConnectionUtil.close(connection);
        }
        return totalOcorrenciaSemCapaceteVO;
    }
    
    
}