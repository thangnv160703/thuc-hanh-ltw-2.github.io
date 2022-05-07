package thuchanh.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import thuchanh.Product;

@Controller
@RequestMapping("/view")
public class ViewController {
	@ModelAttribute
	public void addProductsToModel(Model model) {
		List<Product> products = new ArrayList<Product>();
		products.add(new Product("8601", "86", "14.95"));
		products.add(new Product("pf01", "Paddlefoot - The first CD", "12.95"));
		
		model.addAttribute("products", products);
	}
	
	@GetMapping
	public String showListProducts() {
		return "viewList";
	}
	
//	@GetMapping("/add")
//	public String addProduct() {
//		return "redirect:/add";
//	}
}
