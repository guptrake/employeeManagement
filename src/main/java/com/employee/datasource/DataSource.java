package com.employee.datasource;

import java.sql.Connection;

import org.apache.commons.dbcp2.BasicDataSource;

public class DataSource {

	
	  Connection      connection = null;
	  BasicDataSource bdSource   = new BasicDataSource();

	  public DataSource()
	  {
	    //bdSource.setDriverClassName("org.postgresql.Driver");
	    bdSource.setUrl("jdbc:postgresql://localhost/postgres?user=postgres&password=admin&currentSchema=public");
	   // bdSource.setUsername("root");
	    //bdSource.setPassword("root");
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

