package eCommerceLoginRegisterProject.Business.concretes;

import java.util.List;

import eCommerceLoginRegisterProject.Business.abstracts.UserService;
import eCommerceLoginRegisterProject.dataAccess.abstracts.UserDao;
import eCommerceLoginRegisterProject.entities.concretes.User;

public class UserManager implements UserService {
	
	UserDao userDao;

	public UserManager(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		
		userDao.add(user);
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
