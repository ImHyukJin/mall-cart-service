package com.dmall.cartservice.controller;

import java.util.Map;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.dmall.cartservice.repository.CartRepository;

public class CartApiController {
	
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
		return ResponseEntity.ok(responseData);
	}
	  
	@GetMapping("/env")
	public ResponseEntity<?> getEnv() {
		return ResponseEntity.ok(env);
	}
}
