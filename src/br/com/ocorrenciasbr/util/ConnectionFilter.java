package br.com.ocorrenciasbr.util;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ConnectionFilter implements Filter{
	
	
	private EntityManagerFactory factory;
	

	public void init(FilterConfig filterConfig) throws ServletException {
		this.factory = Persistence.createEntityManagerFactory("ocorrenciasBR");
	}
		
		
	public void destroy() {
		this.factory.close();
	}
	
	
	public void doFilter(ServletRequest request, ServletResponse response,  
            FilterChain chain) throws ServletException, IOException {  
		

		 EntityManager manager = this.factory.createEntityManager();
		 request.setAttribute("EntityManager", manager );
		 manager.getTransaction().begin();
		

		
		 chain.doFilter(request , response);
		 
	
		 try {
			 manager.getTransaction().commit();
		 }catch ( Exception e) {
			 manager.getTransaction().rollback();
		 } finally {
			 manager.close();
		 }

	}
	
}
