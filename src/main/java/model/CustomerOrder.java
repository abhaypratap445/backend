package model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class CustomerOrder {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int orderId;
	private String user;
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	@OneToMany(fetch=FetchType.EAGER)
	private List<Cart> cartitems;
	
	@OneToOne
	@JoinColumn(name="shipping_id")
	private ShippingAddress shipping;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	
	public List<Cart> getCartitems() {
		return cartitems;
	}

	public void setCartitems(List<Cart> cartitems) {
		this.cartitems = cartitems;
	}

	public ShippingAddress getShipping() {
		return shipping;
	}

	public void setShipping(ShippingAddress shipping) {
		this.shipping = shipping;
	}
	

	
}