package eCommerceLoginRegisterProject.Business.abstracts;

import eCommerceLoginRegisterProject.entities.concretes.User;

public interface ValidationService {

	boolean isValidRegister(User user);
	boolean isValidLogin( User user);
	
}
