package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class ProdcutDAO {
	@Autowired
	JdbcTemplate jdbctemplate;
	
	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}
	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}
	String SQL_SELECT="select * from prodcut";
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbctemplate=jdbcTemplate;
	}
	public int addProdcut(Prodcut p) {
		String query="insert into prodcut values('"+p.getPid()+"','"+p.getPname()+"','"+p.getPdesc()+"','"+p.getDom()+"','"+p.getDoeep()+"','"+p.getSupplier()+"')";
		return jdbctemplate.update(query);
		
	}

}
