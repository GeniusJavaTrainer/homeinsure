package com.cg.hims.repository;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.hims.entities.Admin;

public class UserRepositoryTest {

	private IUserRepository userRepository = null;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		userRepository = new UserRepositoryImpl();
		
		
	}

	@After
	public void tearDown() throws Exception {
		userRepository = null;
	}

	@Test
	public final void testAddNewUser() {
		Admin admin = new Admin("abc", "pass123", "admin", 1, "abc", "9999999999");
		assertNotNull(userRepository.addNewUser(admin));
	}

	@Test
	public final void testSignIn() {
		fail("Not yet implemented");
	}

	@Test
	public final void testSignOut() {
		fail("Not yet implemented");
	}

}
