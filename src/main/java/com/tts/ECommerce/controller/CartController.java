package com.tts.ECommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CartController {

	 @GetMapping("/cart")
     public String main() {
         return "cart";
     }
	
}
