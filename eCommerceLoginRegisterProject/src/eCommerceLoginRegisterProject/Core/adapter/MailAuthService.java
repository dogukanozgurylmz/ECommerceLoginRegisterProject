package eCommerceLoginRegisterProject.Core.adapter;

public interface MailAuthService {
	
	void send(String mail);
	boolean verify(String mail);
	
}
