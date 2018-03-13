package com.ccut.executesql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ccut.connect.Connect_database;

public class Executesql {
	void insertDate(String sql){
		Connection con;
		Connect_database connect_database = new Connect_database();
		con = connect_database.getConnection();
		try {
			//sql”Ôæ‰¥¶¿Ì
			PreparedStatement ps= con.prepareStatement(sql);
			ps.execute();
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("ok");
	}
	
	public static void main(String[] args) {
		Executesql executesql =  new Executesql();
		executesql.insertDate("insert into t(id,name) values('2','word')");
	}

}
