package com.sprhibmvc.tests;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.sphibmvc.dao.ScfUserDao;
import com.sphibmvc.entities.ScfUser;
import com.sphibmvc.entities.ScfUserInvestor;
import com.sphibmvc.services.ScfUserService;
import com.sprhibmvc.tests.fixtures.ScfuserFixture;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:test-appContext.xml" })
@Transactional
public class ScfUserServiceImplTest {

	@Autowired
	private ScfUserService scfUserService;

	@Autowired
	private ScfUserDao scfUserDao;
	private ScfUser scfUser;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

	}

	@Before
	public void prepareData() {
		scfUser = ScfuserFixture.createScfUser();
	}

	/* @Test */
	public void saveScfUser() {
		System.out.println("In saveScfUser() ");
		scfUserDao.createScfUser(scfUser);
		scfUserDao.getScfUser(scfUser.getScfu_id());
		Assert.assertNotNull("ScfUser Created", scfUser);
	}

	/* @Test */
	public void testListScfUsers() {
		assertEquals(this.getClass().getName(), 0, 0);
		System.out.println("In testListScfuUSer");
		List<ScfUser> listScfUsers = scfUserService.listScfUsers();
		System.out.println("In testListScfuUSer");
		System.out.println("Size testListScfuUSer" + listScfUsers.size());

		for (ScfUser scfUser : listScfUsers) {
			System.out.println(scfUser.getScfu_guid());
			System.out.println(scfUser.getScfu_fname());
			System.out.println(scfUser.getScfu_lname());
		}
	}

	@Test
	public void testListInvestors() {
		assertEquals(this.getClass().getName(), 0, 0);
		System.out.println("In testListInvestors");
		List<ScfUserInvestor> listScfUsers = scfUserService.listInvestors();
		System.out.println("In testListInvestors");
		System.out.println("Size testListInvestors" + listScfUsers.size());
		for (ScfUserInvestor scfUserInvestor : listScfUsers) {
			System.out.println(scfUserInvestor.getScfuinv_guid());
			System.out.println(scfUserInvestor.getScfuinv_id());
			System.out.println(scfUserInvestor.getScfuinv_dc_id().getDc_name());

		}
	}

	// @Test
	public void testListInvInPortfolio() {
		List<ScfUserInvestor> listInvestInPortfolio = scfUserService
				.listInvestInPortfolio();
		System.out.println(listInvestInPortfolio.size());
	}

//	 @Test
	public void testListInvInByCountry() 
	{
		List<ScfUserInvestor> listInvest= scfUserService
				.listInvestorsByCountry();
		System.out.println(listInvest.size());
	}

}
