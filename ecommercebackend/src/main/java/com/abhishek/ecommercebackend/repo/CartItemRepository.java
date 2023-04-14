package com.abhishek.ecommercebackend.repo;

import com.abhishek.ecommercebackend.model.cart.CartItem;
import com.abhishek.ecommercebackend.model.cart.CartItemPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CartItemRepository extends JpaRepository <CartItem, CartItemPK> {
}
