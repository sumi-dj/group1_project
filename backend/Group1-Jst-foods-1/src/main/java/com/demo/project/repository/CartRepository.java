package com.demo.project.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.project.entities.Cart;
import com.demo.project.entities.Customer;

import feign.Param;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer>
{

	//@Query("from Cart c where c.customer=:cid")
	//@Query("select me.name, me.picture, cus.id, cus.name from cart as car join" +
	//		" menu me on car.id = me.id join customer cus on car.id=:cid")
	
			//@Query("from Cart car, Customer cus, Menu men where car.customer = cus.id and car.menu = men.id and cus.id =:cid")
			//List<Cart> findCartByCid(@Param("cid") Integer cid);
			
			@Query(value = "SELECT * FROM cart,customer,menu WHERE cart.customer_id = customer.id AND cart.menu_id = menu.id AND customer.id = ?1", nativeQuery = true)
			List<Cart> findCartByCid(Integer cid); 
			//User findByEmailAddress(String emailAddress);
	
	
	/*
	 * select me.name, me.picture, cus.id, cus.name from jst.cart as car join
	 * jst.menu me on car.menu_id = me.id join jst.customer cus on car.customer_id =
	 * cus.id;
	 */
}
