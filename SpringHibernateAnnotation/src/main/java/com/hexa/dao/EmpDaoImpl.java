package com.hexa.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hexa.entity.Dept;
import com.hexa.entity.Emp;

@Repository("mydao")
public class EmpDaoImpl implements EmpDao {
	private SessionFactory sfac;
	// setter for spring IOC to do DI

	@Autowired
	public void setSfac(SessionFactory sfac) {
		this.sfac = sfac;
	}

	@Override
	public List<Dept> getDepartments() {
		Session sess = sfac.openSession();
		Query qry = sess.createQuery("from Dept d");
		List<Dept> lst = qry.list();
		sess.close();
		return lst;

	}

	@Override
	public List<Emp> getEmployees() {
		// TODO Auto-generated method stub

		Session sess = sfac.openSession();
		String hql = "from Emp e fetch e.dept where e.dept.deptId=?";

		Query qry = sess.createQuery(hql);

		List<Emp> lst = qry.list();
		sess.close();
		return lst;
	}

	@Override
	public List<Emp> getEmployees(int did) {
		// TODO Auto-generated method stub

		Session sess = sfac.openSession();
		String hql = "from Emp e fetch e.dept where e.dept.deptId=?";

		Query qry = sess.createQuery(hql);
		qry.setInteger(0, did);

		List<Emp> lst = qry.list();
		sess.close();
		return lst;
	}

	@Override
	public Emp getEmployee(int eid) {
		// TODO Auto-generated method stub
		Session sess = sfac.openSession();
		String hql = "from Emp e fetch e.dept where e.dept=?";

		Query qry = sess.createQuery(hql);
		qry.setInteger(0, eid);
		Emp emp = (Emp) qry.uniqueResult();
		sess.close();
		return emp;
	}

	@Override
	public int addEmployee(Emp emp) {
		// TODO Auto-generated method stub
		Session sess = sfac.openSession();
		Transaction tx = sess.beginTransaction();
		try {
			sess.save(emp);
			tx.commit();
			return 1;
		} catch (HibernateException ex) {
			tx.rollback();
		} finally {
			sess.close();
		}
		return 0;
	}

}
