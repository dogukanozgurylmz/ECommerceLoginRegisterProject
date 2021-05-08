package eCommerceLoginRegisterProject;

import eCommerceLoginRegisterProject.Business.abstracts.AuthService;
import eCommerceLoginRegisterProject.Business.abstracts.UserService;
import eCommerceLoginRegisterProject.Business.concretes.AuthManager;
import eCommerceLoginRegisterProject.Business.concretes.UserManager;
import eCommerceLoginRegisterProject.Business.concretes.UserValidationManager;
import eCommerceLoginRegisterProject.Core.adapter.FacebookAuthManagerAdapter;
import eCommerceLoginRegisterProject.dataAccess.concretes.HibernateUserDao;
import eCommerceLoginRegisterProject.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		UserService userService = new UserManager(new HibernateUserDao());
		AuthService authService = new AuthManager(userService, new UserValidationManager(), new FacebookAuthManagerAdapter());
		
		User user1 = new User(1, "Doðukan", "Yýlmaz", "dogukan@gmail.com", "123456");
		User user2 = new User(2, "Özgür", "Yýlmaz", "ozgur@gmail.com", "123456");
		
		authService.register(user1);
		System.out.println("-----------------------------------------");
		authService.register(user2);
		System.out.println("-----------------------------------------");
		authService.login(user2);
		
	}

}
