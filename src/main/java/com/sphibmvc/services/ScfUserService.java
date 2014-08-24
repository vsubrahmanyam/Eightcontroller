package com.sphibmvc.services;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.sphibmvc.entities.ScfUser;
import com.sphibmvc.entities.ScfUserInvestor;
import com.sphibmvc.model.ScfUserBean;

@Service		
public interface ScfUserService {

	public List<ScfUser> listScfUsers();
	public ScfUserBean getScfUser(int scfu_id);
	public ScfUserInvestor getScfUserInvestor(int scfu_id);
	public List<ScfUserInvestor> listInvestInPortfolio();
	public ScfUser getUserInfo(String scfu_email,String scfu_password);
	public Set<ScfUserInvestor> listInvestorPortfolio();
	List<ScfUserInvestor> listInvestors();
	public long createScfUser(ScfUserBean scfUserBean);
	public List<ScfUserInvestor> listInvestorsByCountry();


}
