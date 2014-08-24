package com.sphibmvc.dao;

import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.sql.JoinType;
import org.springframework.aop.ThrowsAdvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sphibmvc.entities.ScfUser;
import com.sphibmvc.entities.ScfUserInvestor;
import com.sphibmvc.entities.ScfUserWatchlistPortfolio;

@Repository
public class ScfUserDaoImpl implements ScfUserDao {

	@Autowired
	private SessionFactory sessionFactory;
/*
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
*/
	public ScfUser getScfUser(int scfu_id) {
		ScfUser scfUser = null;
		try {

			scfUser = (ScfUser) sessionFactory.getCurrentSession().get(
					ScfUser.class, scfu_id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return scfUser;
	}

	@Override
	public List<ScfUser> listScfUser() {
		List<ScfUser> list = null;
		try {
			Criteria criteria = sessionFactory.getCurrentSession()
					.createCriteria(ScfUser.class)
					.addOrder(Order.asc("scfu_fname"))
					.add(Restrictions.isNotNull("scfu_guid"));
			list = criteria.list();

		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<ScfUserInvestor> listInvestors() {
		List<ScfUserInvestor> list = null;
		try {
			Criteria criteria = sessionFactory.getCurrentSession()
					.createCriteria(ScfUserInvestor.class)
					.addOrder(Order.asc("scfuinv_fname"))
					.add(Restrictions.isNotNull("scfuinv_guid")) 
					.createAlias("scfUser","scfUser",JoinType.INNER_JOIN) ;
//					.add(Restrictions.eqProperty("scfUser.scfu_id", "scfuinv_scfu_id"));
			list = criteria.list();
			
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public List<ScfUserInvestor> listInvestorsByCountry() {
		List<ScfUserInvestor> invList = null;
		try 
		{
			Criteria criteria = sessionFactory.getCurrentSession().createCriteria(ScfUserInvestor.class);
			criteria.add(Restrictions.isNotNull("scfu_id"));
			criteria.setProjection(Projections.projectionList().add(Projections.property("scfuinv_fname")));
			criteria.createAlias("scfUser","scfUser",JoinType.LEFT_OUTER_JOIN) ;
			
			invList = criteria.list();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return invList;
	}

	
	@Override
	public ScfUserInvestor getInvestor(int scfuinv_id) {
		ScfUserInvestor scfUserInvestor = null;
		try {
			scfUserInvestor = (ScfUserInvestor) sessionFactory
					.getCurrentSession().get(ScfUserInvestor.class, scfuinv_id);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return scfUserInvestor;
	}
	                              
	public List<ScfUserInvestor> listInvestInPortfolio()
	{
		List<ScfUserInvestor> investors = null;
		try
		{
			System.out.println(" listInvestInPortfolio ");
			Criteria criteria = sessionFactory.getCurrentSession()
					.createCriteria(ScfUserInvestor.class,"investors") ;
//			criteria.createAlias("investors.watchlistInv", "watchlistInv");
			criteria.createCriteria("watchlistInv", Criteria.LEFT_JOIN);
//			.add(Restrictions.isNull("scfUserInvestor" ));
			investors = criteria.list();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return investors;
	}

	@Override
	public ScfUser getUserInfo(String scfu_email, String scfu_password) {
	   ScfUser scfUser = null;
			   try {
				Criteria criteria = sessionFactory.getCurrentSession().createCriteria(ScfUser.class);
				 criteria.add(Restrictions.and(Restrictions.eq("scfu_email", scfu_email),Restrictions.eq("scfu_password", scfu_password)));
				 scfUser = (ScfUser) criteria.uniqueResult();
			} catch (Exception e) {
				// TODO: handle exception
			}
		return scfUser;
	}
	
	public Set<ScfUserInvestor> listInvestorPortfolio()
	{
		Set<ScfUserInvestor> investors = null;
		try {

			Criteria criteria = sessionFactory.getCurrentSession()
					.createCriteria(ScfUserWatchlistPortfolio.class)
					.add(Restrictions.disjunction()
							.add(Restrictions.eq("scfUser", new Integer(68))));
 			criteria.createCriteria("scfUserInvestor", Criteria.LEFT_JOIN); 
 			investors = (Set<ScfUserInvestor>) criteria.list();
			 
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return investors;
	}

	@Override
	public long createScfUser(ScfUser scfUserEntity)
	{
		try{
			sessionFactory.getCurrentSession().save(scfUserEntity);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return scfUserEntity.getScfu_id();
	}
	
	public ScfUser getScfUser(long scfu_id)
	{
		ScfUser scfUser = null;
		try {
				scfUser = (ScfUser) sessionFactory.getCurrentSession().get(ScfUser.class, scfu_id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return scfUser;
	}

}
