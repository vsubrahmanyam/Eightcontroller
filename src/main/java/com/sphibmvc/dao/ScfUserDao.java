package com.sphibmvc.dao;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Repository;

import com.sphibmvc.entities.ScfUser;
import com.sphibmvc.entities.ScfUserInvestor;
@Repository
public interface ScfUserDao 
{
	public List<ScfUser> listScfUser();
	public ScfUser getScfUser(int scfu_id);
	public ScfUserInvestor getInvestor(int scfuinv_id);
	public List<ScfUserInvestor> listInvestInPortfolio();
	public ScfUser getUserInfo(String scfu_email, String scfu_password);
	public Set<ScfUserInvestor> listInvestorPortfolio();
	public List<ScfUserInvestor> listInvestors();
	public long createScfUser(ScfUser scfUserEntity);
	public ScfUser getScfUser(long scfu_id);
	public List<ScfUserInvestor> listInvestorsByCountry() ;

}
