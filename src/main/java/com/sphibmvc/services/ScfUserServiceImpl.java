package com.sphibmvc.services;

import java.util.List;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sphibmvc.dao.ScfUserDao;
import com.sphibmvc.entities.ScfUser;
import com.sphibmvc.entities.ScfUserInvestor;
import com.sphibmvc.model.ScfUserBean;
@Service
@Transactional
public class ScfUserServiceImpl implements ScfUserService {
	
	@Autowired
	private ScfUserDao scfUserDao;

	/*
	
	public ScfUserDao getScfUserDao() {
		return scfUserDao;
	}

	public void setScfUserDao(ScfUserDao scfUserDao) {
		this.scfUserDao = scfUserDao;
	}
	
    */
	@Override
	public List<ScfUser> listScfUsers() {
		return scfUserDao.listScfUser();
	}

	@Override
	public ScfUserBean getScfUser(int scfu_id) {
		// TODO Auto-generated method stub
		ScfUserBean scfUserBean = createScfUserBean( scfUserDao.getScfUser(scfu_id));
		return scfUserBean;
	}

	

	@Override
	public ScfUserInvestor getScfUserInvestor(int scfuinv_id) { 
		return scfUserDao.getInvestor(scfuinv_id);
	}

	@Override
	public List<ScfUserInvestor> listInvestInPortfolio() {
		 
		List<ScfUserInvestor> list = scfUserDao.listInvestInPortfolio();
		System.out.println("in Service Impl = "+list.size());
		return list;
	}

	@Override
	public ScfUser getUserInfo(String scfu_email, String scfu_password) {
		 return scfUserDao.getUserInfo(  scfu_email,   scfu_password);
		 
	}

	@Override
	public Set<ScfUserInvestor> listInvestorPortfolio() {
		// TODO Auto-generated method stub
		return scfUserDao.listInvestorPortfolio();
	}

	@Override
	public List<ScfUserInvestor> listInvestors() {
		// TODO Auto-generated method stub
		return scfUserDao.listInvestors();
	}

	@Override
	public long createScfUser(ScfUserBean scfUserBean) {
		ScfUser scfUserEntity = createScfUserEntity(scfUserBean);
		scfUserDao.createScfUser(scfUserEntity );
		return 0;
	}
	
	private ScfUser createScfUserEntity(ScfUserBean scfUserBean)
	{
		ScfUser scfUser = new ScfUser();
		try 
		{
			scfUser.setScfu_fname(scfUserBean.getScfu_fname());
			scfUser.setScfu_lname(scfUserBean.getScfu_lname());
			scfUser.setScfu_email(scfUserBean.getScfu_email());
			scfUser.setScfu_password(scfUserBean.getScfu_password());
			scfUser.setScfu_email(scfUserBean.getScfu_email());
			scfUser.setScfu_create_date(scfUserBean.getScfuCreateDate());
			scfUser.setScfu_last_update(scfUserBean.getScfuLastUpdate());
			scfUser.setScfu_login_time(scfUserBean.getScfuLoginTime());
			scfUser.setScfu_guid(scfUserBean.getScfuGuid());
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return scfUser;

	}
	
	private ScfUserBean createScfUserBean(ScfUser scfUser) 
	{
		ScfUserBean scfUserBean = new ScfUserBean();
		try
		{
			scfUserBean.setScfuCreateDate(scfUser.getScfu_create_date());
			scfUserBean.setScfuLastUpdate(scfUser.getScfu_last_update());
			scfUserBean.setScfu_fname(scfUser.getScfu_fname());
			scfUserBean.setScfu_lname(scfUser.getScfu_lname());
			scfUserBean.setScfu_email(scfUser.getScfu_email());
			scfUserBean.setScfu_guid(scfUser.getScfu_guid());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return scfUserBean;
	}

	@Override
	public List<ScfUserInvestor> listInvestorsByCountry() {
		// TODO Auto-generated method stub
		return scfUserDao.listInvestorsByCountry();
	}
	 

	 
}
