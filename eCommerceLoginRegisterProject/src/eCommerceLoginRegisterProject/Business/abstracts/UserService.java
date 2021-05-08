package eCommerceLoginRegisterProject.Business.abstracts;

import java.util.List;

import eCommerceLoginRegisterProject.entities.concretes.User;

public interface UserService {

	void add(User user);
	List<User> getAll();
	
}
