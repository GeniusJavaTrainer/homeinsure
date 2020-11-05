package com.cg.hims.repository;

import javax.persistence.EntityManager;

import com.cg.hims.entities.AbstractUser;

public class UserRepositoryImpl implements IUserRepository {

	private EntityManager entityManager;
	
	public UserRepositoryImpl() {
		super();
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public AbstractUser addNewUser(AbstractUser user) {
		entityManager.getTransaction().begin();
		entityManager.persist(user);//Inserts record into DB.
		entityManager.getTransaction().commit();
				
		return user;
	}

	@Override
	public AbstractUser signIn(AbstractUser user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AbstractUser signOut(AbstractUser user) {
		// TODO Auto-generated method stub
		return null;
	}

}
