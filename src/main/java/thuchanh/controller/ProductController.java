package thuchanh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/add")
public class ProductController {
	@GetMapping
	public String addProduct() {
		return "addProduct";
	}
	
	@PostMapping
	public String updateProduct(Model model) {
		//save
		return "redirect:/";
	}
}
