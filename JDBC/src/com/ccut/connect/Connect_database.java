package com.ccut.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect_database {

	public Connection getConnection(){
		Connection con = null;
		try {
			//��������
			Class.forName("com.mysql.jdbc.Driver");
			//�������ݿ� �������ݿ�����
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/xyd","root","xuyandong");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("����������ʧ��");
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("���ݿ�����ʧ��");
			e.printStackTrace();
		}
		return con;		
	}
}
