package com.hexa.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.hexa.entity.Student;
@Repository("mydao")
public class DaoImpl implements IDao {
	@Autowired
	private JdbcTemplate jtemp;
	@Autowired
    private RowMapper rmap;
 // setter for spring IOC to do dependency Injection.
	public void setRmap(RowMapper rmap) {
		this.rmap = rmap;
	}

	// setter for spring IOC to do dependency Injection.
	public void setJtemp(JdbcTemplate jtemp) {
		this.jtemp = jtemp;
	}

	@Override
	public List<Map<String, Object>> getStudentsMap(String dept) {

		String sql = "select * from student where dept=?";
		Object[] params = { dept };
		List<Map<String, Object>> lst = jtemp.queryForList(sql, params);
		return lst;
	}

	@Override
	public Map<String, Object> getStudentAsMap(int sid) {
		String sql = "select * from student where stu_id=?";
		Object[] params = { sid };
		Map<String, Object> map = jtemp.queryForMap(sql, params);
		return map;
	}

	@Override
	public int updateMarks(int sid, int marks) {
		String sql = "update student set stu_marks=? where stu_id=?";
		Object[] params = {sid,marks};
		int rows = jtemp.update(sql, params);
		return rows;
	}

	@Override
	public List<Student> getStudents(String dept) {
		String sql ="select * from student where dept=?";
		Object[] params= {dept};
		List<Student> lst=jtemp.query(sql,params,rmap);
		return lst;
	}

	@Override
	public Student getStudent(int sid) {
		// TODO Auto-generated method stub
		String sql = "select * from student where stu_id=?";
		Object[] params = {sid};
	Student stu=(Student)jtemp.queryForObject(sql,params,rmap);
	return stu;

}
}