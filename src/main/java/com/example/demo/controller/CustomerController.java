package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.domain.Customer;
import com.example.demo.service.CustomerService;

@Controller
@RequestMapping("customer")
public class CustomerController {

/*	@Autowired
	private CustomerService service;
	
	@GetMapping
	public String get(Model model) {
		model.addAttribute("list", service.getAllCustomers());
		model.addAttribute("customer",new Customer());
		return "top";
	}
	
	@PostMapping(path = "create")
	public String create(@Validated Customer customer, BindingResult result, Model model){
		
		//登録
		service.addCustomer(customer);
		
		//入力内容初期化
		//model.addAttribute("customer",new Customer());
		
		//顧客リストの再取得
		model.addAttribute("list", service.getAllCustomers());
		return "top";
	}
		
	@PostMapping(path = "delete")
	public String delete(@RequestParam Integer id,Model model){
		
		//登録
		service.deleteCustomer(id);
		
		//入力内容初期化	
		model.addAttribute("customer",new Customer());
		
		//顧客リストの再取得
		model.addAttribute("list", service.getAllCustomers());
		return "top";
	}*/
}

