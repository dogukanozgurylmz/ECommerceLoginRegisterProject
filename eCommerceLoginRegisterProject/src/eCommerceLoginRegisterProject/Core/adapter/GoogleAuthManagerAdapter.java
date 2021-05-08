package eCommerceLoginRegisterProject.Core.adapter;

import eCommerceLoginRegisterProject.googleAuth.GoogleAuthManager;

public class GoogleAuthManagerAdapter implements MailAuthService {

	@Override
	public void send(String mail) {

		GoogleAuthManager googleAuthManager = new GoogleAuthManager();
		
		googleAuthManager.send(mail);
		
	}

	@Override
	public boolean verify(String mail) {
		
		boolean result = true;
		if (result) {
			System.out.println(mail + " do�ruland�.");
			return true;
		}else {
			System.out.println("Do�rulanmad�!");
			return false;
		}
		
	}

}
