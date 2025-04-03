package com.dmall.cartservice.controller;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dmall.cartservice.model.Cart;
import com.dmall.cartservice.repository.CartRepository;

@RestController
@RequestMapping("/cart")
public class HealthCheckController {

	@Autowired
	private CartRepository cartRepository ;
	
	@Value("${server.env}")
	private String env;
	@Value("${server.port}")
	private String serverPort;
	@Value("${server.address}")
	private String serverAddress;
	@Value("${serverName}")
	private String serverName;
	
	//서버가 잘 돌아가나
	@GetMapping("/hc")
	public ResponseEntity<?> healthCheck() {
		Map<String, String> responseData = new TreeMap<>();
		responseData.put("env", env);
		responseData.put("serverPort", serverPort);
		responseData.put("serverAddress", serverAddress);
		responseData.put("serverName", serverName);
		responseData.put("TEST", "TEST 성공");
		return ResponseEntity.ok(responseData);
	}
	
	@GetMapping("/env")
	public ResponseEntity<?> getEnv() {
		return ResponseEntity.ok(env);
	}
	 // 장바구니 추가
    @PostMapping("/")
    public String addToCart(@RequestBody Cart cart) {
        Cart savedCart = cartRepository.save(cart); // JPA 저장
        return "장바구니에 추가됨! ID: " + savedCart.getCartId();
    }

    // 장바구니 목록 조회
    @GetMapping("/")
    public List<Cart> getAllCarts() {
        return cartRepository.findAll(); // JPA 조회
    }
}
