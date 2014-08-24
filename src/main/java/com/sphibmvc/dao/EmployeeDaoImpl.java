package com.sphibmvc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;

import com.sphibmvc.entities.Employee;
import com.sphibmvc.entities.ScfUserInvestor;

class EmployeeDaoImpl implements EmployeeDao {

	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(employee);
	}

	@Override
	public List<Employee> listEmployees() {
		// TODO Auto-generated method stub
		// return
		// sessionFactory.getCurrentSession().createQuery("from Employee").list();
		List<Employee> emps = null;
		try
		{
			Criteria criteria = sessionFactory.getCurrentSession()
					.createCriteria(Employee.class)
					.addOrder(Order.asc("empno"))
					.add(Restrictions.isNotNull("deptno"));
			emps = criteria.list();
			
		} 
		catch (HibernateException e) {
			throw e;
		}
		return emps;
	}

	@Override
	public void deleteEmployee(Integer employeeId) {
		// TODO Auto-generated method stub
		Employee employee = (Employee) sessionFactory.getCurrentSession().load(
				Employee.class, employeeId);
		if (employee != null)
			sessionFactory.getCurrentSession().delete(employeeId);

	}

	@Override
	public List<ScfUserInvestor>  listInvestInPortfolio() {
		ScfUserInvestor scfUserInvestor = null;
		List<ScfUserInvestor> scfUserInvestors=null;
		try {
			Criteria criteria = sessionFactory.getCurrentSession()
					.createCriteria(ScfUserInvestor.class);
			//criteria.createAlias("watchlistInv", "watchlistInv");
			criteria.createCriteria("watchlistInv", Criteria.FULL_JOIN)
			.add(Restrictions.isNull("scfUserInvestor" ));
			
			scfUserInvestors = criteria.list();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return scfUserInvestors;		
	}

}
