package br.com.ocorrenciasbr.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import br.com.ocorrenciasbr.util.ConnectionFactory;
import br.com.ocorrenciasbr.util.ConnectionUtil;
import br.com.ocorrenciasbr.vo.OcorrenciaTotalEstadoVO;

import br.com.ocorrenciasbr.vo.OcorrenciaTotalVO;

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
    public List<OcorrenciaTotalEstadoVO> getTotalOcorrenciaEstado(){
        
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
            	
            	OcorrenciaTotalEstadoVO.setEstado(rs.getString("tmuuf"));
            	OcorrenciaTotalEstadoVO.setTotalOcorrencia(rs.getInt("total_ocorrencia"));
            	totalEstadoVO.add(OcorrenciaTotalEstadoVO);
            	
            }
        }catch(SQLException e){
        	e.printStackTrace();
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
    public List<OcorrenciaTotalVO> getTotalOcorrenciaPessoasAlcoolizadas(String estado){
        
    	String query = "select case length(o.ocodatafim) when 19 then DATE_FORMAT(o.ocodatafim, '%m') else SUBSTRING(o.ocodatafim,4,2) end as mes, "
				+ " p.pesalcool,m.tmuuf,count(p.pesid) as total_ocorrencia from pessoa p "
				+ " inner join ocorrenciapessoa op on p.pesid = op.opepesid "
				+ " inner join ocorrencia o on o.ocoid = op.opeocoid "
				+ " inner join municipio m on o.ocomunicipio = m.tmucodigo "
	 	        + " where  m.tmuuf = '" + estado + "' "
	 	        + " and p.pesalcool = 'S' "
	 	        + " group by m.tmuuf, mes"; 
        
        ResultSet rs = null;
        List<OcorrenciaTotalVO> totalOcorrenciaAlcoolVO = new ArrayList<OcorrenciaTotalVO>();
        OcorrenciaTotalVO ocorrenciaTotalAlcoolizadaVO;
        
        try {
           
            statement = (Statement) connection.createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
            	
            	ocorrenciaTotalAlcoolizadaVO = new OcorrenciaTotalVO();
            	
            	ocorrenciaTotalAlcoolizadaVO.setEstado(rs.getString("tmuuf"));
            	ocorrenciaTotalAlcoolizadaVO.setTotalOcorrencia(rs.getInt("total_ocorrencia"));
            	ocorrenciaTotalAlcoolizadaVO.setMes(rs.getInt("mes"));
            	totalOcorrenciaAlcoolVO.add(ocorrenciaTotalAlcoolizadaVO);
            	
            }
        } catch(SQLException e){
        	e.printStackTrace();
        } finally {
        	ConnectionUtil.close(rs);
        	ConnectionUtil.close(statement);
        	//ConnectionUtil.close(connection);
        }
        return totalOcorrenciaAlcoolVO;
    }
    
    
    /**
     * 
     * Retorna o Total de ocorrencias com pessoas sem cinto de seguranša
     * 
     * @return List<OcorrenciaTotalSemCintoVO>
     * @throws SQLException
     * 
     * @author Carlos Bezerra
     */
    public List<OcorrenciaTotalVO> getTotalOcorrenciaPessoasSemCinto(String estado){
        
    	String query = "select case length(o.ocodatafim) when 19 then DATE_FORMAT(o.ocodatafim, '%m') else SUBSTRING(o.ocodatafim,4,2) end as mes, "
				+ " p.pesalcool,m.tmuuf,count(p.pesid) as total_ocorrencia from pessoa p "
				+ " inner join ocorrenciapessoa op on p.pesid = op.opepesid "
				+ " inner join ocorrencia o on o.ocoid = op.opeocoid "
				+ " inner join municipio m on o.ocomunicipio = m.tmucodigo "
				+ " where  m.tmuuf = '" + estado + "' "
	 	        + " and p.pescinto = 'N' "
	 	        + " group by m.tmuuf, mes"; 
        
        ResultSet rs = null;
        List<OcorrenciaTotalVO> totalOcorrenciaSemCintoVO = new ArrayList<OcorrenciaTotalVO>();
        OcorrenciaTotalVO ocorrenciaSemCintoVO;
        
        try {
           
            statement = (Statement) connection.createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
            	
            	ocorrenciaSemCintoVO = new OcorrenciaTotalVO();
            	
            	ocorrenciaSemCintoVO.setEstado(rs.getString("tmuuf"));
            	ocorrenciaSemCintoVO.setTotalOcorrencia(rs.getInt("total_ocorrencia"));
            	ocorrenciaSemCintoVO.setMes(rs.getInt("mes"));
            	totalOcorrenciaSemCintoVO.add(ocorrenciaSemCintoVO);
            	
            }
        } catch(SQLException e){
        	e.printStackTrace();
        } finally {
        	ConnectionUtil.close(rs);
        	ConnectionUtil.close(statement);
        	//ConnectionUtil.close(connection);
        }
        return totalOcorrenciaSemCintoVO;
    }
    
    
    /**
     * 
     * Retorna o Total de ocorrencias com pessoas sem capacete
     * 
     * @return List<OcorrenciaTotalSemCapaceteVO>
     * @throws SQLException
     * 
     * @author Carlos Bezerra
     */
    public List<OcorrenciaTotalVO> getTotalOcorrenciaPessoasSemCapacete(String estado){
        
    	String query = "select case length(o.ocodatafim) when 19 then DATE_FORMAT(o.ocodatafim, '%m') else SUBSTRING(o.ocodatafim,4,2) end as mes, "
    					+ " p.pesalcool,m.tmuuf,count(p.pesid) as total_ocorrencia from pessoa p "
    					+ " inner join ocorrenciapessoa op on p.pesid = op.opepesid "
    					+ " inner join ocorrencia o on o.ocoid = op.opeocoid "
    					+ " inner join municipio m on o.ocomunicipio = m.tmucodigo "
    					+ " where  m.tmuuf = '" + estado + "' "
    		 	        + " and p.pescapacete = 'N' "
    		 	        + " group by m.tmuuf, mes"; 
        
        ResultSet rs = null;
        List<OcorrenciaTotalVO> totalOcorrenciaSemCapaceteVO = new ArrayList<OcorrenciaTotalVO>();
        OcorrenciaTotalVO ocorrenciaSemCapaceteVO;
        
        try {
           
            statement = (Statement) connection.createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
            	
            	ocorrenciaSemCapaceteVO = new OcorrenciaTotalVO();
            	
            	ocorrenciaSemCapaceteVO.setEstado(rs.getString("tmuuf"));
            	ocorrenciaSemCapaceteVO.setTotalOcorrencia(rs.getInt("total_ocorrencia"));
            	ocorrenciaSemCapaceteVO.setMes(rs.getInt("mes"));
            	totalOcorrenciaSemCapaceteVO.add(ocorrenciaSemCapaceteVO);
            	
            }
        } catch(SQLException e){
        	e.printStackTrace();
        } finally {
        	ConnectionUtil.close(rs);
        	ConnectionUtil.close(statement);
        	//ConnectionUtil.close(connection);
        }
        return totalOcorrenciaSemCapaceteVO;
    }
    
    
    
    /**
     * 
     * Retorna o Total de ocorrencias por tipo de veciulo/Carro
     * 
     * @return List<OcorrenciaTotalTipoVeiculoVO>
     * @throws SQLException
     * 
     * @author Carlos Bezerra
     */
    public List<OcorrenciaTotalVO> getTotalOcorrenciaTipoVeiculoCarro(String estado){
        
    	String query = "select v.veitvvcodigo,tp.tvvdescricao,count(o.ocoid) as total_ocorrencia, "
    					+ " case length(o.ocodatafim) when 19 then DATE_FORMAT(o.ocodatafim, '%m') else SUBSTRING(o.ocodatafim,4,2) end as mes "
    					+ " from ocorrencia o  "
    					+ " inner join ocorrenciaveiculo ov on o.ocoid = ov.ocvocoid "
    					+ " inner join veiculo v on v.veiid = ov.ocvveiid "
    					+ " inner join tipoveiculo tp on tp.tvvcodigo = v.veitvvcodigo "
    					+ " inner join municipio m on m.tmucodigo = o.ocomunicipio "
    					+ " where  m.tmuuf = '" + estado + "' "
    		 	        + " and veitvvcodigo = 14 "
    		 	        + " group by m.tmuuf,v.veitvvcodigo,mes "; 
        
        ResultSet rs = null;
        List<OcorrenciaTotalVO> totalOcorrenciatipoVeiculoVO = new ArrayList<OcorrenciaTotalVO>();
        OcorrenciaTotalVO ocorrenciatipoVeiculoVO;
        
        try {
           
            statement = (Statement) connection.createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
            	
            	ocorrenciatipoVeiculoVO = new OcorrenciaTotalVO();
            	
            	ocorrenciatipoVeiculoVO.setTotalOcorrencia(rs.getInt("total_ocorrencia"));
            	ocorrenciatipoVeiculoVO.setMes(rs.getInt("mes"));
            
            	totalOcorrenciatipoVeiculoVO.add(ocorrenciatipoVeiculoVO);
            	
            }
        }catch (SQLException e){
        	e.printStackTrace();
        } 
        
        finally {
        	ConnectionUtil.close(rs);
        	ConnectionUtil.close(statement);
        	//ConnectionUtil.close(connection);
        }
        return totalOcorrenciatipoVeiculoVO;
    }
    
    
    
    
    /**
     * 
     * Retorna o Total de ocorrencias por tipo de veciulo/Moto
     * 
     * @return List<OcorrenciaTotalTipoVeiculoVO>
     * @throws SQLException
     * 
     * @author Carlos Bezerra
     */
    public List<OcorrenciaTotalVO> getTotalOcorrenciaTipoVeiculoMoto(String estado){
        
    	String query = "select v.veitvvcodigo,tp.tvvdescricao,count(o.ocoid) as total_ocorrencia, "
    					+ " case length(o.ocodatafim) when 19 then DATE_FORMAT(o.ocodatafim, '%m') else SUBSTRING(o.ocodatafim,4,2) end as mes "
    					+ " from ocorrencia o  "
    					+ " inner join ocorrenciaveiculo ov on o.ocoid = ov.ocvocoid "
    					+ " inner join veiculo v on v.veiid = ov.ocvveiid "
    					+ " inner join tipoveiculo tp on tp.tvvcodigo = v.veitvvcodigo "
    					+ " inner join municipio m on m.tmucodigo = o.ocomunicipio "
    					+ " where  m.tmuuf = '" + estado + "' "
    		 	        + " and veitvvcodigo = 4 "
    		 	        + " group by m.tmuuf,v.veitvvcodigo,mes "; 
        
        ResultSet rs = null;
        List<OcorrenciaTotalVO> totalOcorrenciatipoVeiculoVO = new ArrayList<OcorrenciaTotalVO>();
        OcorrenciaTotalVO ocorrenciatipoVeiculoVO;
        
        try {
           
            statement = (Statement) connection.createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
            	
            	ocorrenciatipoVeiculoVO = new OcorrenciaTotalVO();
            	
            	ocorrenciatipoVeiculoVO.setTotalOcorrencia(rs.getInt("total_ocorrencia"));
            	ocorrenciatipoVeiculoVO.setMes(rs.getInt("mes"));
            
            	totalOcorrenciatipoVeiculoVO.add(ocorrenciatipoVeiculoVO);
            	
            }
        }catch (SQLException e){
        	e.printStackTrace();
        } 
        
        finally {
        	ConnectionUtil.close(rs);
        	ConnectionUtil.close(statement);
        	//ConnectionUtil.close(connection);
        }
        return totalOcorrenciatipoVeiculoVO;
    }
    
    
    
    /**
     * 
     * Retorna o Total de Ocorrencias com pessoas do sexo masculino
     * 
     * @return List<OcorrenciaTotalAlcoolizadaVO>
     * @throws SQLException
     * 
     * @author Carlos Bezerra
     */
    public List<OcorrenciaTotalVO> getTotalOcorrenciaPessoasSexoMasculino(String estado){
        
    	String query = "select case length(o.ocodatafim) when 19 then DATE_FORMAT(o.ocodatafim, '%m') else SUBSTRING(o.ocodatafim,4,2) end as mes, "
				+ " p.pesalcool,m.tmuuf,count(p.pesid) as total_ocorrencia from pessoa p "
				+ " inner join ocorrenciapessoa op on p.pesid = op.opepesid "
				+ " inner join ocorrencia o on o.ocoid = op.opeocoid "
				+ " inner join municipio m on o.ocomunicipio = m.tmucodigo "
				+ " where  m.tmuuf = '" + estado + "' "
	 	        + " and p.pessexo = 'M' "
	 	        + " group by m.tmuuf, mes"; 
        
        ResultSet rs = null;
        List<OcorrenciaTotalVO> totalOcorrenciaAlcoolVO = new ArrayList<OcorrenciaTotalVO>();
        OcorrenciaTotalVO ocorrenciaTotalAlcoolizadaVO;
        
        try {
           
            statement = (Statement) connection.createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
            	
            	ocorrenciaTotalAlcoolizadaVO = new OcorrenciaTotalVO();
            	
            	ocorrenciaTotalAlcoolizadaVO.setEstado(rs.getString("tmuuf"));
            	ocorrenciaTotalAlcoolizadaVO.setTotalOcorrencia(rs.getInt("total_ocorrencia"));
            	ocorrenciaTotalAlcoolizadaVO.setMes(rs.getInt("mes"));
            	totalOcorrenciaAlcoolVO.add(ocorrenciaTotalAlcoolizadaVO);
            	
            }
        } catch(SQLException e){
        	e.printStackTrace();
        } finally {
        	ConnectionUtil.close(rs);
        	ConnectionUtil.close(statement);
        	//ConnectionUtil.close(connection);
        }
        return totalOcorrenciaAlcoolVO;
    }
    
    
    
    
    /**
     * 
     * Retorna o Total de Ocorrencias com pessoas do sexo masculino
     * 
     * @return List<OcorrenciaTotalAlcoolizadaVO>
     * @throws SQLException
     * 
     * @author Carlos Bezerra
     */
    public List<OcorrenciaTotalVO> getTotalOcorrenciaPessoasSexoFeminino(String estado){
        
    	String query = "select case length(o.ocodatafim) when 19 then DATE_FORMAT(o.ocodatafim, '%m') else SUBSTRING(o.ocodatafim,4,2) end as mes, "
				+ " p.pesalcool,m.tmuuf,count(p.pesid) as total_ocorrencia from pessoa p "
				+ " inner join ocorrenciapessoa op on p.pesid = op.opepesid "
				+ " inner join ocorrencia o on o.ocoid = op.opeocoid "
				+ " inner join municipio m on o.ocomunicipio = m.tmucodigo "
				+ " where  m.tmuuf = '" + estado + "' "
	 	        + " and p.pessexo = 'F' "
	 	        + " group by m.tmuuf, mes"; 
        
        ResultSet rs = null;
        List<OcorrenciaTotalVO> totalOcorrenciaAlcoolVO = new ArrayList<OcorrenciaTotalVO>();
        OcorrenciaTotalVO ocorrenciaTotalAlcoolizadaVO;
        
        try {
           
            statement = (Statement) connection.createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
            	
            	ocorrenciaTotalAlcoolizadaVO = new OcorrenciaTotalVO();
            	
            	ocorrenciaTotalAlcoolizadaVO.setEstado(rs.getString("tmuuf"));
            	ocorrenciaTotalAlcoolizadaVO.setTotalOcorrencia(rs.getInt("total_ocorrencia"));
            	ocorrenciaTotalAlcoolizadaVO.setMes(rs.getInt("mes"));
            	totalOcorrenciaAlcoolVO.add(ocorrenciaTotalAlcoolizadaVO);
            	
            }
        } catch(SQLException e){
        	e.printStackTrace();
        } finally {
        	ConnectionUtil.close(rs);
        	ConnectionUtil.close(statement);
        	//ConnectionUtil.close(connection);
        }
        return totalOcorrenciaAlcoolVO;
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
    public List<OcorrenciaTotalVO> getTotalOcorrenciaPessoasSemHabilitacao(String estado){
        
    	String query = "select case length(o.ocodatafim) when 19 then DATE_FORMAT(o.ocodatafim, '%m') else SUBSTRING(o.ocodatafim,4,2) end as mes, "
				+ " p.pesalcool,m.tmuuf,count(p.pesid) as total_ocorrencia from pessoa p "
				+ " inner join ocorrenciapessoa op on p.pesid = op.opepesid "
				+ " inner join ocorrencia o on o.ocoid = op.opeocoid "
				+ " inner join municipio m on o.ocomunicipio = m.tmucodigo "
				+ " where  m.tmuuf = '" + estado + "' "
	 	        + " and p.peshabilitado = 'N' "
	 	        + " group by m.tmuuf, mes"; 
        
        ResultSet rs = null;
        List<OcorrenciaTotalVO> totalOcorrenciaAlcoolVO = new ArrayList<OcorrenciaTotalVO>();
        OcorrenciaTotalVO ocorrenciaTotalAlcoolizadaVO;
        
        try {
           
            statement = (Statement) connection.createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
            	
            	ocorrenciaTotalAlcoolizadaVO = new OcorrenciaTotalVO();
            	
            	ocorrenciaTotalAlcoolizadaVO.setEstado(rs.getString("tmuuf"));
            	ocorrenciaTotalAlcoolizadaVO.setTotalOcorrencia(rs.getInt("total_ocorrencia"));
            	ocorrenciaTotalAlcoolizadaVO.setMes(rs.getInt("mes"));
            	totalOcorrenciaAlcoolVO.add(ocorrenciaTotalAlcoolizadaVO);
            	
            }
        } catch(SQLException e){
        	e.printStackTrace();
        } finally {
        	ConnectionUtil.close(rs);
        	ConnectionUtil.close(statement);
        	//ConnectionUtil.close(connection);
        }
        return totalOcorrenciaAlcoolVO;
    }
    
    
    
    /**
     * 
     * Retorna o Total de Acidentes
     * 
     * @return List<OcorrenciaTotalAlcoolizadaVO>
     * @throws SQLException
     * 
     * @author Carlos Bezerra
     */
    public List<OcorrenciaTotalVO> getTotalOcorrenciaComAcidente(String estado){
        
    	String query = "select case length(o.ocodatafim) when 19 then DATE_FORMAT(o.ocodatafim, '%m') else SUBSTRING(o.ocodatafim,4,2) end as mes, "
				+ " m.tmuuf,count(o.ocoid) as total_ocorrencia from ocorrencia o "
				+ " inner join ocorrenciaacidente oa on oa.oacocoid = o.ocoid "
				+ " inner join municipio m on o.ocomunicipio = m.tmucodigo "
				+ " where  m.tmuuf = '" + estado + "' "
	 	        + " group by m.tmuuf, mes"; 
    	
        ResultSet rs = null;
        List<OcorrenciaTotalVO> totalOcorrenciaAlcoolVO = new ArrayList<OcorrenciaTotalVO>();
        OcorrenciaTotalVO ocorrenciaTotalAlcoolizadaVO;
        
        try {
           
            statement = (Statement) connection.createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
            	
            	ocorrenciaTotalAlcoolizadaVO = new OcorrenciaTotalVO();
            	
            	ocorrenciaTotalAlcoolizadaVO.setEstado(rs.getString("tmuuf"));
            	ocorrenciaTotalAlcoolizadaVO.setTotalOcorrencia(rs.getInt("total_ocorrencia"));
            	ocorrenciaTotalAlcoolizadaVO.setMes(rs.getInt("mes"));
            	totalOcorrenciaAlcoolVO.add(ocorrenciaTotalAlcoolizadaVO);
            	
            }
        } catch(SQLException e){
        	e.printStackTrace();
        } finally {
        	ConnectionUtil.close(rs);
        	ConnectionUtil.close(statement);
        	//ConnectionUtil.close(connection);
        }
        return totalOcorrenciaAlcoolVO;
    }
    
    
    
    /**
     * 
     * Retorna o Total de Acidentes
     * 
     * @return List<OcorrenciaTotalAlcoolizadaVO>
     * @throws SQLException
     * 
     * @author Carlos Bezerra
     */
    public List<OcorrenciaTotalVO> getTotalOcorrenciaComAcidenteAtropelamento(String estado){
        
    	 
        String query = "select case length(o.ocodatafim) when 19 then DATE_FORMAT(o.ocodatafim, '%m') else SUBSTRING(o.ocodatafim,4,2) end as mes, "
    			+ " m.tmuuf,count(o.ocoid) as total_ocorrencia from ocorrencia o "
    			+ " inner join ocorrenciaacidente oa on oa.oacocoid = o.ocoid "
    			+ " inner join municipio m on o.ocomunicipio = m.tmucodigo "
    			+ " inner join tipoacidente ta on ta.ttacodigo = oa.oacttacodigo "
    			+ " where  m.tmuuf = '" + estado + "' "
     	        + " and ta.ttacodigo = 2 "
     	        + " group by m.tmuuf, mes"; 
    	
        ResultSet rs = null;
        List<OcorrenciaTotalVO> totalOcorrenciaAlcoolVO = new ArrayList<OcorrenciaTotalVO>();
        OcorrenciaTotalVO ocorrenciaTotalAlcoolizadaVO;
        
        try {
           
            statement = (Statement) connection.createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
            	
            	ocorrenciaTotalAlcoolizadaVO = new OcorrenciaTotalVO();
            	
            	ocorrenciaTotalAlcoolizadaVO.setEstado(rs.getString("tmuuf"));
            	ocorrenciaTotalAlcoolizadaVO.setTotalOcorrencia(rs.getInt("total_ocorrencia"));
            	ocorrenciaTotalAlcoolizadaVO.setMes(rs.getInt("mes"));
            	totalOcorrenciaAlcoolVO.add(ocorrenciaTotalAlcoolizadaVO);
            	
            }
        } catch(SQLException e){
        	e.printStackTrace();
        } finally {
        	ConnectionUtil.close(rs);
        	ConnectionUtil.close(statement);
        	//ConnectionUtil.close(connection);
        }
        return totalOcorrenciaAlcoolVO;
    }
    
    
    
   
	
   
    
}
