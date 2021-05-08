package eCommerceLoginRegisterProject.Business.abstracts;

import eCommerceLoginRegisterProject.entities.concretes.User;

public interface AuthService {
	
	void login(User user);
	void register(User user);
	
}
