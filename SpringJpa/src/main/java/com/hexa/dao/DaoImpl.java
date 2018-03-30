package com.hexa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hexa.entity.Student;

@Repository("mydao")
public class DaoImpl implements IDao {

	@PersistenceContext
	private EntityManager em; // responsible for creating/handling session from jpa which internally uses
								// hibernate SessionFactory

	@Override
	public Student getStudent(int sid) {
		Student stu = em.find(Student.class, sid); // does three jobs -creates session, get the session,close the
													// session
		return stu;
	}

	@Override
	public List<Student> getStudents(String dept) {
		Query qry = em.createQuery("from Student s where s.dept=?");// alias name is compulsory in jpa
		qry.setParameter(1, dept); // parameter index starts with 1 and not 0
		List<Student> lst = qry.getResultList();
		return lst;
	}

	@Override
	@Transactional(readOnly = false)
	public int addStudent(Student stu) {
		em.persist(stu); // to add the student into the database.
		return 1;
	}

	@Override
	@Transactional(readOnly = false)
	public int removeStudent(int sid) {
		Student stu = em.find(Student.class, sid);
		em.remove(stu);
		return 1;
	}

	@Override
	@Transactional(readOnly = false)
	public int updateStudent(Student stu) {
		em.merge(stu);
		return 1;
	}

}
