package com.hexa.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.hexa.entity.Student;

public class JdbcDaoImpl implements StudentDao {
    private Properties jprops;
    //Constructor for spring ioc to do DI
	public JdbcDaoImpl(Properties props) throws ClassNotFoundException {
		this.jprops=props;
		Class.forName(jprops.getProperty("driver"));
	}
	
	@Override
	public List<Student> getStudents() {
		
		List<Student> lst=new ArrayList<Student>();
		Student stu=null;
		String url=jprops.getProperty("url");
		String uname=jprops.getProperty("user");
		String pwd=jprops.getProperty("passwd");
		try(Connection conn=
			DriverManager.getConnection(url,uname,pwd)){
				String sql="select  * from student";
				PreparedStatement st = conn.prepareStatement(sql);
				ResultSet rs=st.executeQuery();
				while(rs.next()) {
					stu=new Student(rs.getInt("stu_id"),rs.getString("stu_name"),rs.getInt("stu_marks"));
					lst.add(stu);
			}
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		
		return lst;
		
	}

}
