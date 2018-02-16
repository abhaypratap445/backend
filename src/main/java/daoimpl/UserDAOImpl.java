package daoimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Role;
import model.ShippingAddress;
importmodel.User;
@Repository
public class UserDAOImpl implements UserDAO{
	@Autowired
	private SessionFactory sessionFactory;
	public void saveUser(User user) {
		Session session= sessionFactory.getCurrentSession();
		Role role=new Role();
		role.setRole("ROLE_USER");
		role.setUserName(user.getUserName());
		session.saveOrUpdate(role);
		ShippingAddress shippingAddress=new ShippingAddress();
		shippingAddress.setUserName(user.getUserName());
		shippingAddress.setShippingAddress(user.getAddress());
		shippingAddress.setZipcode(user.getZipcode());
		shippingAddress.setContact(user.getContact());
		session.saveOrUpdate(shippingAddress);
		session.saveOrUpdate(user);
	}
	
/*	public User validateUsername(String username) {
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from User where username=?");
		query.setString(0,username);
		User user=(User)query.uniqueResult();
		return user;
	}
	public Customer validateEmail(String email) {
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from Customer where email=?");
		query.setString(0,email);
		Customer customer=(Customer)query.uniqueResult();
		return customer;
}*/

}