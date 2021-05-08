package eCommerceLoginRegisterProject.dataAccess.abstracts;

import java.util.List;

import eCommerceLoginRegisterProject.entities.concretes.User;

public interface UserDao {

	void add(User user);
	List<User> getAll();
	
}
