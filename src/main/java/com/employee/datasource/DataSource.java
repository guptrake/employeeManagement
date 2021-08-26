package com.employee.datasource;

import java.sql.Connection;

import org.apache.commons.dbcp2.BasicDataSource;

public class DataSource {

	
	  Connection      connection = null;
	  BasicDataSource bdSource   = new BasicDataSource();

	  public DataSource()
	  {
			bdSource.setDriverClassName("org.h2.Driver");
			bdSource.setUrl("jdbc:h2:~/test");
			bdSource.setUsername("sa");
			bdSource.setPassword("");
	  }

	  public Connection createConnection()
	  {
	    Connection con = null;
	    try
	    {
	      if( connection != null )
	      {
	        System.out.println("Cant create a New Connection");
	      }
	      else
	      {
	        con = bdSource.getConnection();
	      }
	    }
	    catch( Exception e )
	    {
	      System.out.println("Error Occured " + e.toString());
	    }
	    return con;
	  }
	}

