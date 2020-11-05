package com.cg.hims.repository;

import com.cg.hims.entities.AbstractUser;

public interface IUserRepository {
	public AbstractUser addNewUser(AbstractUser user);

	public AbstractUser signIn(AbstractUser user);

	public AbstractUser signOut(AbstractUser user);
}
