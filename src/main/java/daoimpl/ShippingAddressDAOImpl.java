package daoimpl;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.ShippingAddress;

@Repository
public class ShippingAddressDAOImpl implements ShippingAddressDAO{
	@Autowired
	private SessionFactory sessionFactory;
	public void saveShippingAddress(ShippingAddress shippingAddress) {
	
	Session session= sessionFactory.getCurrentSession();
		session.saveOrUpdate(shippingAddress);
	}
	public void delete(int shippingAddressId) {
		// TODO Auto-generated method stub
		ShippingAddress shippingAddressToDelete = new ShippingAddress();
		shippingAddressToDelete.setShippingAddressId(shippingAddressId);
        sessionFactory.getCurrentSession().delete(shippingAddressToDelete);

	}
	public ShippingAddress getById(int shippingAddressId) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
        String hql = "from ShippingAddress where shippingAddressId = '"+ shippingAddressId+"'";
        Query query = session.createQuery(hql);
        List<ShippingAddress> shippingAddresses = query.list();
        if(shippingAddresses != null && !shippingAddresses.isEmpty()){
            return shippingAddresses.get(0);
        }
       
        return null;
		
	}
	public List<ShippingAddress> list(String username) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from ShippingAddress where userName=?");
        query.setString(0, username);
        List<ShippingAddress> shippingAddresses = query.list();
        return shippingAddresses;
		
	}
	
	

}