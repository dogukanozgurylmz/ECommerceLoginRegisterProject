package eCommerceLoginRegisterProject.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerceLoginRegisterProject.dataAccess.abstracts.UserDao;
import eCommerceLoginRegisterProject.entities.concretes.User;

public class HibernateUserDao implements UserDao {
	
	List<User> users = new ArrayList<User>();

	@Override
	public void add(User user) {
		
		users.add(user);
		System.out.println("Hibernate ile eklendi: " + user.getFirstName());
		
	}

	@Override
	public List<User> getAll() {
		
		return users;
		
	}

}
