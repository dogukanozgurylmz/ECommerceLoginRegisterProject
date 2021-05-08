package eCommerceLoginRegisterProject.Business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerceLoginRegisterProject.Business.abstracts.ValidationService;
import eCommerceLoginRegisterProject.entities.concretes.User;

public class UserValidationManager implements ValidationService {
	
	List<String> emailList = new ArrayList<String>();
	List<String> passwordList = new ArrayList<String>();

	@Override
	public boolean isValidRegister(User user) {
		
		var result = checkName(user.getFirstName(), user.getLastName()) && checkPassword(user.getPassword()) 
				&& checkEmailExist(user.getEmail()) && checkEmailFormat(user.getEmail());
		
		if (!result) {
			System.out.println("Kayýt baþarýsýz.");
			return false;
		}else {
			System.out.println("Kayýt baþarýlý.");
			return true;
		}
		
	}
	
	@Override
	public boolean isValidLogin(User user) {
		
		var result = checkPassword(user.getPassword()) && checkEmailExist(user.getPassword());
		if (result) {
			if (emailList.contains(user.getEmail()) && passwordList.contains(user.getPassword())) {
				
				System.out.println("Giriþ baþarýlý.");
				return true;
			}
			else {
				System.out.println("Giriþ baþarýsýz.");
				return false;
			}
		}
		return result;
		
	}
	
	private boolean checkName(String firstName, String lastName) {
		
		if (firstName.length()<2 || lastName.length()<2) {
			
			System.out.println("Ad ve soyad 2 karakterden az olamaz!");
			return false;
			
		}
		return true;
	}
	
	private boolean checkPassword(String password) {
		
		if (password.length()<6) {
			
			System.out.println("Þifre 6 karakterden az olamaz!");
			return false;
			
		}
		passwordList.add(password);
		return true;
	}
	
	private boolean checkEmailExist(String email) {
		
		for (String emailList : emailList) {
			if (email==emailList) {
				System.out.println("Bu e-mail adresi kayýtlý. Lütfen farklý e-mail adresi yazýnýz.");
				return false;
			}
		}
		emailList.add(email);
		return true;
	}
	
	private boolean checkEmailFormat(String email) {
		Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^(.+)@(.+)$", Pattern.CASE_INSENSITIVE);
		Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
		
		if (!matcher.matches()) {
			System.out.println("E-mail adresini kurallara uygun giriniz!");
			return false;
		}
		return true;
	}

}
