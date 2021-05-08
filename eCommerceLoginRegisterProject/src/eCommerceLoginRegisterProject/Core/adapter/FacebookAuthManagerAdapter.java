package eCommerceLoginRegisterProject.Core.adapter;

import eCommerceLoginRegisterProject.facebookAuth.FacebookAuthManager;

public class FacebookAuthManagerAdapter implements MailAuthService {

	@Override
	public void send(String mail) {
		
		FacebookAuthManager facebookAuthManager = new FacebookAuthManager();
		
		facebookAuthManager.send(mail);
		
	}

	@Override
	public boolean verify(String mail) {
		
		boolean result = true;
		if (result) {
			System.out.println(mail + " doðrulandý.");
			return true;
		}else {
			System.out.println("Doðrulanmadý!");
			return false;
		}
		
	}

}
