package com.cg.hims.service;

import com.cg.hims.entities.AbstractUser;

public interface IUserService {
	public AbstractUser addNewUser(AbstractUser user);

	public AbstractUser signIn(AbstractUser user);

	public AbstractUser signOut(AbstractUser user);
}
