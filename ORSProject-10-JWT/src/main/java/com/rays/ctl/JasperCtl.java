package com.rays.ctl;
import java.io.IOException;
import java.io.InputStream;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.servlet.http.HttpServletResponse;


import org.hibernate.engine.jdbc.connections.spi.ConnectionProvider;

import org.hibernate.SessionFactory;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

public class JasperCtl {
	
	private EntityManager entityManager;
	private SessionFactory sessionfactory;
	
	public void generateReport(HttpServletResponse response) throws IOException, SQLException  {
		
		System.out.println("*****************Jasper Report Start***************");
		
		Connection conn = null;
		
		try {
			InputStream input = getClass().getResourceAsStream("/reports/Project10.jrxml");
			
			if(input == null) {
				throw new RuntimeException("JRXML file not found in resources/reports");
			}
			
			JasperReport jasperReport = JasperCompileManager.compileReport(input);
			

			// Set parameters for report
			Map<String, Object> params = new HashMap<>();
			params.put("createdBy", "Admin");

			// Get DB connection from Hibernate
			sessionfactory = entityManager.getEntityManagerFactory().unwrap(SessionFactory.class);

			conn = sessionfactory.getSessionFactoryOptions().getServiceRegistry().getService(ConnectionProvider.class)
					.getConnection();

			// Fill report with data
			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, params, conn);

			// Export report to PDF
			byte[] pdf = JasperExportManager.exportReportToPdf(jasperPrint);

			// Set response headers
			response.setContentType("application/pdf");
			response.setHeader("Content-Disposition", "inline; filename=marksheet.pdf");

			// Write PDF to response
			response.getOutputStream().write(pdf);
			response.getOutputStream().flush();

			System.out.println("******** Report Generated ********");

		} catch (Exception e) {
		    e.printStackTrace();
		    response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
		    response.setContentType("text/plain");
		    response.getWriter().write(e.getMessage());
		} finally {
			// Close DB connection
			if (conn != null) {
				conn.close();
			}
		}
	}
		
		
	}


