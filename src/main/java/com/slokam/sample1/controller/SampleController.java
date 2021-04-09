package com.slokam.sample1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	
	//http://localhost:3030/calc?v1=12&v2=10
	@GetMapping("calc")
   public Integer calc(Integer v1, Integer v2) {
		Integer c=v1+v2;
		return c;
		}
	//http://localhost:3030/calc1/10/10
	@GetMapping("calc1/{v1}/{v2}")
	public Integer calc1(@PathVariable Integer v1, @PathVariable Integer v2) {
		Integer c=v1+v2;
		return c;
	}
	
	@PostMapping("saveStudent")
	public void saveStudent(@RequestBody Student std) {
		System.out.println(std);
	}
}
