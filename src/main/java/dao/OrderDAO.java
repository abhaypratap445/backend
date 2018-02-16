package dao;

import java.util.List;

import model.Cart;
import model.CustomerOrder;

public interface OrderDAO {

	public CustomerOrder list(String username);
	public void saveOrder(CustomerOrder order);
	void removeallorderitem(String username);
	
}