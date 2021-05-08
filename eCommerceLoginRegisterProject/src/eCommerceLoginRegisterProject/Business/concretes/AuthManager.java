package eCommerceLoginRegisterProject.Business.concretes;

import eCommerceLoginRegisterProject.Business.abstracts.AuthService;
import eCommerceLoginRegisterProject.Business.abstracts.UserService;
import eCommerceLoginRegisterProject.Business.abstracts.ValidationService;
import eCommerceLoginRegisterProject.Core.adapter.MailAuthService;
import eCommerceLoginRegisterProject.entities.concretes.User;

public class AuthManager implements AuthService {
	
	UserService userService;
	ValidationService validationService;
	MailAuthService mailAuthService;

	public AuthManager(UserService userService, ValidationService validationService, MailAuthService mailAuthService) {
		this.userService = userService;
		this.validationService = validationService;
		this.mailAuthService = mailAuthService;
	}

	@Override
	public void login(User user) {
		
		validationService.isValidLogin(user);
		
	}

	@Override
	public void register(User user) {
		
		if (validationService.isValidRegister(user)) {
			mailAuthService.send(user.getEmail());
			if (mailAuthService.verify(user.getEmail())) {
				userService.add(user);
			}
		}
		
	}

}
