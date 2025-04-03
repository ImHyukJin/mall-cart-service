package com.dmall.cartservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dmall.cartservice.model.Cart;
import com.dmall.cartservice.repository.CartRepository;

@RestController
@RequestMapping("/api/cart")
public class CartApiController {
	
	@Autowired
	private CartRepository cartRepository ;
	
	 // 장바구니 추가
    @PostMapping
    public String addToCart(@RequestBody Cart cart) {
        Cart savedCart = cartRepository.save(cart); // JPA 저장
        return "장바구니에 추가됨! ID: " + savedCart.getCartId();
    }

    // 장바구니 목록 조회
    @GetMapping
    public List<Cart> getAllCarts() {
        return cartRepository.findAll(); // JPA 조회
    }
}
